package view;

import persistence.Student;

import java.util.List;

import dao.StudentDaoI;

public class ForExam {
	private static StudentDaoI studentDaoI;
	public static void main(String[] args) {
		
		System.out.println("Cau 1 : \n");
		List<Student> students = studentDaoI.allStudent();
		for (Student student : students) {
			System.out.println(student);
		}
	}
}
