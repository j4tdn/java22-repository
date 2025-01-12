package service;

import java.util.List;

import persistance.Student;

public interface StudentService {
	List<Student> getStudent(int id);
	
	Integer amountOfStudent(int id);
}
