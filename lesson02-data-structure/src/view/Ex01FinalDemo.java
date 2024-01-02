package view;

import datastructure.object.Item;
public class Ex01FinalDemo {
	public static void main(String[] args) {
		//final la final o STACK
		//ko the cap nhat gia tri cua bien o vung nho STACK
		
		//gia tri cua bien KNT --> STACK
		// gia tri cua bien KDT --> HEAP
		
		//final stack
		// immutable object: object tao ra thuoc tinh ben trông ko thể cập nhật được
		int a = 5;
		//a = 7;
		System.out.println("a --> " + a);
		
		final Item item =  new Item(1, 'A', 11);
		//item = new Item(2, 'B', 22);
		item.id = 9;
		System.out.println("item --> " + item);
		
		// c1 item = new Item(2, 'B', 22);
		// c2 item.id = ?
	}

}
