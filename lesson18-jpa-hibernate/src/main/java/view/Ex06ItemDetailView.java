package view;

import persistence.ItemDetail;
import service.ItemDetailService;
import service.ItemDetailServiceImpl;
import utils.PrintUtils;

public class Ex06ItemDetailView {
	
	private static ItemDetailService itemDetailService;
	
	static {
		itemDetailService = new ItemDetailServiceImpl();
	}
	
	public static void main(String[] args) {
		var items = itemDetailService.getAll()
			.stream()
			.map(ItemDetail::getItem)
			.toList();
		
		PrintUtils.generate("1. Danh sách các mặt hàng", items);
	}
	
}
