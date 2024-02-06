package Ex04;

import java.math.BigDecimal;

public class Director extends Employee {

	public Director(String fullName, String dateOfBirth, BigDecimal salaryCoefficient, BigDecimal positionCoefficient) {
		super(fullName, dateOfBirth, salaryCoefficient, positionCoefficient);
	}
	
	@Override
	public BigDecimal calculateSalary() {
		return salaryCoefficient.add(positionCoefficient).multiply(new BigDecimal("3000000"));
	}
	
	
	
}
