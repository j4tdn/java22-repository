package Ex04;

import java.math.BigDecimal;

public class DepartmentManager extends Employee {
	
	private String departmentName;

	public DepartmentManager(String fullName, String dateOfBirth, BigDecimal salaryCoefficient,
			BigDecimal positionCoefficient, String departmentName) {
		super(fullName, dateOfBirth, salaryCoefficient, positionCoefficient);
		this.departmentName = departmentName;
	}
	
	@Override
	public BigDecimal calculateSalary() {
		return salaryCoefficient.add(positionCoefficient).multiply(new BigDecimal("2200000"));
	}


}
