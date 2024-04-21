package Ex01;

import java.util.List;

public class Main {
	public static void main(String[] args) {
		StudentManager manager = new StudentManager();
		
		List<Student> studentsWithGradeA = manager.getStudentsWithGradeA();
		System.out.println("Sinh viên đạt loại A:");
		for (Student student : studentsWithGradeA) {
			System.out.println(student.getName());
		}
		
		List<Student> studentsRepeating = manager.getStudentsRepeating();
		System.out.println("Sinh viên phải dăng kí học lại:");
		for (Student student : studentsRepeating) {
			System.out.println(student.getName());
		}
	}
}
