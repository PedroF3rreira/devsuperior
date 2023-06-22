package devsuperior.exception.models.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import devsuperior.exception.DomainException;

public class Reservation {
	private Integer roomNunber;
	private Date checkin;
	private Date checkout;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private static Date date = new Date();

	public Reservation(Integer roomNunber, Date checkin, Date checkout) throws DomainException {
		if(!checkout.after(checkin)) {
			throw new DomainException("A data de checkout tem de ser maio qua de checkin");
		}
		this.roomNunber = roomNunber;
		this.checkin = checkin;
		this.checkout = checkout;
	}

	public Integer getRoomNunber() {
		return roomNunber;
	}

	public void setRoomNunber(Integer roomNunber) {
		this.roomNunber = roomNunber;
	}

	public Date getCheckin() {
		return checkin;
	}

	public Date getCheckout() {
		return checkout;
	}
	
	public long duration() {
		long diff = this.checkout.getTime() - this.checkin.getTime();
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);  
	}
	
	public void updateDates(Date checkin, Date checkout) throws DomainException {
		if(checkin.before(date) || checkout.before(date)) {
			throw new DomainException("A data tem que ser futura");
		}
		if(!checkout.after(checkin)) {
			throw new DomainException("A data de checkout tem de ser maio qua de checkin");
		}
		
		this.checkin = checkin;
		this.checkout = checkout;
	
	}
	
	public String toString() {
		
		return "Number: "+ this.roomNunber 
				+", Check-in:" 
				+ sdf.format(checkin)+", Check-out: "
				+ sdf.format(checkout) 
				+ "Duração: "+this.duration()+" dias";
	}
}
