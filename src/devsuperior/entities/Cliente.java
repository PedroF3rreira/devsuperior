package devsuperior.entities;

import java.util.Date;

public class Cliente {
	private String name;
	private String email;
	private Date birthDay;
	
	public Cliente(String name, String email, Date birthday) {
		this.name = name;
		this.email = email;
		this.birthDay = birthday;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}
	
	
}
