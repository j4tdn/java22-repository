package service;

import java.util.List;

import persistence.Students;

public interface studenService {
	List<Students> get(int id);
}
