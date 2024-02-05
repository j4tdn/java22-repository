package Ex04;

import java.math.BigDecimal;

public class Manager extends Director {
	private String departmentName;
	
	public Manager() {
		
	}

	public Manager(String name, String birthDate, BigDecimal salaryCoefficient, BigDecimal positionCoefficient,
			String departmentName) {
		super(name, birthDate, salaryCoefficient, positionCoefficient);
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
		return super.toString() + " --> departmentName = " + departmentName;
	}
	

}
