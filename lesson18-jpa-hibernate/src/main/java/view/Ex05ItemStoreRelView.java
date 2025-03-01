package view;

import persistence.ItemStoreRel.Id;
import service.ItemStoreRelService;
import service.ItemStoreRelServiceImpl;

import static utils.PrintUtils.*;

public class Ex05ItemStoreRelView {
	
	private static ItemStoreRelService itemStoreRelService;

	static {
	    itemStoreRelService = new ItemStoreRelServiceImpl();
	}

	public static void main(String[] args) {
	    var itemStoreRel = itemStoreRelService.get(new Id(1, 1));

	    generate("1. Liệt kê 'ItemStoreRel' --> ", itemStoreRel);
	}


}
