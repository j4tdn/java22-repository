package Ex04;

import java.math.BigDecimal;

public class Director {
	private String name;
	private String birthDate;
	private BigDecimal salaryCoefficient;
	private BigDecimal positionCoefficient;
	
	public Director() {
		
	}

	public Director(String name, String birthDate, BigDecimal salaryCoefficient, BigDecimal positionCoefficient) {
		super();
		this.name = name;
		this.birthDate = birthDate;
		this.salaryCoefficient = salaryCoefficient;
		this.positionCoefficient = positionCoefficient;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
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
		return "Director [name=" + name + ", birthDate=" + birthDate + ", salaryCoefficient=" + salaryCoefficient
				+ ", positionCoefficient=" + positionCoefficient + "]";
	}
		
}
