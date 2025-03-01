package view;

import static utils.PrintUtils.generate;

import service.ItemService;
import service.ItemServiceImpl;

public class Ex03ItemView {
	
   private static ItemService itemService;
	
	static {
		itemService = new ItemServiceImpl();
	}
	
	public static void main(String[] args) {
		System.out.println("Bắt đầu chương trình");
		System.out.println("====================\n");
		
		// 1 câu liệt kê từ Item
		// 7 câu liệt kê từ ItemGroup
		generate("2AB. Liệt kê tất cả các mặt hàng(chứa loại hàng)", 
				itemService.getAll());
		
		System.out.println("\n===================");
		System.out.println("Kết thúc chương trình");
	}

}
