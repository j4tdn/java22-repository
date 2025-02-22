package service;

import persistence.ItemStoreRel;
import persistence.ItemStoreRel.Id;

public interface ItemStoreRelService {
	
	/**
	 * Get relation of item store by id
	 * @param id the id
	 * @return {@link ItemStoreRelation}
	 */
	ItemStoreRel get(Id id);
	
}
