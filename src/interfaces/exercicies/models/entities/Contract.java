package interfaces.exercicies.models.entities;

import java.util.ArrayList;
import java.time.LocalDate;
import java.util.List;

public class Contract {
	private Integer numberContract;
	private LocalDate contractDate;
	private Double totalValue;
	
	private List<Installments> installments = new ArrayList<>();
	
	public Contract(Integer numberContract, LocalDate contratDate, Double value) {
		this.numberContract = numberContract;
		this.contractDate = contratDate;
		this.totalValue = value;
	}

	public List<Installments> getInstallments() {
		return installments;
	}

	public Integer getNumberContract() {
		return numberContract;
	}

	public void setNumberContract(Integer numberContract) {
		this.numberContract = numberContract;
	}

	public LocalDate getContractDate() {
		return contractDate;
	}

	public void setContractDate(LocalDate contratDate) {
		this.contractDate = contratDate;
	}

	public Double getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(Double totalValue) {
		this.totalValue = totalValue;
	}
	
	
	
}
