package datastructure.array;

import java.util.Arrays;

import datastructure.object.custom.Item;

public class Ex03ArrayItemDemo {
	public static void main(String[] args) {
		//tìm kiếm 1 class trong eclipse -> ctrl shift t
		Item[] items=fetchItems();
		
		//viết chương trình, hàm tìm những mặt hàng có giá > 300
		//input: items
		//-->condition: item's price > 300
		
		//output: Item[] --> price > 300
		Item[] filterdItems = filter(items);
		System.out.println("items--> "+ Arrays.toString(filterdItems));
		
	}
	private static Item[] filter(Item[] items) {
		//khi ko biet mang luu chinh xac may phan tu
		//--> nghi den so luong phan tu toi da co the luu
		Item[] result = new Item[items.length];
		int running = 0; //4
		
		for(int i=0;i<items.length;i++) {
			Item currentItem = items[i];
			if(currentItem.salePrice > 300) {
				result[running++] = currentItem;
			}
		}		
		//copy non-null elements vào final result
		//running: số lượng phần tử !=null trong result
		/* Item[] finalResult=new Item[running];
		for(int i=0; i < running; i++) {
			finalResult[i] = result[i];
		}
		
		return finalResult; */
		Item[] finalResult= Arrays.copyOfRange(result, 0, running);
		return finalResult;
	}
	private static Item[] fetchItems() {
		return new Item[] {
				new Item(1,'A',256d),
				new Item(2,'B',122d),
				new Item(3,'C',364d),
				new Item(4,'D',563d),
				new Item(5,'E',462d),
				new Item(6,'F',752d),
		};
	}
}
