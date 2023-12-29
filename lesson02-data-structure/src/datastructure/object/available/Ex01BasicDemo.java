package datastructure.object.available;

import datastructure.object.custom.Item;

public class Ex01BasicDemo {
	
	public static void main(String[] args) {
		
		// promitive type
		int a = 5;
		System.out.println("a -> "+a);
		
		// object type: custom
//		Item item = new Item();
//		Item item1 = new Item(1, 'A', 10);
		
		System.out.println("\n============\n");
		
		// object type: available
		// Integer: int value
		// Character: char value
		
		//immutable: ko thể cập nhật giá trị của thuộc tính trên ô nhớ heap
		//mutable: cập nhật giá trị của thuộc tính trên ô nhớ heap bình thường
		
//		Integer o1 = new Integer(12);
//		Integer o2 = new Integer(28);
//		
//		System.out.println("o1 -> "+o1.toString());
//		System.out.println("o2 -> "+o2);
//		
//		Integer o3 = 77;
//		Integer o4 = 88;
//		
//		Character c1 = new Character('@');
//		Character c2 = '^';
//		System.out.println("c1 -> "+ c1);
//		System.out.println("c2 -> "+ c2);
		
		// Để khởi tạo giá trị cho KDL đối tượng
		// Hầu hết sử dụng từ khóa 'new' -> dùng cho KDL đối tượng có sẵn của Java hoặc Custom
	
		// Đặc biệt: Với những KDL có sẵn của Java( Integer, Long, Double, String, Float ...)
		// có thể khởi tạo giá trị ko cần dùng từ khóa 'new'
		
		// Luôn sử dụng cách khai báo và gán giá trị trực tiếp
		// cho biến thuộc KDL đối tượng có sẵn của JAVA
		
		// -> tiết kiệm heap memory khi khởi tạo nhiều ô nhớ có giá trị trùng nhau
		
		Integer i1 = new Integer(22); //H1
		Integer i2 = new Integer(33); //H2
		Integer i3 = new Integer(33); //h3
		
		System.out.println("i1 code --> " +System.identityHashCode(i1));
		System.out.println("i1 code --> " +System.identityHashCode(i2));
		System.out.println("i1 code --> " +System.identityHashCode(i3));
		
		Integer n1 = 55; //H4
		Integer n2 = 66; //H5
		Integer n3 = 66; //H5
		
		System.out.println("n1 code --> " +System.identityHashCode(n1));
		System.out.println("n2 code --> " +System.identityHashCode(n2));
		System.out.println("n3 code --> " +System.identityHashCode(n3));
		
	}
}
