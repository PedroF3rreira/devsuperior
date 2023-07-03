package methods.defaults.interfaces;

public interface InterestService {
	public double getInterestRate();
	
	default double payment(double amount, int months) {
		if(months < 1) {
			throw new IllegalArgumentException("months must be greater than zero");
		}
		
		return amount * Math.pow(1.0 + getInterestRate() / 100.0, months);
	}
}
