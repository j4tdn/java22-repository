package dao;

import java.time.LocalDate;
import java.util.List;

import persistence.Item;

public interface ItemDao {
	/**
	 * get Item thỏa mãn date truyền vào
	 * @param date
	 * @return
	 */
	 public List<Item> getItemSoldOnDate(LocalDate date);
	 
	 /**
		 * get Item hàng được bán nhiều nhất của năm bất kỳ.
		 * @param date
		 * @return
		 */
		 public List<Item> getItemsInYear(int year);
}
