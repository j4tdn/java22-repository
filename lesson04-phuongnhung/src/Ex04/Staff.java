package Ex04;

import java.math.BigDecimal;

public class Staff extends HeadOfDepartment{
	private String headOfDepartment;
	public Staff() {
	}
	
	public Staff(String fullName, String birthString, BigDecimal salaryCoefficient, String departmentName,
			String headOfDepartment) {
		super(fullName, birthString, salaryCoefficient, departmentName);
		this.headOfDepartment = headOfDepartment;
	}

	public String getHeadOfDepartment() {
		return headOfDepartment;
	}
	public void setHeadOfDepartment(String headOfDepartment) {
		this.headOfDepartment = headOfDepartment;
	}
	@Override
	public String toString() {
		return "\t  " + getFullName() + 
				"\t  "+ getBirthDate() + 
				"\t  "+ getSalaryCoefficient() +
				"\t\t  "+ getDepartmentName()+
				"\t  "+headOfDepartment;
	}
}
