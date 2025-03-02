package view;

import static utils.PrintUtils.generate;

import java.time.LocalDate;

import service.ItemGroupService;
import service.ItemGroupServiceImpl;
import service.ItemService;
import service.ItemServiceImpl;

public class Exam {
	
	private static ItemService itemService;
	private static ItemGroupService itemGroupService;
	
	static {
		itemService = new ItemServiceImpl();
		itemGroupService = new ItemGroupServiceImpl();
	}
	
	public static void main(String[] args) {
		generate("1. Liệt kê các mặt hàng được bán trong ngày bất kỳ", 
				itemService.getItemBySalesDate(LocalDate.of(2024, 10, 27)));
		
		generate(
			"\n2. Thống kê số lượng mặt hàng đang tồn kho của mỗi loại hàng", 
			itemGroupService.statisticItemGroupDetails()
		);
	}
}
