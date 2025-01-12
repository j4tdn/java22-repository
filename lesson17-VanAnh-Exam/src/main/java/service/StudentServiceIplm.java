package service;

import java.util.List;
import java.util.Map;

import dao.JdbcStudentDao;
import dao.StudentDao;
import persistence.Student;

public class StudentServiceIplm implements StudentService {
	
	private StudentDao studentDao;
	public StudentServiceIplm() {
		studentDao = new JdbcStudentDao();
	}

	@Override
	public List<Student> getStudentsByClassId(int id) {
		// TODO Auto-generated method stub
		return studentDao.getAllStudentByClassId(id);
	}

	@Override
	public Map<Integer, Integer> getAmountOfStudentPerClass() {
		// TODO Auto-generated method stub
		return studentDao.getAmountOfStudentPerClass();
	}
	
	

}
