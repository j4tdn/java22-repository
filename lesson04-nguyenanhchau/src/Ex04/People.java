package Ex04;

import java.math.BigDecimal;

public class People {
	private String name;
	private String date;
	private BigDecimal coeffSalary;
	public People() {}
	public People(String name, String date, BigDecimal coeffSalary) {
		this.name = name;
		this.date = date;
		this.coeffSalary = coeffSalary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public BigDecimal getCoeffSalary() {
		return coeffSalary;
	}
	public void setCoeffSalary(BigDecimal coeffSalary) {
		this.coeffSalary = coeffSalary;
	}
	@Override
	public String toString() {
		return "People [name=" + name + ", date=" + date + ", coeffSalary=" + coeffSalary + "]";
	}
	
	
	
	
	
	

}
