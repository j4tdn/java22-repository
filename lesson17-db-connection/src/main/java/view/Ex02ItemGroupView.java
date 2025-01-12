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
		
		generate("1. Liệt kê tất cả các loại hàng", 
				itemGroupService.getAll());
		
		generate("2. Liệt kê loại hàng theo mã loại = 28", 
				itemGroupService.get(28));
		
		//System.out.println("3. Thêm mới loại hàng\n");
		//itemGroupService.save(new ItemGroup("Móc treo quần áo"));
		
		System.out.println("\n3. Thêm mới loại hàng\n");
		itemGroupService.merge(new ItemGroup("Áo người lớn"));
		
		System.out.println("\n4. Cập nhật loại hàng\n");
		itemGroupService.merge(new ItemGroup(1, "Áo em bé"));
		
		generate("5. Liệt kê loại hàng có tên loại = Quần", 
				itemGroupService.get("Quần"));
		
		
		// Thêm N phần tử
		// Nếu có 1/x phần tử lỗi --> các phần tử còn lại vẫn được thêm vào
		// Yêu cầu: nếu tồn tại 1 loại hàng bị lỗi --> rollback toàn bộ dữ liệu về ban đầu
		System.out.println("\n6. Thêm mới N loại hàng\n");
		//itemGroupService.save(
				//List.of(
						//new ItemGroup("Loại hàng G1"),
						//new ItemGroup("Loại hàng G2"),
						//new ItemGroup("Loại hàng G3"),
						//new ItemGroup("Loại hàng G4")
				//));
		
		System.out.println("\n8. Liệt kê các loại hàng(kèm danh sách mặt hàng)");
		itemGroupService.getGroupOfItems().forEach(group -> group.logging());
		
		generate("\n10.Đếm số lượng các mặt hàng theo từng loại hàng", 
				itemGroupService.getItemGroupDetails());
		
		System.out.println("\n===================");
		System.out.println("Kết thúc chương trình");

	}

}
