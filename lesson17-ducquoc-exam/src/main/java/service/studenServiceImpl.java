package service;

import java.util.List;

import dao.JdbcStudentDao;
import dao.studenDao;
import persistence.Students;

public class studenServiceImpl implements studenService {
	private studenDao studenDao;
	public studenServiceImpl() {
		studenDao = new JdbcStudentDao();
	}
	@Override
	public List<Students> get(int id) {
		return studenDao.get(id);
	}
	
}
