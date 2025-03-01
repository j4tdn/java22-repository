package dao;

import persistence.ItemStoreRel;
import persistence.ItemStoreRel.Id;

public interface ItemStoreRelDao {
	
	ItemStoreRel get(Id id);

}
