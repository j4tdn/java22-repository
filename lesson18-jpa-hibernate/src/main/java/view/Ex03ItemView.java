package view;

import service.ItemService;
import service.ItemServiceImpl;

import static utils.PrintUtils.*;

public class Ex03ItemView {
	
	private static ItemService itemService;
	
	static {
		itemService = new ItemServiceImpl();
	}
	
	public static void main(String[] args) {
		
		// 1 câu liệt kê từ Item
		// 7 câu liệt kê từ ItemGroup
		
		generate(
			"2AB. Liệt kê tất cả cá mặt hàng(chứa loại hàng)",
			itemService.getAll()
		);
	}
	
}
