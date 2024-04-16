package datastructure.object.available;

import datastructure.object.custom.Item;

public class Ex01BasicDemo {
	
	public static void main(String[] args) {
		// KDL nguyên thủy --> int, double, char, long
		// Mục đích: Lưu trữ dữ liệu
		int a = 8;
		char b = '@';
		
		// KDL đối tượng --> tự tạo ra --> Item, Student ...
		Item x = new Item();
		Item item = new Item(1, 'A', 11);
		item.id = 11;
		// Item item2 = 1, 'B', 22
		
		/* 
		 KDL đối tượng --> có sẵn của Java --> Integer, Character, String, Double
		 --> luôn luôn có duy nhất 1 thuộc tính bên trong
		 Integer   --> int value
		 String    --> byte[] value
		 Character --> char value
		 class Integer {
		    int value;
		    
		    public Integer(int value) {
		       this.value = value;
		    }
		 }
		 
		 + Sử dụng từ khóa new gọi hàm khởi tạo để khởi tạo giá trị cho biến
		   --> lưu trữ trong vùng nhớ HEAP của JVM
		   --> cứ new ra thì luôn khởi tạo ô nhớ mới cho đối tượng tạo ra
		   
		   
		 + Gán giá trị trực tiếp cho biến, ko dùng từ khóa new
		   --> lưu trữ trong vùng nhớ HEAP - constant pool(immutable object)
		   --> trước khi khởi tạo ô nhớ mới, kiểm tra xem giá trị của đối tượng
		       muốn tạo ra đã có ở constant pool chưa, nếu chưa có thì mới tạo ra
		   
		 --> luôn sử dụng cách khai báo và gán giá trị trực tiếp
		 cho biến thuộc KDL đối tượng có sẵn của Java
		 
		 --> tiết kiếm heap memory khi khởi tạo nhiều ô nhớ
		 có giá trị trùng nhau
		 Integer a = 8;
		 String s = "hello"
		 
		 Phân biệt int, Integer    ?
		           double, Double  ?
		           char, Character ?
		 
		 --> int: 100% mình phải có giá trị, mặc định là 0
		 --> Integer: null, có giá trị
		 
		 --> Tuổi của sinh viên --> ko bắt buộc nullable --> Integer
		 
		 --> lý thuyết: bắt buộc có giá trị --> int
		              : ko bắt buộc --> Integer
		              
		 --> thực tế, hầu hết các thuộc tính dùng để chứa dữ liệu từ database(cở sở dữ liệu lấy ra)
		 từ CSDL lại có khả năng nullable nên hầu hết --> KDL đối tượng
		 
		 --> những biến logic xử lý bài toán --> NT, ĐT
		   
		 */
		Integer i1 = new Integer(22); // H1
		Integer i2 = new Integer(33); // H2
		Integer i3 = new Integer(33); // H3
		System.out.println("i1 code --> " + System.identityHashCode(i1));
		System.out.println("i2 code --> " + System.identityHashCode(i2));
		System.out.println("i3 code --> " + System.identityHashCode(i3));
		
		Integer n1 = 55; // H4
		Integer n2 = 66; // H5
		Integer n3 = 66; // H5
		System.out.println("n1 code --> " + System.identityHashCode(n1));
		System.out.println("n2 code --> " + System.identityHashCode(n2));
		System.out.println("n3 code --> " + System.identityHashCode(n3));
		
		System.out.println("=================== 'n3 = 88' ======================");
		
		n3 = 88; // H6
		System.out.println("n2 code --> " + System.identityHashCode(n2));
		System.out.println("n3 code --> " + System.identityHashCode(n3));
		System.out.println("n2 --> " + n2); // 66 88 
		System.out.println("n3 --> " + n3); // 88
		
		
		String s1 = new String("hello");
		String ss1 = new String("hello");
		
		String s2 = "xin chào";
		String ss2 = "xin chào";
		
		System.out.println("-----");
		
		Character c1 =  new Character('a');
		Character c2 = 'b';
		
	
	/*
	 
	 Projects sử dụng JAVA 1.0 - 1.8
	 Integer i1 = new Integer(4);
	 Integer i2 = new Integer(7);
	 ----
	 1000 chỗ
	 
	 JDK Available Code - 1.8 --> phát triển JAVA 9
	 Hàm này có vấn đề(?) tốn memory --> phát triển 1 hàm khác tốt hơn hàm này
	 @Deprecated(since='9', '.......')
     public Integer(int value) {
        this.value = value;
     }
     
     #####
	 
	 */
	}
}
