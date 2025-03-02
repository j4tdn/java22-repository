package view;

import static utils.PrintUtils.generate;

import java.util.Set;

import persistence.ItemGroup;
import service.ItemService;
import service.ItemServiceImpl;
import service.ItemGroupServiceImpl;

public class Ex01 {
	
	private static ItemService itemService;
	
	static {
		itemService = new ItemServiceImpl();
	}
	
	public static void main(String[] args) {
		System.out.println("Bắt đầu chương trình");
		System.out.println("==================\n");
		
		generate(
			    "Liệt kê các mặt hàng được bán trong ngày bất kỳ. Với ngày bán là tham số"
			    + "truyền vào. Kết quả trả về được sắp xếp theo CREATED_TIME desc, ID asc", 
			    itemService.getOrderTimeDetails("2024-11-28")
			);

		System.out.println("\n==================");
		System.out.println("Kết thúc chương trình");
	}
}