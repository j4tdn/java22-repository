package view;

import static utils.PrintUtils.generate;

import java.util.Set;

import persistence.ItemGroup;
import service.ItemGroupService;
import service.ItemGroupServiceImpl;

public class Ex02 {
	
	private static ItemGroupService itemGroupService;
	
	static {
		itemGroupService = new ItemGroupServiceImpl();
	}
	
	public static void main(String[] args) {
		generate(
				"2. Thống kê số lượng mặt hàng đang tồn kho của mỗi loại hàng, biết rằng"
				+ "hàng tồn kho là số mặt hàng còn lại trong hệ thống", 
				itemGroupService.statisticItemGroupDetails()
			);
	}
}