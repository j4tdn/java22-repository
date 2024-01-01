package datastructure.array;

import java.util.Arrays;

import datastructure.object.custom.Item;

public class Ex03ArrayItemDemo {
	public static void main(String[] args) {
		// Tìm kiếm nhanh 1 clas trong Eclipse --> ctrl shift t(type)
		Item[] items = fetchItems();
		//Viết chương trình, hàm tìm nhũng mặt hàng có giá trị > 300
		// input: items
		//  --> condition: item's price > 300
		//output: item[] --> price > 300
		Item[] filteredItems = filter(items);
		System.out.println("items --> " + Arrays.toString(filteredItems));
		
	}
	private static Item[] filter(Item[] items) {
		//khi ko biết mảng lưu chính xác mấy phần tử
		// --> nghĩ đến số lượng phần tử tối đa có thể lưu
		Item[] result = new Item[items.length];
		int running = 0;
		for (int i = 0; i < items.length; i++) {
			Item currentItem = items[i];
			if (currentItem.salesPrice > 300) {
				result[running++] = currentItem;
			}	
		}
		// copy non-null elements vào final result
		// running: số lượng phần tử khác null trong result
		/*Item[] finalResult = new Item[running];
		 * for (int i = 0; i < running; i++) {
		 *    finalResult[i] = result[i];
		 *    }
		 * return finalResult;
		 */
		Item[] finalResult =  Arrays.copyOfRange(result, 0, running);
		return finalResult;
	}
	private static Item[] fetchItems() {
		return new Item[] {
			new Item(1, 'A', 253f),
			new Item(2, 'B', 123f),
			new Item(3, 'C', 888f),
			new Item(4, 'D', 456f),
			new Item(5, 'E', 523f),
			new Item(6, 'F', 234f),
			new Item(7, 'G', 422f),
		};
	}

}
