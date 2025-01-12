package dao;


import java.util.List;

import persistence.Student;

public interface StudentDao {
	
	List<Student> getAll(Integer id);
	Integer AmoutOfStudent(Integer id);
	List<Student> getStudentByScore(Double score);
	
}
