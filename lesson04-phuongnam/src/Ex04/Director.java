package Ex04;

import java.math.BigDecimal;

public class Director {

	private String name;
	private String dateOfBirth;
	private BigDecimal salaryCoefficient;
	private BigDecimal positionCoefficient;
	
	public Director() {
		
	}

	public Director(String name, String dateOfBirth, BigDecimal salaryCoefficient, BigDecimal positionCoefficient) {
		
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.salaryCoefficient = salaryCoefficient;
		this.positionCoefficient = positionCoefficient;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public BigDecimal getSalaryCoefficient() {
		return salaryCoefficient;
	}

	public void setSalaryCoefficient(BigDecimal salaryCoefficient) {
		this.salaryCoefficient = salaryCoefficient;
	}

	public BigDecimal getPositionCoefficient() {
		return positionCoefficient;
	}

	public void setPositionCoefficient(BigDecimal positionCoefficient) {
		this.positionCoefficient = positionCoefficient;
	}

	@Override
	public String toString() {
		
		return "Tên giám đốc: " + getName() + ", " + "Ngày sinh: " + getDateOfBirth() + ", " + "Hệ số lương: "
				+ getSalaryCoefficient() + ", " + "Hệ số chức vụ: " + getPositionCoefficient();
		
	}
	
	
}
