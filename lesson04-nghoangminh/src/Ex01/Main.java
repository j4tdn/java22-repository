package Ex01;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Student sv1 = new Student(1, "Sinh Vien 1", new BigDecimal("8.0"), new BigDecimal("7.5"));
        Student sv2 = new Student(2, "Sinh Vien 2", new BigDecimal("9.0"), new BigDecimal("8.5"));
        Student sv3 = new Student();
        
        System.out.println("Nhập thông tin cho sinh viên 3:");
        System.out.print("Nhập mã sinh viên: ");
        sv3.setId(sc.nextInt());
        sc.nextLine();
        
        System.out.print("Nhập họ tên sinh viên: ");
        sv3.setName(sc.nextLine());
        
        System.out.print("Nhập điểm lý thuyết: ");
        sv3.setTheoreticalPoint(new BigDecimal(sc.nextDouble()));
        
        System.out.print("Nhập điểm thực hành: ");
        sv3.setPracticalPoint(new BigDecimal(sc.nextDouble()));
        
        Student[] listStudents = {sv1, sv2, sv3};
        
        System.out.println("\nThông tin sinh viên:");
        for (Student sv : listStudents) {
            System.out.println(sv);
        }
        
        System.out.println("\nSinh viên có điểm trung bình lớn hơn 8.5:");
        for (Student sv : findThan8_5(listStudents)) {
            System.out.println(sv);
        }
        
        System.out.println("\nSinh viên có điểm lý thuyết lớn hơn điểm thực hành:");
        for (Student sv : findThanPracticalpoint(listStudents)) {
            System.out.println(sv);
        }
        
	}
	public static ArrayList<Student> findThan8_5(Student[] listStudents) {
        ArrayList<Student> studentThan8_5 = new ArrayList<>();
        for (Student sv : listStudents) {
            if (sv.AvaragePoint().compareTo(new BigDecimal("8.5")) > 0) {
            	studentThan8_5.add(sv);
            }
        }
        return studentThan8_5;
    }
	
	 public static ArrayList<Student> findThanPracticalpoint(Student[] listStudents) {
	        ArrayList<Student> studentPointHaveTheoGreaterPractical = new ArrayList<>();
	        for (Student sv : listStudents) {
	            if (sv.getTheoreticalPoint().compareTo(sv.getPracticalPoint()) > 0) {
	            	studentPointHaveTheoGreaterPractical.add(sv);
	            }
	        }
	        return studentPointHaveTheoGreaterPractical;
	    }

}
