package view;

import static utils.PrintUtils.generate;

import java.util.List;

import persistence.ItemGroup;
import persistence.dto.ItemDto;
import service.ItemGroupService;
import service.ItemGroupServiceImpl;
import service.ItemService;
import service.ItemServiceImpl;

public class Ex03 {
	
private static ItemService itemService;
	
	static {
		itemService = new ItemServiceImpl();
	}
	
	public static void main(String[] args) {
		System.out.println("Bắt đầu chương trình");
		System.out.println("==================\n");
		
		System.out.println("2. Thống kê số lượng mặt hàng đang tồn kho của mỗi loại hàng");
		for(ItemDto item: itemService.getTop3SellingItems(0)) {
			System.out.println(item.getName());
		}
		
		System.out.println("\n==================");
		System.out.println("Kết thúc chương trình");
	}
}
