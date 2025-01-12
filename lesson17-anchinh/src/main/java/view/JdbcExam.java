package view;

import service.StudentService;
import service.StudentServiceImpl;
import static utils.PrintUtils.*;

public class JdbcExam {

	private static StudentService studentService;
	
	static {
		studentService = new StudentServiceImpl();
	}
	public static void main(String[] args) {
//		generate("1. List all student by class id", studentService.getStudent(2));
		
		System.out.println("\n3.Count/Statistic amount of students per class");
		studentService.amountOfStudent(2);
		
//		generate("\n3.Count/Statistic amount of students per class", studentService.amountOfStudent(2));
		
	}
	
}
