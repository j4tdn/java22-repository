package Ex04;

import java.math.BigDecimal;

public class HeadOfDepartment extends Director{
	private String departmentName;
	public HeadOfDepartment() {
	}
	public HeadOfDepartment(String fullName, String birthString, BigDecimal salaryCoefficient,
			BigDecimal positionCoefficient, String departmentName) {
		super(fullName, birthString, salaryCoefficient, positionCoefficient);
		this.departmentName = departmentName;
	}
	
	public HeadOfDepartment(String fullName, String birthString, BigDecimal salaryCoefficient,
			 String departmentName) {
		super(fullName, birthString, salaryCoefficient);
		this.departmentName = departmentName;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	@Override
	public String toString() {
		return super.toString() +
				"\t\t  "+departmentName;
	}
	
}
