package service;

import java.util.List;

import dao.ClassResultDao;
import dao.JdbClassResultDao;
import persistence.ClassResult;

public class ClassResultServiceImpl implements ClassResultService {
	private ClassResultDao classResultDao;
	public ClassResultServiceImpl() {
		classResultDao = new JdbClassResultDao();
	}
	@Override
	public List<ClassResult> getAll() {
		return classResultDao.getAll();
	}
}
