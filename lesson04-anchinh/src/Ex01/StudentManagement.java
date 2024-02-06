package Ex01;

import java.math.BigDecimal;
import java.util.Scanner;

public class StudentManagement {

	public static void main(String[] args) {
		Student sv1 = new Student(1, "AnChinh", new BigDecimal(9.2), new BigDecimal(8.4));
		Student sv2 = new Student(2, "NhungHoang", new BigDecimal(8.6), new BigDecimal(9.7));
		Student sv3 = new Student();
		System.out.println("Nhập thông tin cho sinh viên thứ 3:");
		inputS3(sv3);
		
		Student[] students = {sv1, sv2, sv3};
		
		System.out.println("Sinh viên có điểm trung bình lớn hơn 8.5 là:");
		findAveragePoint(students);
		System.out.println("=============================================================================================");
		
		System.out.println("Sinh viên có điểm lý thuyết lớn hơn điểm thực hành là:");
		comparePoint(students);
	}
	
	public static void inputS3(Student sv3) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Nhập mã số sinh viên: ");
		int id = Integer.parseInt(ip.nextLine());
		System.out.print("Nhập tên sinh viên: ");
		String name = ip.nextLine();
		System.out.print("Nhập điểm lý thuyết: ");
		BigDecimal theorePoint = new BigDecimal(ip.nextLine());
		System.out.print("Nhập điểm thực hành: ");
		BigDecimal practicalPoint = new BigDecimal(ip.nextLine());
		sv3.setId(id);
		sv3.setName(name);
		sv3.setTheoreticalPoint(theorePoint);
		sv3.setPracticalPoint(practicalPoint);
		
	}
	
	public static void findAveragePoint(Student[] students) {
		for(Student student : students) {
			if (student.averageScore().compareTo(new BigDecimal("8.5")) > 0) {
                System.out.println(student.toString());
            }
		}
		
	}
	
	public static void comparePoint(Student[] students) {
		for(Student student : students) {
			if (student.getTheoreticalPoint().compareTo(student.getPracticalPoint()) > 0) {
                System.out.println(student.toString());
            }
		}
	}
	
}
