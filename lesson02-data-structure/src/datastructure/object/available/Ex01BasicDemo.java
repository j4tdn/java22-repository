package datastructure.object.available;

import datastructure.object.custom.Item; 

public class Ex01BasicDemo {
	public static void main(String[] args) {
		//KDL nguên  thuỷ
		int a = 8;
		
		//KDL đối tượng --> tự tạo ra
		Item item = new Item(1, 'A', 11d);
		
		//KDL đối tượng --> có sẵn của Java
		String s = "hello";
//		String s2 = new String("hi");
		
		Long l1 = 221l;
		Long l2 = new Long(331);
		
		System.out.println("l1-->" + l1 );
		System.out.println("l2-->" + l2 );
		
		// điểm khác nhau khi khởi tạo giá trị trực tiếp và thông qua từ khoá new 
		//cho KDL đối tượng có sẵn của Java
		
		//Phân biệt int, Integer, 
		//phân biệt long, Long
		
		/*
		+ Sử dụng từ khoá new gọi hàm khởi tạo để khởi tạo giá trị cho biến
		--> lưu trữ trong vùng nhớ HEAP của JVM
		--> cứ new ra thì luôn khởi tạo ô nhớ mới cho đối tượng tạo ra
		
		+ Gán giá trị trực tiếp cho biến, ko dùng từ khoá new
		--> lưu trữ trong vùng nhớ HEAP - constant pool (immutable object)
		--> trước khi khởi tạo ô nhớ mới, kiểm tra xem giá trị của đối tượng
		    muốn tạo ra đã có ở constant pool chưa, nếu chưa có thì mới tạo ra
		    
		--> luôn sử dụng cách khai báo và gán giá trị trực tiếp cho biến thuộc 
		KDL đối tượng có sẵn của Java
		
		--> tiết kiệm heap memory khi khởi tạo nhiều ô nhớ có giá trị trùng nhau
		Integer a = 8;
		String s = "hello"
		
		*/
		
		Integer i1 = new Integer(22); //H1
		Integer i2 = new Integer(33); //H2
		Integer i3 = new Integer(33); //H3
		System.out.println("i1 code--> " + System.identityHashCode(i1));
		System.out.println("i2 code--> " + System.identityHashCode(i2));
		System.out.println("i3 code--> " + System.identityHashCode(i3));
		
		
		Integer n1 = 55; //H4
		Integer n2 = 66; //H5
		Integer n3 = 66; //H5
		System.out.println("n1 code --> " + System.identityHashCode(n1));
		System.out.println("n2 code --> " + System.identityHashCode(n2));
		System.out.println("n3 code --> " + System.identityHashCode(n3));
		
		System.out.println("=================== 'n3 = 88' ======================");
		
		n3 = 88; //H6
		System.out.println("n2 code --> " + System.identityHashCode(n2));
		System.out.println("n3 code --> " + System.identityHashCode(n3));
		System.out.println("n2 --> " + n2); //66 88
		System.out.println("n3 --> " + n3); //88
		
		
		String s1 = new String("hello");
		String ss1 = new String("hello");
		
		String s2 = "xin chào";
		String ss2 = "xin chào";
		
		System.out.println("------");
		
		Character c1 = new Character('a');
		Character c2 = 'b';
		
		
		
		//phân biệt int,Integer ?
		//          double, Double?
		
		
		
		
		
	}
}
