package Ex04;

import java.math.BigDecimal;

public class Employee extends Director{
	
	private String positionName;     //tên đơn vị
	private String headOfDepartment; //trưởng phòng
	
	public Employee() {
	}

	public Employee(String positionName, String headOfDepartment) {
		this.positionName = positionName;
		this.headOfDepartment = headOfDepartment;
	}

	public Employee(String name, String date, BigDecimal salary, String positionName,
			String headOfDepartment) {
		super(name, date, salary);
		this.positionName = positionName;
		this.headOfDepartment = headOfDepartment;
	}

	public String getPositionName() {
		return positionName;
	}

	public void setPositionName(String positionName) {
		this.positionName = positionName;
	}

	public String getHeadOfDepartment() {
		return headOfDepartment;
	}

	public void setHeadOfDepartment(String headOfDepartment) {
		this.headOfDepartment = headOfDepartment;
	}

	@Override
	public String toString() {
		return "Employee [positionName=" + positionName + ", headOfDepartment=" + headOfDepartment + "]";
	}

	public BigDecimal calculateSalary() {
		return (getSalary()).multiply(new BigDecimal(1250000));
		
	}
	
	
	
}
