package datastructure.object;

import datastructure.object.Item;

public class Ex02ObjectDemo_UpdateValue {
	
	public static void main(String[] args) {
		
		int a = 5;
		int b = a;
		//cap nhat gia tri a = ?
		
		Item item = new Item ();
		// cap nhat gia tri a = .. item1
		//					a = new Item()
		// -- cap nhat dia chi cua bien a o STACK 
		
		// cap nhat gia tri a.x = ?
		// 					a.y = ?
		// -- cap nhat gia tri cua cac thuoc tinh o o nho ma bien A dang tro den o HEAP
		
		// toan tu = la toan tu gan
		// gan gia tri o STACK
		
		Item itA = new Item (1, 'A', 111);
		Item itB = new Item (2, 'B', 222);
		Item itC = new Item (3, 'C', 333);
		
		System.out.println("itA address --> " +itA.hashCode());
		System.out.println("itB address --> " +itB.hashCode());
		System.out.println("itC address --> " +itC.hashCode());
		
		itB.salesPrice = 444;
		itC.id = 6;
		itA = itB;
		itA.salesPrice = 777;
		
		System.out.println("itA address after--> " +itA.hashCode());
		System.out.println("itB address after--> " +itB.hashCode());
		System.out.println("itC address after--> " +itC.hashCode());
		
		
		
		
		System.out.println("itA --> " + itA);
		System.out.println("itB --> " + itB);
		System.out.println("itC --> " + itC);
	}

}
