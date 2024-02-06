package Ex04;

import java.math.BigDecimal;

public class Staff extends Employee{
	 private String departmentName;
	private DepartmentManager departmentManager;

	public Staff(String fullName, String dateOfBirth, BigDecimal salaryCoefficient, String departmentName, DepartmentManager departmentManager) {
	        super(fullName, dateOfBirth, salaryCoefficient, BigDecimal.ZERO);
	        this.departmentName = departmentName;
	        this.departmentManager = departmentManager;
	    }

	    // Override method to calculate salary
	    @Override
	    public BigDecimal calculateSalary() {
	        return salaryCoefficient.multiply(new BigDecimal("1250000"));
	    }

	    // Get the Department Manager
	    public DepartmentManager getDepartmentManager() {
	        return departmentManager;
	    }
	}