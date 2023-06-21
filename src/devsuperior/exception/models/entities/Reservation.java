package devsuperior.exception.models.entities;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
	private Integer roomNunber;
	private Date checkin;
	private Date checkout;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private static Date date = new Date();

	public Reservation(Integer roomNunber, Date checkin, Date checkout) {
		this.roomNunber = roomNunber;
		this.updateDates(checkin, checkout);
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
	
	public void updateDates(Date checkin, Date checkout) {
		if(checkin.before(date) || checkout.before(date)) {
			throw new IllegalArgumentException("A data tem que ser futura");
		}
		if(!checkout.after(checkin)) {
			throw new IllegalArgumentException("A data de checkout tem de ser maio qua de checkin");
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
