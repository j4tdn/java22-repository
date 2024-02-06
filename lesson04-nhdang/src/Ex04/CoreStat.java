package Ex04;

import java.math.BigDecimal;

public class CoreStat {
    private String name;
    private String birthday;
    private BigDecimal salaryPoint;
    
    public CoreStat() {
    	
    }
    
	public CoreStat(String name, String birthday, BigDecimal salaryPoint) {
		this.name = name;
		this.birthday = birthday;
		this.salaryPoint = salaryPoint;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public BigDecimal getSalaryPoint() {
		return salaryPoint;
	}

	public void setSalaryPoint(BigDecimal salaryPoint) {
		this.salaryPoint = salaryPoint;
	}

	@Override
	public String toString() {
		return ": [name=" + name + ", birthday=" + birthday + ", salaryPoint=" + salaryPoint + ", ";
	}
	
	
}
