package Ex04;

import java.math.BigDecimal;

public class Manager extends Boss {
	private String departName;

	public Manager() {}

	public Manager(String name, String date, BigDecimal coeffSalary, BigDecimal positionCoeff, String departName) {
		super(name, date, coeffSalary, positionCoeff);
		this.departName = departName;
	}

	public String getDepartName() {
		return departName;
	}

	public void setDepartName(String departName) {
		this.departName = departName;
	}

	@Override
	public String toString() {
		return "Manager [departName=" + departName + ", getPositionCoeff()=" + getPositionCoeff() + ", toString()="
				+ super.toString() + ",Name=" + getName() + ", Date=" + getDate() + ", CoeffSalary="
				+ getCoeffSalary() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	public static void numberOfEm(Manager ma,Employee[] em) {
		
		int number = 0;
		String name = ma.getName();
		System.out.println("Thống kê số lượng nhân viên được quản lý bởi trưởng phòng "+ name); 
		for(Employee x: em) {
			if(x.getManager().getName().equals(name)) {
				System.out.println(x.toString());
				++number;
			}	
		}
		System.out.println("Có tổng cộng "+number +" người");
	
	}
	public static void salary(Manager ma) {
		System.out.println("Mức lương của trưởng phòng");
		System.out.println((ma.getCoeffSalary().add(ma.getPositionCoeff())).multiply(new BigDecimal("2200000")));
	}

	

}
