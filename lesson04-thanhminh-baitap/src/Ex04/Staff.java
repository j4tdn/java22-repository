package Ex04;

import java.math.BigDecimal;

public class Staff extends Manager {
	private String managerName;
	
	public Staff() {
		
	}

	public Staff(String name, String birthDate, BigDecimal salaryCoefficient, BigDecimal positionCoefficient,
			String departmentName, String managerName) {
		super(name, birthDate, salaryCoefficient, positionCoefficient, departmentName);
		this.managerName = managerName;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	@Override
	public String toString() {
		return super.toString() + "[managerName=" + managerName + "]";
	}
	

}
