package datastructture.object.available;

import datastructure.object.custom.Item;

public class Ex01BasicDemo {
	// điểm khác nhau khi khởi tạo giá trị trưucj tiếp và thôn qua giá trị new cho kiểu dữ liệu đối tượng của java
	// phân biệt int và interger
	// phân biệt long Long
	public static void main(String[] args) {
		int  a = 8 ;
		Item item = new Item(1, 'a',4);
		Integer i1 = new Integer (12);// hàm bị def vi cây tich 
		Integer i2 = 44; // kiểu dư liệu có sẵn luôn luôn có duy nhất 1 thuộc tính duy nhát bên trong|
		//
		// dùng cách nào tốt hơn ? tại sao java lại cho phép khai báo như dòng 13?
		// trả lời thứ 1 : với kiểu có sẵn của ja va dùng từu khóa new gọi hàm khởi tạo khởi tạo giá trị cho 1 biến 
		// gán 1 giá trị trực tiếp cho biến 
		// 
		// vì trong ja chỉ có 1 thuộc tính 
		// dùng từ khóa new luôn khởi tạo 1 ô nhớ mới cho cái đối tượng mình tạo ra 
		// lưu trử trong vùng nhớ heap của ja va (cóntan pool) ô nhớ không thay đỏi dxudowc 
		// trước khi khởi tạo ô nớ mới 
		
		Integer i3 = new Integer (12);
		Integer i4 = new Integer (12);
		Integer i5 = new Integer (12);
		System.out.println(System.identityHashCode(i3));
		System.out.println(System.identityHashCode(i4));
		System.out.println(System.identityHashCode(i5));
		Integer n1 = 44;
		Integer n2 = 44;
		Integer n3 = 44;
		System.out.println(System.identityHashCode(n1));
		System.out.println(System.identityHashCode(n2));
		System.out.println(System.identityHashCode(n3));
		n3 = 88;
		System.out.println(n3);
	}
}
