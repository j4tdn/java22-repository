package lesson04;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Personnel {

	protected String name;
	protected LocalDate year;
	protected BigDecimal cSalary;
	protected BigDecimal cPosition;

	public Personnel() {
		// TODO Auto-generated constructor stub
	}

	public Personnel(String name, LocalDate year, BigDecimal cSalary, BigDecimal cPosition) {
		this.name = name;
		this.year = year;
		this.cSalary = cSalary;
		this.cPosition = cPosition;
	}

	protected BigDecimal calcSalary() {
		return (cSalary.add(cPosition)).multiply(new BigDecimal("1250000"));
	}
}
