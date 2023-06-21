package devsuperior.entities;

public final class BussinessAccount extends Account{
	private Double limit;
	
	
	public BussinessAccount(Integer number, String holder, Double balence, double limit) {
		super(number, holder, balence);
		this.limit = limit;
		
	}

	public Double getLimit() {
		return limit;
	}


	public void setLimit(Double limit) {
		this.limit = limit;
	}
	
	@Override
	public void withdraw(double value) {
		if(value <= this.limit) {
			super.withdraw(value);
		}
	}
	
	public final void loan(double value) {
		if(value > 0 && value <= this.limit) {
			this.balence += value;
		}
	}
}
