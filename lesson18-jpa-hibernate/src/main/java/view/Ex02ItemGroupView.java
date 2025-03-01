package view;

import static utils.PrintUtils.generate;

import java.util.Set;


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
		System.out.println("\n==================\n");
		
		// itemGroupService.testHibernateCache();
		
		//itemGroupService.save(new ItemGroup("Loại hàng 28022025"));
		//itemGroupService.update(new ItemGroup(16, "Dép có quai hậu 16"));
		itemGroupService.delete(20);
		//itemGroupService.delete(Set.of(21, 30, 48));
			
		/*
		generate(
			"5. Thống kê số lượng mặt hàng của từng loại hàng", 
			itemGroupService.statisticItemGroupDetails()
		);
		
		
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
