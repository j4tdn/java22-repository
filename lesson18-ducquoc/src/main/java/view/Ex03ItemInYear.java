package view;

import static utils.PrintUtils.generate;

import service.ItemService;
import service.ItemServiceImpl;

public class Ex03ItemInYear {
private static ItemService itemService;
	
	static {
		itemService = new ItemServiceImpl();
	}
	public static void main(String[] args) {
		System.out.println("Bắt đầu chương trình");
		System.out.println("==================\n");
		
		generate(
				"Liệt kê top 3 mặt hàng được bán nhiều nhất của năm bất kỳ ", 
				itemService.getItemsInYear(2024)
			);
		System.out.println("\n==================");
		System.out.println("Kết thúc chương trình");
	}
}
