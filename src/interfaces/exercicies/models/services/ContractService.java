package interfaces.exercicies.models.services;

import java.time.LocalDate;

import interfaces.exercicies.models.entities.Contract;
import interfaces.exercicies.models.entities.Installments;

public class ContractService {
	
	private OnlinePaymentService onlinePayment;
	
	public ContractService(OnlinePaymentService onlinePayment) {
		this.onlinePayment = onlinePayment;
	}


	public void processContract(Contract contract, int months) {
		
		double basicQuote = contract.getTotalValue() / months;
		
		for(int i = 1;i<= months; i++) {
			LocalDate dueDate = contract.getContractDate().plusMonths(i);
			double interest = this.onlinePayment.interest(basicQuote, i);
			double free = this.onlinePayment.paymentFree(basicQuote + interest);
			double quote = basicQuote + interest + free;
			contract.getInstallments().add(new Installments(dueDate, quote));
		}
	}
}
