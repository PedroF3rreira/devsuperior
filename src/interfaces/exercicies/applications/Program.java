package interfaces.exercicies.applications;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import interfaces.exercicies.models.entities.Contract;
import interfaces.exercicies.models.entities.Installments;
import interfaces.exercicies.models.services.ContractService;
import interfaces.exercicies.models.services.PaypalPaymentService;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter contract data:");
		System.out.print("Number:");
		int numberContract = sc.nextInt();
		
		System.out.print("Date:");
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dateContract = LocalDate.parse(sc.next(), format); 
		
		System.out.print("Total value:");
		double totalValue = sc.nextDouble();
		
		Contract contract = new Contract(numberContract, dateContract, totalValue);
		
		System.out.print("Enter number of installments:");
		int installments = sc.nextInt();
		
		ContractService contractService = new ContractService(new PaypalPaymentService());
		contractService.processContract(contract, installments);
		
		System.out.println("Resume:");
		System.out.printf("Contract number: %s \n", contract.getNumberContract());
		System.out.println("Installments:");
		
		for (Installments installment : contract.getInstallments()) {
			System.out.println(installment.toString());
		}
		
		sc.close();

	}

}
