package devsuperior.entities;

public class SavingsAccount extends Account {
	private Double interestRate;
	
	public SavingsAccount(Integer number, String holder, Double balence, double interestRate) {
		super(number, holder, balence);
		this.interestRate = interestRate;
	}
	
	public void updateBalence() {
		this.balence += this.interestRate / 100 * this.balence;
	}

	public Double getInterestRate() {
		return interestRate;
	}
	
	
}
