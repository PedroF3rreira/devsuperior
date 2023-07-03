package hashset;


import java.util.Date;
import java.util.Objects;

public class LogUser implements Comparable<LogUser>{
	private String name;
	private Date instant;
	
	public LogUser(String name, Date instant) {
	
		this.name = name;
		this.instant = instant;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getInstant() {
		return instant;
	}

	public void setInstant(Date instant) {
		this.instant = instant;
	}

	@Override
	public int compareTo(LogUser o) {
		return this.name.compareTo(o.getName());
	}

}
