package view;

import service.ItemGroupService;
import service.ItemGroupServiceImpl;
import static utils.PrintUtils.*;

import persistence.ItemGroup;

public class Ex02ItemGroupView {

	private static ItemGroupService itemGroupService;
	
	static {
		itemGroupService = new ItemGroupServiceImpl();
	}
	
	public static void main(String[] args) {
		
		
		
		
		generate("1. Liệt kê tất cả các loại hàng", itemGroupService.getAll());
		
		generate(
				"2. Liệt kê loại hàng các mã loại = 28", 
				itemGroupService.get(6));
		
		System.out.println("3. Thêm mới loại hàng\n");
		itemGroupService.saveOrUpdate(new ItemGroup("Móc treo quần áo"));
		
		System.out.println("4. Cập nhật loại hàng\n");
		itemGroupService.update(new ItemGroup(1, "Áo em bé"));
		
		System.out.println("\n=================");
		System.out.println("Kết thúc chương trình");
	}
}
