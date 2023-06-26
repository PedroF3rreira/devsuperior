package interfaces.services;

import interfaces.entities.CarRental;
import interfaces.entities.Invoice;

public class RentalService {
	private Double pricePerHour;
	private Double pricePerDay;
	private TaxServiceContract taxService;
	
	public RentalService(Double pricePerHour, Double pricePerDay, TaxServiceContract taxService) {
		this.pricePerHour = pricePerHour;
		this.pricePerDay = pricePerDay;
		this.taxService = taxService;
	}
	
	public Double getPricePerHour() {
		return pricePerHour;
	}
	public void setPricePerHour(Double pricePerHour) {
		this.pricePerHour = pricePerHour;
	}
	public Double getPricePerDay() {
		return pricePerDay;
	}
	public void setPricePerDay(Double pricePerDay) {
		this.pricePerDay = pricePerDay;
	}
	
	public void processInvoice(CarRental carRental) {
		long start = carRental.getStartDate().getTime();
		long finish = carRental.getFinishDate().getTime();
		
		double hour = (double) Math.ceil(finish - start) / 1000 / 60 / 60;
		double basicPayment;
		if(hour <= 12.0) {
			
			basicPayment = hour * this.pricePerHour;
		}
		else {
			double day = Math.ceil(hour) / 24;
			basicPayment = day * this.pricePerDay;
		}
		double tax = taxService.getTax(basicPayment);
		
		carRental.setInvoice(new Invoice(basicPayment, tax));
	}
	
}
