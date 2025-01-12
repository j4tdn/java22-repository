package view;

import java.util.List;
import java.util.Map;

import persistence.Student;
import service.StudentServiceIplm;

public class demo {
	
	private static StudentServiceIplm StudentService;
	
	static {
		StudentService = new StudentServiceIplm();
	}
	
	public static void main(String[] arg) {
		
		List<Student> StudentsHaveClassId = StudentService.getStudentsByClassId(3);
		
		System.out.println("List student have class_id = 3" );
		for(Student s : StudentsHaveClassId) {
			
			System.out.println(s);
		}
		
	Map<Integer, Integer> listAmountOfStudent= StudentService.getAmountOfStudentPerClass();
		
	System.out.println("Amount of students: ");
	
	for(Map.Entry<Integer, Integer> entry: listAmountOfStudent.entrySet()) {
		System.out.println("Class_id: "+ entry.getKey() + " -" +"Amount: "+entry.getValue());
	}
	}
	

}
