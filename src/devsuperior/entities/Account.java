package devsuperior.entities;

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
	
	public void withdraw(double value) {
		if(value > 0 && value <= this.balence) {
			this.balence -= value;
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
