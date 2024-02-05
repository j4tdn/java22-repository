package Ex04;

import java.math.BigDecimal;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		//Tạo dữ liệu gồm 1 Giám đốc, 2 Trưởng phòng, 6 Nhân viên
		try {
			Director gd1 = new Director("NhungGD", "2002-02-22", new BigDecimal("8.5"), new BigDecimal("6.5"));
			HeadOfDepartment tp1 = new HeadOfDepartment("NhungTP1", "2002-02-22", new BigDecimal("6.5"), new BigDecimal("6.5"),"Kiểm Toán");
			HeadOfDepartment tp2 = new HeadOfDepartment("NhungTP2", "2002-02-22", new BigDecimal("6.5"), new BigDecimal("6.5"),"Nhân Sự");
			Staff nv1 = new Staff("NhungNV1", "2002-02-22", new BigDecimal("6.5"),"Kiểm Toán","NhungTP1");
			Staff nv2 = new Staff("NhungNV2", "2002-02-22", new BigDecimal("5.5"),"Nhân Sự","NhungTP2");
			Staff nv3 = new Staff("NhungNV3", "2002-02-22", new BigDecimal("5.5"),"Kiểm Toán","NhungTP1");
			Staff nv4 = new Staff("NhungNV4", "2002-02-22", new BigDecimal("6.5"),"Kiểm Toán","NhungTP1");
			Staff nv5 = new Staff("NhungNV5", "2002-02-22", new BigDecimal("6"),"Nhân Sự","NhungTP2");
			Staff nv6 = new Staff("NhungNV6", "2002-02-22", new BigDecimal("5"),"Nhân Sự","NhungTP2");
			Director[] ListDirector = {gd1}; 
			HeadOfDepartment[] ListHeadOfDepartment = {tp1,tp2};
			Staff[] ListStaff = {nv1,nv2,nv3,nv4,nv5,nv6};
			
			PrintList(ListDirector, ListHeadOfDepartment, ListStaff);
			SearchStaffOfHeadDepartment(ListHeadOfDepartment,ListStaff);
			calculateSalary(ListDirector, ListHeadOfDepartment, ListStaff);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void PrintList(Director[] ListDirector, HeadOfDepartment[] ListHeadOfDepartment, Staff[] ListStaff) {
		System.out.println("===================================== Danh sách nhân sự =====================================");
		System.out.println("=> Giám đốc");
		System.out.println("\t Name \t\t Ngày sinh \t HS Lương \t HS Chức vụ ");		
		for(Director nv: ListDirector) {
			System.out.println(nv.toString());
		}
		System.out.println("=> Trưởng phòng");
		System.out.println("\t Name \t\t Ngày sinh \t HS Lương \t HS Chức vụ \t Phòng ban");		
		for(Director nv: ListHeadOfDepartment) {
			System.out.println(nv.toString());
		}
		System.out.println("=> Nhân sự");
		System.out.println("\t Name \t\t Ngày sinh \t HS Lương \t Phòng ban \t Trưởng phòng");		
		for(Director nv: ListStaff) {
			System.out.println(nv.toString());
		}
	}
	private static void SearchStaffOfHeadDepartment(HeadOfDepartment[] ListHeadOfDepartment, Staff[] ListStaff){
		System.out.println("===============Thống kê số lượng nhân viên được quản lý bởi từng trưởng phòng===============");
		for(HeadOfDepartment tp: ListHeadOfDepartment) {
			System.out.println(" Trưởng phòng : "+ tp.getFullName());
			int Counter = 0;
			for(Staff nv: ListStaff) {
				if(nv.getHeadOfDepartment() == tp.getFullName()) System.out.println("\t"+(++Counter)+". " + nv.getFullName());
			}
		}
	}
	private static void calculateSalary(Director[] ListDirector, HeadOfDepartment[] ListHeadOfDepartment, Staff[] ListStaff) {
		/*
		   	Nhân viên: Lương = (hệ số lương + hệ số chức vụ(nếu có)) * 1250000
			Trưởng phòng: Lương = (hệ số lương + hệ số chức vụ(nếu có)) * 2200000
			Giám đốc: Lương = (hệ số lương + hệ số chức vụ(nếu có)) * 3000000
		 */
		BigDecimal salary ;
		System.out.println("================================== Mức lương từng nhân sự ==================================");
		System.out.println("=> Giám đốc");
		System.out.println("\t Name \t\t Ngày sinh \tMức Lương");		
		for(Director nv: ListDirector) {
			salary = (nv.getSalaryCoefficient().add(nv.getPositionCoefficient()).multiply(new BigDecimal("3000000")));
			System.out.println("\t"+nv.getFullName()+"\t\t"+nv.getBirthDate()+"\t"+salary);
		}
		System.out.println("=> Trưởng phòng");
		System.out.println("\t Name \t\t Ngày sinh \tMức Lương");		
		for(Director nv: ListHeadOfDepartment) {
			salary = (nv.getSalaryCoefficient().add(nv.getPositionCoefficient()).multiply(new BigDecimal("2200000")));
			System.out.println("\t"+nv.getFullName()+"\t"+nv.getBirthDate()+"\t"+salary);
		}
		System.out.println("=> Nhân sự");
		System.out.println("\t Name \t\t Ngày sinh \tMức Lương");		
		for(Director nv: ListStaff) {
			salary = nv.getSalaryCoefficient().multiply(new BigDecimal("1250000"));
			System.out.println("\t"+nv.getFullName()+"\t"+nv.getBirthDate()+"\t"+salary);
		}
	}
	
}
//(0_0)