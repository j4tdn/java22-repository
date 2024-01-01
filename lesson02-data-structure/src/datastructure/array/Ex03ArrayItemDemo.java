package datastructure.array;

import java.util.Arrays;

import datastructure.object.custom.Item;

public class Ex03ArrayItemDemo {
	
	public static void main(String[] args) {
		Item[] items = fetchItems();
		
		Item[] filteredItems = filter(items);
		
		System.out.println("items --> " + Arrays.toString(filteredItems));
	}
	
	private static Item[] filter(Item[] items) {
		Item[] result = new Item[items.length];
		int running = 0;
		
		for (int i = 0; i < items.length; i++ ) {
			Item currentItem = items[i];
			if (currentItem.salesPrice > 300) {
				result[running++] = currentItem;
			}
		}
		
		Item[] finalResult = Arrays.copyOfRange(result, 0, running);
		return finalResult;
	}
	
	private static Item[] fetchItems() {
		return new Item[] {
				new Item(1, 'a', 253f),
				new Item(2, 'b', 122f),
				new Item(3, 'c', 888f),
				new Item(4, 'd', 462f),
				new Item(5, 'e', 513f),
				new Item(6, 'f', 236f),
				new Item(7, 'g', 420f)
		};
	}

}
