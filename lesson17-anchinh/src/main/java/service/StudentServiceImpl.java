package service;

import java.util.List;
import java.util.Objects;

import dao.JdbcStudentDao;
import dao.StudentDao;
import persistance.Student;

public class StudentServiceImpl implements StudentService {

	private StudentDao studentDao;
	 
	public StudentServiceImpl() {
		studentDao = new JdbcStudentDao();
	}
	
	@Override
	public List<Student> getStudent(int id) {
		Objects.requireNonNull(id, "student id should not be null !");
		return studentDao.getStudent(id);
	}

	@Override
	public Integer amountOfStudent(int id) {
		return studentDao.amountOfStudent(id);
	}

	
}
