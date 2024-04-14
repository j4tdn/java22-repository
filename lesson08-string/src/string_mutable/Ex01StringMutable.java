package string_mutable;

import util.StringUtils;

public class Ex01StringMutable {
	/*
	 Trong bài xử lý chuỗi, 2 loại String
	 
	 string immutable
	 --> class String
	 --> 	   khai báo theo kiểu literal hoặc object
	 
	 
	 string mutable
	 --> class StringBuilder, StringBuffer
	 --> cho phép mình cập nhật giá trị của ô nhớ tại HEAP sau khi khởi tạo
	 
	 // các hàm trong StringBuffer 100% giống StringBuilder
	  * phân biệt StringBuilder và StringBuffer sẽ tìm hỉu khi học xong
	  lập trình đa luồng: video tham khảo
	  
	  Sử dụng String Immutable trong hầu hết các trường hợp
	  --> Để khai báo, xử lý, tính toán
	  
	  Sử dụng String Mutable khi gặp các vấn đề liên quan đến cập nhât, cộng chuỗi nhiều lần
	  --> Immutable sẽ tốn bộ nhớ
	  --> Chuyển qua dùng Mutabel
	  
	 */
	public static void main(String[] args) {
		String s1 = "hello"; //H1
		StringUtils.print("s1 before", s1);
		
		String s2 = "teo";	 //H2
		s1 = s1 + " " + s2;  //H3
		StringUtils.print("s1 after", s1);
		
		System.out.println("\n====================\n");
		
		StringBuilder sb1 = new StringBuilder("goodbye"); //H4
		StringUtils.print("sb1 before", sb1);
		
		sb1.append(" ").append("nam"); // append() --> hàm cộng chuỗi
		sb1.deleteCharAt(0);
		StringUtils.print("sb1 after", sb1);
		
	}

}
