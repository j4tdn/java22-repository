package view;

import persistence.ItemDetail;
import service.ItemDetailService;
import service.ItemDetailServiceImpl;

import static utils.PrintUtils.*;

public class Ex06ItemDetailView {
	
	private static ItemDetailService itemDetailService;

	static {
	    itemDetailService = new ItemDetailServiceImpl();
	}

	public static void main(String[] args) {
	    var itemDetailIds = itemDetailService.getAll()
	        .stream()
	        .map(ItemDetail::getId)
	        .toList();
	    
	    var items = itemDetailService.getAll()
		        .stream()
		        .map(ItemDetail::getItem)
		        .toList();

	    //generate("1. Danh sách mã chi tiết mặt hàng", itemDetailIds);
	    
	    generate("2. Danh sách các mặt hàng", items);
	}


}
