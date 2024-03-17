package Ex04;

import java.math.BigDecimal;

public class Director {
	private BigDecimal positionCoefficient;
	private String fullName;
	private String birthDate;
	private BigDecimal salaryCoefficient;
	
	public Director() {
	}
	
	public Director( String fullName, String birthDate, BigDecimal salaryCoefficient,BigDecimal positionCoefficient) {
		this.fullName = fullName;
		this.birthDate = birthDate;
		this.salaryCoefficient = salaryCoefficient;
		this.positionCoefficient = positionCoefficient;
	}
	public Director( String fullName, String birthDate, BigDecimal salaryCoefficient) {
		this.fullName = fullName;
		this.birthDate = birthDate;
		this.salaryCoefficient = salaryCoefficient;
	}

	public BigDecimal getPositionCoefficient() {
		return positionCoefficient;
	}

	public void setPositionCoefficient(BigDecimal positionCoefficient) {
		this.positionCoefficient = positionCoefficient;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
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
	
	@Override
	public String toString() {
		return  "\t  " + fullName + 
				"\t  "+ birthDate + 
				"\t  " + salaryCoefficient + 
				"\t\t  " + positionCoefficient;
	}
}
