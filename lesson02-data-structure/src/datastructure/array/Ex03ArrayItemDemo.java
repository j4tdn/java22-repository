package datastructure.array;


import java.util.Arrays;

import datastructure.object.custom.Item;

public class Ex03ArrayItemDemo {
	
	public static void main(String[] args) {
		// tìm kiếm nhanh 1 class  trong Eclipse --> ctrl shift t(type)
		Item[] items = fetchItems();
		
		// viết chương trình, hàm tìm những mặt hàng có giá trị >300
		//input:  items
		// --> codition: item's price>300
		//output: Item[] --> price >300
		System.out.println("items --> "+ Arrays.toString(filter(items)));
		
	}
	
	private static Item[] filter(Item[] items) {
		// không biết mảng lưu trữ chính xác bao nhiêu phần tử
		Item[] result = new Item[items.length];
		int running = 0;
		for (int i = 0; i< items.length; i++) {
			Item currentItem = items[i];
			if(currentItem.salesPrice > 300) {
				result[running++] = currentItem;
			}
		}
		// ở đây kết qua mảng thu đc sẽ chứa phần tử null 
		// sử dụng hàm  tạo mảng coppy những phần tử khác null
		Item[] finalResult = Arrays.copyOfRange(result, 0, running);
		
		
		return finalResult;
		
	}
	
	private static Item[] fetchItems() {
		return new Item[] {
				new Item(1, 'A', 253f),
				new Item(2, 'B', 122f),
				new Item(3, 'C', 888f),
				new Item(4, 'D', 462f),
				new Item(5, 'E', 513f),
				new Item(6, 'F', 236f),
				new Item(7, 'G', 420f)
		};
	}
}
