package dao;

import java.time.LocalDate;
import java.util.List;

public interface OrderDetailDAO {
	List<Object[]> getItemsSoldOnDate(LocalDate date);
}
