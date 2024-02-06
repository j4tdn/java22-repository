package Ex04;

import java.math.BigDecimal;

public class Employee {
	
	 protected String fullName;
	 protected String dateOfBirth;
	 protected BigDecimal salaryCoefficient;
	 protected BigDecimal positionCoefficient;
	 
	 public Employee(String fullName, String dateOfBirth, BigDecimal salaryCoefficient, BigDecimal positionCoefficient) {
		this.fullName = fullName;
		this.dateOfBirth = dateOfBirth;
		this.salaryCoefficient = salaryCoefficient;
		this.positionCoefficient = positionCoefficient;
	}
	 
	 public BigDecimal calculateSalary() {
	        return BigDecimal.ZERO;
	    }

	    // Method to display information
	 public void displayInformation() {
	       System.out.println("Họ và tên: " + fullName);
	       System.out.println("Ngày sinh: " + dateOfBirth);
	       System.out.println("Hệ số lương: " + salaryCoefficient);
	       System.out.println("Hệ số chức vụ: " + positionCoefficient);
	    }
}
