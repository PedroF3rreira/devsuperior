package interfaces.exercicies.models.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Installments {
	private LocalDate dueDate;
	private Double amount;
	
	public Installments(LocalDate dueDate, Double amount) {	
		this.dueDate = dueDate;
		this.amount = amount;
	}
	
	@Override
	public String toString() {
		return "Parcela: "+dueDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))+" Valor: "+ Math.ceil(amount);
	}
	
}
