package view;

import static utils.PrintUtils.generate;
import service.ItemGroupService;
import service.ItemGroupServiceImpl;


public class Ex02InventoryByItemGroup {
	private static ItemGroupService itemGroupService;
	static {
		itemGroupService = new ItemGroupServiceImpl();
	}
	public static void main(String[] args) {
		System.out.println("Bắt đầu chương trình");
		System.out.println("==================\n");
		
		generate(
				"Liệt kê số lượng mặt hàng đang tồn kho của mỗi loại hàng ", 
				itemGroupService.getInventoryByItemGroup()
			);
		System.out.println("\n==================");
		System.out.println("Kết thúc chương trình");
	}
}
