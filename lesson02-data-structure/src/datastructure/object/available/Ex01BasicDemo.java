package datastructure.object.available;

import datastructure.object.Item;

public class Ex01BasicDemo {
	public static void main(String[] args) {
		//KDL nguyên thủy --> int, char, long, double,...
		int a = 8;
		
		//KDL đối tượng --> tự tạo ra --> Item, Student,...
		Item item = new Item(1, 'A', 111);
		
		/*
		KDL đối tượng --> có sẵn của JAVA --> Integer, Character, String
		--> luôn luôn có duy nhất 1 thuộc tính bên trong
		Integer --> int value
		String --> byte [] value
		Character --> char value
		class Integer {
			int value;
			
			public Integer (int value){
			this.value = value;
			}
		}
		
		+ Sử dụng từ khóa new gọi hàm khởi tạo để khởi tạo giá trị cho biến 
		 --> lưu trữ trong vùng nhớ HEAP của JVM
		 --> cứ new ra thì luôn khởi tạo ô nhớ mới cho đối tượng mình tạo ra
		 
		+ Gán giá trị trực tiếp không dùng từ khóa new	
		 --> lưu trữ trong vùng nhớ HEAP - constant pool (immutable object)
		 --> trước khi khởi tạo ô nhớ mới, kiểm tra xem giá trị của đối tượng
		 	 muốn tạo ra đã có constant pool hay chưa, nếu chưa có thì mới tạo ra
		 	 
		--> luôn luôn sử dụng cách khai báo và gán giá trị trực tiếp
		cho biến thuộc tính KDL đối tượng có sẵn của Java
		
		--> tiết kiệm HEAP memory khi khởi tạo nhiều ô nhớ
		có giá trị trùng nhau
		Integer a = 8;
		String s = "hello";
		
		Phân biệt int, Integer      ?
		          double , Double   ?
		          
		--> int: 100% mình phải có giá trị, mặc định là 0
		--> Integer: null, có giá trị
		
		--> Tuổi của sinh viên --> ko bắt buộc nullable --> Integer
		
		--> lý thuyết: bắt buộc có giá trị --> int
					 : ko bắt buộc --> Integer
		
		--> thực tế, hầu hết các thuộc tính dùng để chưa dữ liệu từ database(cơ sở dữ liệu)
		từ CSDL lại có khả năng nullable --> KDL đối tượng
		
		--> những biến logic xử lý bài toán --> NT, ĐT	
		*/
		Integer i1 = new Integer(22); // H1
		Integer i2 = new Integer (33); // H2
		Integer i3 = new Integer (33); // H3
		System.out.println("i1 code --> " + System.identityHashCode(i1));
		System.out.println("i2 code --> " + System.identityHashCode(i2));
		System.out.println("i3 code --> " + System.identityHashCode(i3));
		
		Integer n1 = 55; // H4
		Integer n2 = 66; // H5
		Integer n3 = 66; // H5
		System.out.println("n1 code --> " + System.identityHashCode(n1));
		System.out.println("n2 code --> " + System.identityHashCode(n2));
		System.out.println("n3 code --> " + System.identityHashCode(n3));
		
		System.out.println("=============== 'n3 = 88' ============= ");
		
		n3 = 88;
		System.out.println("n2 --> " + n2); // 66
		System.out.println("n3 --> " + n3); // 88
		
		String s1 = new String ("hello");
		String ss1 = new String ("hello");
		String s2 = "xin chào";
		String ss2 = "xin chào";
		
		System.out.println("--------");
		
		Character c1 = new Character ('a');
		Character c2 = 'b';
		
		
		// Điểm khác nhau khi khởi tạo giá trị trực tiếp và thông qua từ khóa new 
		// cho KDL đối tượng có sẵn của JAVA
		
		// Phân biệt int và Integer
		// Phân biệt long, Long
	}

}
