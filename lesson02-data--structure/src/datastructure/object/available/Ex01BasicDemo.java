package datastructure.object.available;

import datastructure.object.custom.Item;

public class Ex01BasicDemo {
	public static void main(String[] args) {
		//KDL nguyên thủy --> int, char, double...
		//Mục đích : Lưu trữ dữ liệu
		int a = 8;
		
		//KDL đối tượng tự tạo ra --> Item, Student...
		Item item = new Item(1, 'A', 11);
		
		/*
		 * KDL đối tượng có sẵn trong JAVA --> Interger, Character, String
		 * class Integer {
		 *   int value;
		 *   public Integer(int value) {
		 *      this.value = value;
		 *      }
		 * }
		 * +Sử dụng từ khóa new gọi hàm khởi tạo để khởi tạo giá trị cho biến
		 * -->lưu trữ trong vùng nhớ HEAP của JVM
		 * --> cứ new ra thì luôn khởi tạo ô nhớ mới cho đối tượng tạo ra
		 * 
		 * +Gán giá trị trực tiếp cho biến, ko dùng từ khóa new
		 * -->lưu trữ trong vùng nhớ HEAP - constant pool(Immutable object)
		 * -->truước khi khởi tạo ô nhớ mới, kiểm tra xem giá trị của đối tương muốn tạo ra
		 * đã có ở constant pool chưa, nếu chưa có thì mới tạo ra
		 * 
		 * --> luôn sử dụng cách khai báo và gán giá trị trực tiếp cho biến thuộc KDL
		 * đối tượng có sẵn của JAVA
		 * -->tiết kiệm heap memory khi khởi tạo nhiều ô nhớ có giá trị trùng nhau
		 * 
		 * Phân biệt int, Integer
		 * 
		 * --> int: 100% mình phải có giá trị, mặc định là 0
		 * -->Integer: null, có giá trị
		 * -->Tuổi của sinh viên --> ko bắt buộc nullable --> Integer
		 * --> lý thuyết: bắt buộc có giá trị --> int
		 *                ko bắt buộc -- Integer
		 * --> thực tế: hầu hết các thuộc tính dùng để chứa dữ liệu từ database(cớ sở dữ liệu lấy ra)
		 * từ CSDL lại có khả năng nullable nên hầu hết --> KDL đối tượng
		 * -->những biến logic xử lý bài toán --> N		 
		 * */
		
		String s1 = "hello";
		String s2 = new String("hi");
		
		Integer i1 = new Integer(22);//H1
		Integer i2 = new Integer(33);//H2
		Integer i3 = new Integer(33);//H3
		System.out.println("i1 code --> " + System.identityHashCode(i1));
		System.out.println("i2 code --> " + System.identityHashCode(i2));
		System.out.println("i3 code --> " + System.identityHashCode(i3));
		
		Integer n1 = 55;//H4
		Integer n2 = 66;//H5
		Integer n3 = 66;//H5
		System.out.println("n1 code --> " + System.identityHashCode(n1));
		System.out.println("n2 code --> " + System.identityHashCode(n2));
		System.out.println("n3 code --> " + System.identityHashCode(n3));
		System.out.println("============ 'n3 = 88' =============");
		
		n3 = 88;//H6
		System.out.println("n2 --> " + n2);
		System.out.println("n3 --> " + n3);
		System.out.println("n2 code --> " + System.identityHashCode(n2));
		System.out.println("n3 code --> " + System.identityHashCode(n3));
		
		Long l1 = 22l;
		Long l2 = new Long(33l);
		
	}

}
