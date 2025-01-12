package view;

import static utils.PrintUtils.*;

import java.time.LocalDate;

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
		
		System.out.println("7. Liệt kê tất cả các mặt hàng(kèm tt loại hàng)");
        itemService.getAll().forEach(item -> item.logging());
		
		generate("\n9. Liệt kê tất cả các mặt hàng(kèm tt loại hàng)", 
				itemService.getItems(LocalDate.of(2024, 10, 25)));
		
		System.out.println("\n===================");
		System.out.println("Kết thúc chương trình");
	}

}
