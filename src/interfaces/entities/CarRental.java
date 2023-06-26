package interfaces.entities;

import java.util.Date;

public class CarRental {
	private Date startDate;
	private Date finishDate;
	
	private Car car;
	private Invoice invoice;
	
	public CarRental(Date startDate, Date finishDate, Car car) {
		this.startDate = startDate;
		this.finishDate = finishDate;
		this.car = car;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getFinishDate() {
		return finishDate;
	}

	public void setFinishDate(Date finishDate) {
		this.finishDate = finishDate;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public Invoice getInvoice() {
		return invoice;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}
	
	
	
}
