package interfaces.services;

public class UsaTaxService implements TaxServiceContract {

	@Override
	public double getTax(double amount) {
		if (amount <= 100) { 
			return amount * 0.10;
		}
		else {
			return amount * 0.5;
		}
	}

}
