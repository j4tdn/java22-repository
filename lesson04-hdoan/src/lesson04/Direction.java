package lesson04;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Direction extends Personnel {

	public Direction(String name, LocalDate year, BigDecimal cSalary, BigDecimal cPosition) {
		super(name, year, cSalary, cPosition);
	}

	@Override
	protected BigDecimal calcSalary() {
		return (super.cSalary.add(super.cPosition)).multiply(new BigDecimal("3000000"));
	}

}
