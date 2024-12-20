package view;

import service.ItemGroupService;
import service.ItemGroupServiceImpl;

import static utils.PrintUtils.*;

import java.util.List;

import persistence.ItemGroup;

public class Ex02ItemGroupView {
	
	private static ItemGroupService itemGroupService;
	
	static {
		itemGroupService = new ItemGroupServiceImpl();
	}
	
	public static void main(String[] args) {
		System.out.println("Bắt đầu chương trình");
		System.out.println("====================\n");
		
		generate("1. Liệt kê tất cả các loại hàng", 
				itemGroupService.getAll());
		
		generate("2. Liệt kê loại hàng theo mã loại = 28", 
				itemGroupService.get(28));
		
		//System.out.println("3. Thêm mới loại hàng\n");
		//itemGroupService.save(new ItemGroup("Móc treo quần áo"));
		
		System.out.println("\n3. Thêm mới loại hàng\n");
		itemGroupService.saveOrUpdate(new ItemGroup("Áo người lớn"));
		
		System.out.println("\n4. Cập nhật loại hàng\n");
		itemGroupService.update(new ItemGroup(1, "Áo em bé"));
		
		System.out.println("\n3. Thêm mới N loại hàng\n");
		itemGroupService.save(
				List.of(
						new ItemGroup("Loại hàng G1"),
						new ItemGroup("Loại hàng G2"),
						new ItemGroup("Loại hàng G3"),
						new ItemGroup("Loại hàng G4")
				));
		
		System.out.println("\n===================");
		System.out.println("Kết thúc chương trình");

	}

}
