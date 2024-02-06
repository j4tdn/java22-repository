package Ex04;

import java.math.BigDecimal;

public class HeadOfDepartment extends Director {

	private String departmentName;
	
	public HeadOfDepartment() {
	}

	public HeadOfDepartment(String departmentName) {
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
		return "Manager [departmentName=" + departmentName + "]";
	}

	public HeadOfDepartment(String name, String String, BigDecimal salary, BigDecimal position, String departmentName) {
		super(name, String, salary, position);
		this.departmentName = departmentName;
	}

	public BigDecimal calculateSalary() {
		return (getSalary().add(getPosition())).multiply(new BigDecimal(2200000));
		
	}
}
