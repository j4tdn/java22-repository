package view;

import java.time.LocalDate;
import static utils.PrintUtils.generate;
import service.ItemService;
import service.ItemServiceImpl;

public class Ex01ItemSoldOnDate {
	private static ItemService itemService;
	
	static {
		itemService = new ItemServiceImpl();
	}
	public static void main(String[] args) {
		System.out.println("Bắt đầu chương trình");
		System.out.println("==================\n");
		
		generate(
				"Liệt kê các mặt hàng được bán trong ngày bất kỳ ", 
				itemService.getItemSoldOnDate(LocalDate.of(2024, 10, 27))
			);
		System.out.println("\n==================");
		System.out.println("Kết thúc chương trình");
	}
}
