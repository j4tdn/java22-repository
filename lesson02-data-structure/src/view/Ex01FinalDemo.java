package view;

import datastructure.object.custom.Item;

public class Ex01FinalDemo {
public static void main (String [] args) {
	/*
	 final là final ở STACK
	 không thể cập nhật giá trị của biến ở vùng nhớ STACK
	 giá trị của biến KNT -> Stack
	 giá trị của biến KĐT -> HEAP
	 
	 final stack
	 immutable object: không thể cập nhật thuộc tính bên trong
	 
	 */
	final int a =5; 
	
	System.out.println("a= " + a);
	final Item item = new Item(1, 'A', 11);
//	item = new Item (2, 'B', 22);
	System.out.println("item --> " + item);
}
}
