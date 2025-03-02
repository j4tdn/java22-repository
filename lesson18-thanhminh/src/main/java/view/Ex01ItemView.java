package view;

import service.ItemService;
import service.ItemServiceImpl;

import static utils.PrintUtils.*;

public class Ex01ItemView {
	
    private static ItemService itemService;
	
	static {
		itemService = new ItemServiceImpl();
	}
	
	public static void main(String[] args) {
		
		generate(
				"Câu 1: Liệt kê các mặt hàng được bán trong ngày 12-12-2024",
				itemService.getItemsByCreatedTime("2024-12-12")
		);
		
	}
}

