package service;

import java.time.LocalDate;
import java.util.List;

import persistence.Item;

public interface ItemService {
	/**
	 * get Item thỏa mãn date truyền vào
	 * @param date
	 * @return
	 */
	List<Item> getItemSoldOnDate(LocalDate date);
	
	/**
	 * get Item hàng được bán nhiều nhất của năm bất kỳ.
	 * @param date
	 * @return
	 */
	 List<Item> getItemsInYear(int year);
}
