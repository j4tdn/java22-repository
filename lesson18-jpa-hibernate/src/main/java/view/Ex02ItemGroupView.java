package view;

import static utils.PrintUtils.generate;

import persistence.ItemGroup;
import service.ItemGroupService;
import service.ItemGroupServiceImpl;

public class Ex02ItemGroupView {
	
	private static ItemGroupService itemGroupService;
	
	static {
		itemGroupService = new ItemGroupServiceImpl();
	}
	
	public static void main(String[] args) {
		System.out.println("Bắt đầu chương trình");
		System.out.println("====================\n");
		
		itemGroupService.save(new ItemGroup("Loại hàng 252525"));
		itemGroupService.update(new ItemGroup(15, "Dép quai hậu"));
		itemGroupService.delete(12);
		
		/*
		generate("5. Thống kê số lượng mặt hàng của từng loại hàng", 
				itemGroupService.statisticItemGroupDetail());

			
		final var groups = itemGroupService.getAll();
		
		generate("1A. Liệt kê tất cả các loại hàng", 
				groups);
		
		generate("1A. Liệt kê tất cả các loại hàng", 
				groups.get(0).getItems());
		
		generate("1B. Liệt kê loại hàng theo id", 
				itemGroupService.get(10));
		
		generate("1C. Liệt kê loại hàng theo tên", 
				itemGroupService.get("Giày"));
		*/
		System.out.println("\n===================");
		System.out.println("Kết thúc chương trình");

	}

}
