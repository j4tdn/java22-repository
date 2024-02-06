package Ex04;

import java.math.BigDecimal;
import java.util.Arrays;

public class Management {

	public static void main(String[] args) {
		
			Director dr = new Director("GĐ1","2002-02-22", new BigDecimal(2.0),new BigDecimal(2.0));
			HeadOfDepartment hd1 = new HeadOfDepartment("TP1", "2002-02-22", new BigDecimal(4.0), new BigDecimal(4.0), "Kế toán");
			HeadOfDepartment hd2 = new HeadOfDepartment("TP2", "2003-02-12", new BigDecimal(1.0), new BigDecimal(4.0), "Nhân sự");
			Employee e1 = new Employee("NV1", "2003-02-12",  new BigDecimal(1.0), "Kế toán", "TP1");
			Employee e2 = new Employee("NV2", "2003-03-12",  new BigDecimal(2.0), "Kế toán", "TP1");
			Employee e3 = new Employee("NV3", "2003-05-12",  new BigDecimal(3.0), "Nhân sự", "TP2");
			Employee e4 = new Employee("NV4", "2003-06-12",  new BigDecimal(1.0), "Nhân sự", "TP2");
			Employee e5 = new Employee("NV5", "2003-05-12",  new BigDecimal(2.0), "Kế toán", "TP1");
			Employee e6 = new Employee("NV6", "2003-02-12",  new BigDecimal(2.0), "Kế toán", "TP1");
			
			Director[] personels = {dr,hd1,hd2,e1,e2,e3,e4,e5,e6};
			
			System.out.println("\n===== Hiển thị thông tin nhân viên ======");
			ListView(personels);
			
			System.out.println("\n======= Thống kê số lượng nhân viên được quản lý bởi từng trưởng phòng ========");
			FindEmployee(personels);
			
			System.out.println("\n===== Mức lương của từng loại nhân sự ======");
			SalaryOutput(personels);
	}
	 
	public static void ListView(Director[] personels) {
		for(Director personel : personels) {
			System.out.println(personel.toString());
		}
	}

//	Thống kê số lượng nhân viên được quản lý bởi từng trưởng phòng
	public static void FindEmployee(Director[] personels) {
		HeadOfDepartment[] hd = new HeadOfDepartment[personels.length];
		int counter = 0;
		for (Director personel : personels) {
			if (personel instanceof HeadOfDepartment) {
				hd[counter++] = (HeadOfDepartment) personel;
			}
		}
		hd = Arrays.copyOfRange(hd, 0, counter);	
		
		for (HeadOfDepartment HD : hd) {
	        int numberOfEmployees = 0;
	        System.out.println("Trưởng phòng: " + HD.getName() + " quản lí nhân viên gồm");

	        for (Director personel : personels) {
	            if (personel instanceof Employee && ((Employee) personel).getHeadOfDepartment().equals(HD.getName())) {  
	            	// Kiểm tra trưởng phòng và in thông tin nhân viên
	                numberOfEmployees++;
	                System.out.println("\t" + personel.toString());
	            }
	        }
	        System.out.println("Tổng số nhân viên: " + numberOfEmployees);
	    }
	}
	
//	in ra mức lương của từng loại nhân sự
	public static void SalaryOutput(Director[] personels) {
		for (Director personel : personels) {
	        if (personel instanceof Employee) {
	            BigDecimal employeeSalary = ((Employee) personel).calculateSalary();
	            System.out.println(personel.getName() + ": " + employeeSalary);
	        } else if (personel instanceof HeadOfDepartment) {
	        	 BigDecimal HeadOfDepartmentSalary = ((HeadOfDepartment) personel).calculateSalary();
		         System.out.println(personel.getName() + ": " + HeadOfDepartmentSalary);
	        } else {
	        	 BigDecimal directorSalary = ((Director) personel).calculateSalary();
		         System.out.println(personel.getName() + ": " + directorSalary);
	        }
	    }
		
	}
}




