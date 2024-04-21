package ex01;

import java.util.ArrayList;
import java.util.List;

public class StudentManager {
	public static void main(String[] args) {

		Student[] students = {
				new Student(102, "Nam", XepLoai.C),
				new Student(103, "Bảo", XepLoai.F),
				new Student(104, "Hoàng", XepLoai.D),
				new Student(105, "Nguyên", XepLoai.B),
				new Student(107, "Vũ", XepLoai.F),
				new Student(109, "Lan", XepLoai.A),
				new Student(202, "Đạt", XepLoai.C), 
				new Student(103, "Bảo", XepLoai.F),
				new Student(107, "Vũ", XepLoai.C),
				new Student(104, "Hoàng", XepLoai.B) 
				
				};

		
		Student[] studentA = getstudentA(students);
		System.out.println("Sinh viên đạt xếp loại A:");
		for (Student student : studentA) {
			System.out.println(student.maSv  + student.hoTen);
		}

		
		Student[] studentAgain = getRetakeSubject(students);
		System.out.println("\nSinh viên đăng ký học lại:");
		for (Student student : studentAgain) {
			System.out.println(student.maSv  + student.hoTen);
		}
	}

	public static Student[] getstudentA(Student[] students) {
		List<Student> result = new ArrayList<>();

		for (Student student : students) {
			if (student.xepLoai == XepLoai.A) {
				result.add(student);
			}
		}

		return result.toArray(new Student[0]);
	}

	public static Student[] getRetakeSubject(Student[] students) {
		List<Student> result = new ArrayList<>();

		for (Student student : students) {
			if (student.xepLoai == XepLoai.F) {
				result.add(student);
			}
		}

		return result.toArray(new Student[0]);
	}

	
}
