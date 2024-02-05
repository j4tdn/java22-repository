package Ex04;

import java.math.BigDecimal;

public class Main {
	public static void main(String[] args) {
		Director gd = new Director("Minh", "1967", new BigDecimal("8"), new BigDecimal("6"));
		Manager tp1 = new Manager("Hung", "1980", new BigDecimal("6"), new BigDecimal("6"),"Kinh doanh");
		Manager tp2 = new Manager("Nam", "1982", new BigDecimal("6"), new BigDecimal("6"),"Kế toán");
		Staff nv1 = new Staff("Linh", "1989", new BigDecimal("5.5"),new BigDecimal("0"), "Kinh doanh","Hung");
		Staff nv2 = new Staff("Mai", "1990", new BigDecimal("5.5"),new BigDecimal("0"), "Kinh doanh","Hung");
		Staff nv3 = new Staff("Tuan", "1995", new BigDecimal("5.5"),new BigDecimal("0"), "Kinh doanh","Hung");
		Staff nv4 = new Staff("Duong", "1997", new BigDecimal("5"),new BigDecimal("0"), "Kinh doanh","Hung");
		Staff nv5 = new Staff("Binh", "1985", new BigDecimal("6"),new BigDecimal("0"), "Kế toán","Nam");
		Staff nv6 = new Staff("Tu", "1993", new BigDecimal("5"),new BigDecimal("0"), "Kế toán","Nam");
		Director[] Director = {gd}; 
		Manager[] ListManager = {tp1,tp2};
		Staff[] ListStaff = {nv1,nv2,nv3,nv4,nv5,nv6};
		
		printList(Director, ListManager, ListStaff);
		staffOfManager(ListManager,ListStaff);
		calSalary(Director, ListManager, ListStaff);
	}
	private static void printList(Director[] Director, Manager[] ListManager, Staff[] ListStaff) {
		System.out.println("1. Danh sách nhân sự ");
		System.out.println("Giám đốc");		
		for(Director ns: Director) {
			System.out.println(ns.toString());
		}
		System.out.println(" Trưởng phòng");	
		for(Manager ns: ListManager) {
			System.out.println(ns.toString());
		}
		System.out.println(" Nhân sự");		
		for(Staff ns: ListStaff) {
			System.out.println(ns.toString());
		}
	}
	private static void staffOfManager(Manager[] ListManager, Staff[] ListStaff){
		System.out.println("2. Thống kê số lượng nhân viên được quản lý bởi từng trưởng phòng");
		for(Manager tp: ListManager) {
			System.out.println(" Trưởng phòng : "+ tp.getName());
			int Counter = 0;
			for(Staff ns: ListStaff) {
				if(ns.getManagerName() == tp.getName()) System.out.println("\t"+(++Counter)+". " + ns.getName());
			}
		}
	}
	private static void calSalary(Director[] ListDirector, Manager[] ListManager, Staff[] ListStaff) {
		BigDecimal salary ;
		System.out.println("3. Mức lương từng nhân sự");
		System.out.println("Giám đốc");		
		for(Director ns: ListDirector) {
			salary = (ns.getSalaryCoefficient().add(ns.getPositionCoefficient()).multiply(new BigDecimal("3000000")));
			System.out.println("\t"+ns.getName()+"\t"+salary);
		}
		System.out.println(" Trưởng phòng");		
		for(Manager ns : ListManager) {
			salary = (ns.getSalaryCoefficient().add(ns.getPositionCoefficient()).multiply(new BigDecimal("2200000")));
			System.out.println("\t"+ns.getName()+"\t"+salary);
		}
		System.out.println(" Nhân sự");		
		for(Staff ns: ListStaff) {
			salary = ns.getSalaryCoefficient().multiply(new BigDecimal("1250000"));
			System.out.println("\t"+ns.getName()+"\t"+salary);
		}
	}
	
}
