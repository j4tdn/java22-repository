package datastructire.object.available;

import datastructure.object.custom.Item;

public class Ex01BasicDemo {
	public static void main(String[] args) {
		//KDL nguyên thủy --> int , double, char,long,..
		int a =8;
		//KDL đối tượng --> tự tạo ra --> tự tạo ra --> Item, Student ...
		Item item = new Item(1,'A',22);
		//KDL đối tượng --> có sẵn của java --> Integer , Character, String
		String s =" hello";
		String s1 = new String("hi");
		Long l1 =22l;
		Long l2 = new Long(331);
		System.out.println("l1-->" + l1);
		System.out.println("l2-->" + l2);
		//Điểm khác nhau khi khởi tạo giá trị trực tiêp và thông qua từ khóa new 
		// cho KDL đối tượng có sẵn cửa Java
		// Phân biệt int , Integer 
		//Phân biệt long ,Long
	}
}
