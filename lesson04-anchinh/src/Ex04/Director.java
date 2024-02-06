package Ex04;

import java.math.BigDecimal;

public class Director {
	private String name;
	private String date;
	private BigDecimal salary;
	private BigDecimal position;
	
	public Director() {
	}

	public Director(String name, String date, BigDecimal salary) {
		this.name = name;
		this.date = date;
		this.salary = salary;
	}
	
	public Director(String name, String date, BigDecimal salary, BigDecimal position) {
		this.name = name;
		this.date = date;
		this.salary = salary;
		this.position = position;
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

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	public BigDecimal getPosition() {
		return position;
	}

	public void setPosition(BigDecimal position) {
		this.position = position;
	}

	@Override
	public String toString() {
		return "Director [name=" + name + ", Date=" + date + ", salary=" + salary + ", position=" + position + "]";
	}

	public BigDecimal calculateSalary() {
		return (getSalary().add(getPosition())).multiply(new BigDecimal(3000000));
		
	}
	
}
