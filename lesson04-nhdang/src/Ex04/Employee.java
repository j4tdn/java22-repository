package Ex04;

import java.math.BigDecimal;

public class Employee extends CoreStat {
    private String unit;
    private String managerName;
	public Employee() {
		
	}
	public Employee(String name, String birthday, BigDecimal salaryPoint, String unit, String managerName) {
		super(name, birthday, salaryPoint);
	    this.unit = unit;
	    this.managerName = managerName;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	@Override
	public String toString() {
		return "Nhân viên" + super.toString() + "unit=" + unit + ", managerName=" + managerName + "]";
	}
    
}
