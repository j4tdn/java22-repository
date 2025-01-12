package dao;

import java.util.List;

import persistance.Student;

public interface StudentDao {
	List<Student> getStudent(int id);
	
	Integer amountOfStudent(int id);
	
}
