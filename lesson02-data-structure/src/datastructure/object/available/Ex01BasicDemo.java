package datastructure.object.available;

import datastructure.object.custom.Item;

public class Ex01BasicDemo {
	public static void main(String[] args) {
		// KDL nguyên thủy
		int a = 8;
		char b = '@';
		
		// KDL đối tượng --> tự tạo ra
		Item x = new Item();
		Item item = new Item(1, 'A', 11);
		//Item item2 = 1, 'B', 22
		
		// KDL đối tượng --> có sẵn của Java
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
		
		System.out.println("==================== 'n3 = 88' =====================");
		
		n3 = 88;
		System.out.println("n2 --> " + n2);
		System.out.println("n2 --> " + n3);
		
		String s1 = new String("hello");
		String ss1 = new String("hello");
		
		String s2 = "Xin chào";
		String ss2 = "Xin chào";
		
		System.out.println("---------");
		
		Character c1 = new Character('a');
		Character c2 = 'b';
	}
}
