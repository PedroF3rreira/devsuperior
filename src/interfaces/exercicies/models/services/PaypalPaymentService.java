package interfaces.exercicies.models.services;

public class PaypalPaymentService implements OnlinePaymentService {
	private static final double FREE_PERCENT = 0.01;
	private static final double MONTHLY_INTEREST = 0.02;
	
	@Override
	public double paymentFree(double amount) {
		
		return amount * FREE_PERCENT;
	}

	@Override
	public double interest(double amount, int months) {
		return amount * MONTHLY_INTEREST * months;
	}

}
