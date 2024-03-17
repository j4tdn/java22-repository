package lesson01;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	static Scanner ip = new Scanner(System.in);
	
	public static void main(String[] args) {
		ArrayList<Student> listStudents = new ArrayList<Student>();
	
		Student sv1 = new Student(272112,"Doan Van Huy", new BigDecimal(8.0),new BigDecimal(7.5));
		Student sv2 = new Student(272114,"Vo Nhu Hoang", new BigDecimal(9.0),new BigDecimal(8.5));
		Student sv3 = new Student();
		System.out.println("Input information sv3: ");
		ipInfo(sv3);
		
		listStudents.add(sv1);
		listStudents.add(sv2);
		listStudents.add(sv3);
		
		System.out.println("Sinh vien co diem trung binh hon 8.5: ");
		for(Student student : listStudents) {
			if (findAvgBigger85(student.getTheoryScore(), student.getPracticeScore())) System.out.println(student.toString());
		}
		System.out.println("Sinh vien co diem ly thuyet hon diem thuc hanh: ");
		for(Student student :  listStudents) {
			if(compare2Score(student.getTheoryScore(), student.getPracticeScore())) System.out.println(student.toString());
		}
	}
	
	private static void ipInfo(Student sv) {
		System.out.println("input id: ");
		int id = Integer.parseInt(ip.nextLine());
		System.out.print("input name: ");
		String name = ip.nextLine();
		System.out.print("input theoryScore: ");
		BigDecimal theoryScore = new BigDecimal(ip.nextLine());
		System.out.print("input practiceScore: ");
		BigDecimal practiceScore = new BigDecimal(ip.nextLine());
		sv.setId(id);
		sv.setName(name);
		sv.setTheoryScore(theoryScore);
		sv.setPracticeScore(practiceScore);
	}
	
	private static Boolean findAvgBigger85(BigDecimal a, BigDecimal b) {
		if(((a.add(b)).divide(new BigDecimal(2))).doubleValue() > 8.5) return true;
		return false;
	}
	
	private static Boolean compare2Score(BigDecimal a, BigDecimal b) {
		if(a.doubleValue()>b.doubleValue()) return true;
		return false;
	}
}
