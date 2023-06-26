package interfaces.exercicies.models.services;

public interface OnlinePaymentService {
	
	public double paymentFree(double amount);
	public double interest(double amount, int months);
}
