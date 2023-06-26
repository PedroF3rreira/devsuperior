package interfaces.services;

public class TaxService implements TaxServiceContract{
	@Override
	public double getTax(double amount) {
		if (amount <= 100) { 
			return amount * 0.20;
		}
		else {
			return amount * 0.15;
		}
	}
}
