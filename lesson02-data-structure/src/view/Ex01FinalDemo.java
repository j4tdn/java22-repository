package view;

import datastructure.object.custom.Item;

public class Ex01FinalDemo {
	
	public static void main(String[] args) {
		// final là final ở STACK 
		// không thể cập nhật giá trị của biến ở vùng nhớ STACK
		
		// giá trị của biến kiểu KNT ---> STACK
		// giá trị của biến kiểu KĐT ---> HEAP
		
		//final STACK
		//Immutable Object // ko thể thay đổi đc j của đối tượng
		
		final int a = 5;
//		a = 7;
		System.out.println("a --> " + a);
		
		final Item item = new Item(1,'A',11);
//		item = new Item(2,'B',22);
		item.id = 9; 
		System.out.println("item -->" +item);
	}
	
}
