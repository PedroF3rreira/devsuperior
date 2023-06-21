package devsuperior.entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import devsuperior.entities.enums.WorkerLevel;

public class Worker {
	private String name;
	private WorkerLevel level;
	private Double baseSalary;
	private List<HourContract> contracts = new ArrayList<>();
	private Departament departament;
	
	public Worker(String name, WorkerLevel level, Double baseSalary, Departament departament) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.departament = departament;
	}
	
	public void addContract(HourContract contract) {
		if(contract != null && contract instanceof HourContract) {
			this.contracts.add(contract);	
		}
	}
	
	public void removeContract(HourContract contract) {
		this.contracts.remove(contract);
	}
	
	public Double income(int year, int month) {
		Calendar cal = Calendar.getInstance();
		double sum = this.baseSalary;
		
		for(HourContract item : this.contracts) {
			cal.setTime(item.getDate());
			
			int c_year = cal.get(Calendar.YEAR);
			int c_month = cal.get(Calendar.MONTH);
	
			if(c_year == year && c_month == --month) {
				sum += item.totalValue();
			}
		}
		return sum;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public WorkerLevel getLevel() {
		return level;
	}
	public void setLevel(WorkerLevel level) {
		this.level = level;
	}
	public Double getBaseSalary() {
		return baseSalary;
	}
	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}
	
	
}
