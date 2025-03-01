package service;

import persistence.ItemStoreRel;
import persistence.ItemStoreRel.Id;

public interface ItemStoreRelService {
	
	ItemStoreRel get(Id id);

}
