package datastructure.object.available;

import datastructure.object.custom.Item;

public class Ex01BasiDemo {
	
	public static void main(String[] args) {
		//kdl nguyên thủy --> int, double, char, long
		int a = 8;
		
		//kdl đối tượng --> tự tạo ra --> Item, Student,...
		Item item = new Item(1, 'a', 111);
		
		//kdl đối tượng --> có sẵn trong javs --> Integer,Character, String
		
		Integer i1 = new Integer(22);
		Integer i2 = new Integer(33);
		Integer i3 = new Integer(33);
		System.out.println("i1 code --> " + System.identityHashCode(i1));
		System.out.println("i2 code --> " + System.identityHashCode(i2));
		System.out.println("i3 code --> " + System.identityHashCode(i3));

		Integer n1 = 55;
		Integer n2 = 66;
		Integer n3 = 66;
		System.out.println("n1 code --> " + System.identityHashCode(n1));
		System.out.println("n2 code --> " + System.identityHashCode(n2));
		System.out.println("n3 code --> " + System.identityHashCode(n3));
		
		n3 = 88;
		System.out.println("n2 --> " + n2);
		System.out.println("n3 --> " + n3);


	}

}
//điểm khác nhau khi khởi tạo giá trị trực tiếp và thông qua
//từ khóa new cho kdl đối tượng có sẵn trong java
//
//phân biệt int và Integer , long và Long