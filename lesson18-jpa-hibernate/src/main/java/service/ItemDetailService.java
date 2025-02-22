package service;

import java.util.List;

import persistence.ItemDetail;

public interface ItemDetailService {
	
	/**
	 * Get all item details
	 * 
	 * @return list of {@link ItemDetail}
	 */
	List<ItemDetail> getAll();
	
}
