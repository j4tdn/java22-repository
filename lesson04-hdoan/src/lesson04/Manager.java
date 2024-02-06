package lesson04;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Manager extends Personnel {
	protected String unitName;

	public Manager(String name, LocalDate year, BigDecimal cSalary, BigDecimal cPosition, String unitName) {
		super(name, year, cSalary, cPosition);
		this.unitName = unitName;
	}

	@Override
	protected BigDecimal calcSalary() {
		return (super.cSalary.add(super.cPosition)).multiply(new BigDecimal("2200000"));
	}
}
