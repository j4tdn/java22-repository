package view;

import service.StudentService;
import service.StudentServiceImpl;

import static utils.PrintUtils.*;

public class Ex02StudentView {
	
	private static StudentService studentService;
	
	static {
		studentService = new StudentServiceImpl();
	}
	
	public static void main(String[] args) {
		System.out.println("Bắt đầu chương trình");
		System.out.println("==================\n");
		
		generate("1. List all student by class id",
				studentService.getAll(1));
		
		generate("3. Count/Statistic amount of students per class",
				studentService.AmoutOfStudent(3));
		
		generate("Find students who have average of points >= 8.2",
				studentService.getStudentByScore(8.2));
	}
	
}
