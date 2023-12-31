package datastructure.object.available;

import datastructure.object.custom.Item;

public class Ex01BasicDemo {

	public static void main(String[] args) {
		// KDL nguyên thuỷ
		int a = 8;
		// KDL đối tượng --> tự tạo ra
		Item item = new Item(1, 'A', 11);
		// KDL đối tương --> có sẵn của Java
		String s1 = "hello";
		String s2 = new String("hi");

		Long l1 = 22l;
		Long l2 = new Long(33l);

		System.out.println("l1 -->" + l1);
		System.out.println("l2 -->" + l2);

		Integer z = new Integer(a);
		// Deprecated ( bị loại bỏ ) : được xoá hoàn toàn từ version này sang version
		// khác .

		/*
		 * Projects sử dụng JAVA 1.0 - 1.8
		 * 
		 * JDK Available Code - 1.8 --> phát triển JAVA 9 (vì có thể tốn memory ) JDK
		 * available Code - 1.8 public Integer (int value ) { this.value = value ; }
		 * 
		 * 
		 */
		// Kiểu đối tượng có sẵn cho JAVA chỉ luôn luôn có 1 thuộc tính --> Có thể code
		// 2 cách :
		Integer x = new Integer(22);// Dùng cách này luôn luôn tạo ra ô nhớ mới --> Tốn dữ liệu
		/*
		 * Gán giá trị trực tiếp cho biến, ko dùng từ khóa new --> lưu trữ trong vùng
		 * nhớ HEAP - constant pool(immutable object) --> trước khi khởi tạo ô nhớ mới,
		 * kiểm tra xem giá trị của đối tượng muốn tạo ra đã có ở constant pool chưa,
		 * nếu chưa có thì mới tạo ra --> int: 100% mình phải có giá trị, mặc định là 0
		 * --> Integer: null, có giá trị
		 */
		Integer y = 44;
		// luôn sử dụng cách khai báo và gán giá trị trực tiếp
		// cho biến thuộc KDL đối tượng có sẵn của Java

		Integer i1 = new Integer(22); // H1
		Integer i2 = new Integer(33); // H2
		Integer i3 = new Integer(33); // H3

		System.out.println("i1 code --> " + System.identityHashCode(i1));
		System.out.println("i2 code --> " + System.identityHashCode(i2));
		System.out.println("i3 code --> " + System.identityHashCode(i3));
		Integer n1 = 55;// H4
		Integer n2 = 66;// H5
		Integer n3 = 66;// Có constant pool rồi thì ko tạo ra nữa và lấy địa chỉ của n2 gán cho STACK
						// của n3 --> H5

		System.out.println("n1 code --> " + System.identityHashCode(n1));
		System.out.println("n2 code --> " + System.identityHashCode(n2));
		System.out.println("n3 code --> " + System.identityHashCode(n3));

		n3 = 88; // Dấu = 100% hoạt động ở STACK
		System.out.print("n2 = " + n2);
		System.out.print("n3 = " + n3);
		System.out.println("n2 code --> " + System.identityHashCode(n2));
		System.out.println("n3 code --> " + System.identityHashCode(n3));

		// --> int: 100% mình phải có giá trị, mặc định là 0
		// --> Integer: null, có giá trị (Chứa dữ liệu từ database lấy ra nên dùng kiểu đối tượng ) 
		/*
		  --> lý thuyết: bắt buộc có giá trị --> int
		              : ko bắt buộc --> Integer
		              
		 --> thực tế, hầu hết các thuộc tính dùng để chứa dữ liệu từ database(cở sở dữ liệu lấy ra)
		 từ CSDL lại có khả năng nullable nên hầu hết --> KDL đối tượng
		 
		 --> những biến logic xử lý bài toán --> NT, ĐT
		 */
	}

}
