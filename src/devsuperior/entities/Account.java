package devsuperior.entities;

import devsuperior.exception.*;

public class Account {
	private Integer number;
	private String holder;
	protected Double balence;
	
	public Account(Integer number, String holder, Double balence) {
		this.number = number;
		this.holder = holder;
		this.balence = balence;
	}
	
	public void deposit(double value) {
		if(value > 0) {
			this.balence += value;
		}
	}
	
	public void withdraw(double value) throws DomainException {
		if(value > 0 && value <= this.balence) {
			this.balence -= value;
		}
		else {
			throw new DomainException("O valor tem que ser maior que zero e menor que o saldo");
		}
		
	}
	
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	public Integer getNumber() {
		return number;
	}
	public Double getBalence() {
		return balence;
	}
	
	
}
