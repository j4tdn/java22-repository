package service;

import java.util.List;
import java.util.Objects;

import dao.StudentDao;
import persistence.Student;

public class StudentServiceImpl implements StudentService{
	
	private StudentDao studentDao;

	@Override
	public List<Student> getAll(Integer id) {
		Objects.requireNonNull(id, "student should not be null!");
		return studentDao.getAll(id);
	}

	@Override
	public Integer AmoutOfStudent(Integer id) {
		Objects.requireNonNull(id, "student should not be null!");
		return studentDao.AmoutOfStudent(id);
	}

	@Override
	public List<Student> getStudentByScore(Double score) {
		Objects.requireNonNull(score, "student should not be null!");
		return studentDao.getStudentByScore(score);
	}
	
	
	
}
