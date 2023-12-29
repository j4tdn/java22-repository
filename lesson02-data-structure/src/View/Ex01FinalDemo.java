package View;

import datastructure.object.custom.Item;

public class Ex01FinalDemo {
	//final là final ở Stack
	// ko thê cập nhật giá trị của biến ở Stack
	
	//giá tri của biến KNT -> STACK
	// giá trị của biến KDT --> HEAP
	public void main (String [] args) {
	final int a=5;
	//a=7;
	System.out.println("a-->" +a);
	
	final Item item = new Item(1,'a',11d);
	//item = new Item(2,'b' ,22d);
	item.id =9;
	System.out.println("a-->" +item);
	}
}
