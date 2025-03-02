package view;

import static utils.PrintUtils.generate;

import org.hibernate.SessionFactory;

import connection.DbConnection;
import service.ItemGroupService;
import service.ItemGroupServiceImpl;
import service.ItemService;
import service.ItemServiceImpl;

public class Ex01 {

	private static ItemService itemService;
	
	static {
		itemService = new ItemServiceImpl();
	}
	public static void main(String[] args) {
		
		System.out.println("Bắt đầu chương trình");
		System.out.println("==================\n");
		
		generate(
				"1. Liệt kê các mặt hàng được bán trong ngày bất kỳ. Với ngày bán là tham số\r\n"
				+ "truyền vào.", 
				itemService.getOrderTimeDetails("2024-10-27")
			);
		
		System.out.println("\n==================");
		System.out.println("Kết thúc chương trình");

	}
	
}
