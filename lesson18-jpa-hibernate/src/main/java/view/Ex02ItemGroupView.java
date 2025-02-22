package view;

import static utils.PrintUtils.generate;

import service.ItemGroupService;
import service.ItemGroupServiceImpl;

public class Ex02ItemGroupView {
	
	private static ItemGroupService itemGroupService;	
	static {
		itemGroupService = new ItemGroupServiceImpl();
	}
	
	public static void main(String[] args) {
		System.out.println("Bắt đầu chương trình");
		System.out.println("\n==================\n");
		
		
		generate(
			"5. Thống kê số lượng mặt hàng của từng loại hàng", 
			itemGroupService.statisticItemGroupDetails()
		);
		
		
		/*
		final var groups = itemGroupService.getAll();
		
		
		generate(
			"1A. Liệt kê tất cả các loại hàng", 
			groups
		);
		
		generate(
			"1A. Liệt kê tất cả các mặt hàng tìm thấy", 
			groups.get(0).getItems()
		);
		
		generate(
			"1B. Liệt kê loại hàng theo mã loại", 
			itemGroupService.get(2)
		);
		
		generate(
			"1C. Liệt kê loại hàng theo tên loại", 
			itemGroupService.get("a' OR '1=1'")
		);
		 */
		
		System.out.println("\n==================\n");
		System.out.println("Kết thúc chương trình");
	}
	
}
