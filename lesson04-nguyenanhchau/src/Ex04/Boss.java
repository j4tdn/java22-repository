package Ex04;

import java.math.BigDecimal;

public class Boss extends People {
	private BigDecimal positionCoeff;
	public Boss() {
	}
	public Boss(String name, String date, BigDecimal coeffSalary, BigDecimal positionCoeff) {
		super(name, date, coeffSalary);
		this.positionCoeff = positionCoeff;
	}
	public BigDecimal getPositionCoeff() {
		return positionCoeff;
	}
	public void setPositionCoeff(BigDecimal positionCoeff) {
		this.positionCoeff = positionCoeff;
	}
	
	@Override
	public String toString() {
		return "Boss [positionCoeff=" + positionCoeff +  ", getName()=" + getName()
				+ ", getDate()=" + getDate() + ", getCoeffSalary()=" + getCoeffSalary() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	public static void salary(Boss bo) {
		System.out.println("Mức lương của giám đốc");
		System.out.println((bo.getCoeffSalary().add(bo.getPositionCoeff())).multiply(new BigDecimal("3000000")));
	}
	
	
	
	
}
