package dao;

import java.util.List;

import persistence.Item;

public interface ItemGroupDao {
	/**
	 * get số lượng mặt hàng đang tồn kho của mỗi loại hàng
	 * @return
	 */
	List<Item> getInventoryByItemGroup();
}
