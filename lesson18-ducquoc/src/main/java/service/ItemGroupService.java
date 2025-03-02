package service;

import java.util.List;

import persistence.Item;

public interface ItemGroupService {
	/**
	 * get số lượng mặt hàng đang tồn kho của mỗi loại hàng
	 * @return
	 */
	List<Item> getInventoryByItemGroup();
}
