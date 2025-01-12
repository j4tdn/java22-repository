package dao;

import java.util.List;

import persistence.Students;

public interface studenDao {
	List<Students> get(int id);
}
