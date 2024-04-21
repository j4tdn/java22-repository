package Bai1;

import Bai1.Level;
import Bai1.Student;

public class Ranking {
	public static void main(String[] args) {
		Student[] students = { 
				new Student(102, "Nam",Level.E),
				new Student(103, "Bao",Level.F),
				new Student(104, "Hoang",Level.D),
				new Student(105, "Nguyen",Level.B),
				new Student(107, "Vu",Level.F),
				new Student(109, "Lan",Level.A),
				new Student(122, "Dat",Level.C),
				new Student(110, "TuanAnh",Level.A),
				new Student(111, "Tu", Level.B)
		};
		
		findPointA(students);
		System.out.println("====================");
		findStudentNeedToLearnAgain(students);
	}
	
	public static void findPointA(Student[] students) {
		System.out.println("Danh sach hoc sinh dat duoc diem A : ");
		for (Student student : students) {
			if(student.getLevel() == Level.A) {
				System.out.println(student.toString());
			}
		}
	}
	
	public static void findStudentNeedToLearnAgain(Student[] students) {
		System.out.println("Danh sach hoc sinh phai hoc lai mon cau truc du lieu la : ");
		for (Student student : students) {
			if(student.getLevel() == Level.F) {
				System.out.println(student.toString());
			}
		}
	}
	
}
