package view;

import service.ItemDetailService;
import service.ItemDetailServiceImpl;

public class Ex04ItemDetailView {

	private static ItemDetailService itemDetailService;

	static {
		itemDetailService = new ItemDetailServiceImpl();
	}

	public static void main(String[] args) {
		int itdId1 = 1;
		int itdId2 = 2;
		int value = 10;
		
		System.out.println("1. Thực hành transaction management");
		itemDetailService.updateAmounts(itdId1, itdId2, value);
		
		System.out.println("-- Kết thúc chương trình --");
	}

}
