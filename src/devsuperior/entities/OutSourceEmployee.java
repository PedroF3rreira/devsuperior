package devsuperior.entities;

public class OutSourceEmployee extends Employee {
	private Double additionalCharge;
	
	public OutSourceEmployee(String name, Integer hour, Double valuePerHour, double additionalCharge) {
		super(name, hour, valuePerHour);
		this.additionalCharge = additionalCharge;
	}
	
	@Override
	public Double payment() {
		return super.payment() +  this.additionalCharge;
	} 
}
