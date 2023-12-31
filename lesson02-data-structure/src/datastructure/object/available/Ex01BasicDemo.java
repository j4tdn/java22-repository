package datastructure.object.available;

import datastructure.object.custom.Item;

public class Ex01BasicDemo {
	public static void main(String[] args) {
		//KDL nguyên  thủy
		int a = 8;
		
		//KDL đối tượng tự tạo
		Item item = new Item(1,'A',11);
		
		//KDL đối tượng có sãn của java Integer, Character, String
		
		 // hàm có gạch ngang là hàm Deprecated
		 Integer i1 = new Integer(22);
		 Integer i2 = new Integer(33);
		 Integer i3 = new Integer(33); 
		 System.out.println("i1 --> "+ System.identityHashCode(i1));
		 System.out.println("i2 --> "+ System.identityHashCode(i2));
		 System.out.println("i3 --> "+ System.identityHashCode(i3));
		 
		 Integer n1 = 55; 
		 Integer n2 = 66; 
		 Integer n3 = 66; 
		 System.out.println("n1 --> "+ System.identityHashCode(n1));
		 System.out.println("n2 --> "+ System.identityHashCode(n2));
		 System.out.println("n3 --> "+ System.identityHashCode(n3));
		 
		 
		 System.out.println("================n3 = 88");
		 n3 = 88;
		 System.out.println("n2 --> "+ System.identityHashCode(n2));
		 System.out.println("n3 --> "+ System.identityHashCode(n3));
		 // luôn sử dụng cách khai báo trực tiếp cho biến thuộc kiểu DL đối tượng có sãn trong java
		 // giúp tiếp kiệm memory khi khởi tạo ô nhớ 
		 
		 
	}
}
