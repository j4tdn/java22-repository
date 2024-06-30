
package string_mutable;

import util.StringUtils;

public class Ex01StringMutableDemo {

	public static void main(String[] args) {
		/*
		 Trong bài xử lý chuỗi, 2 loại String
		 
		 string immutable
		 --> class String
		 --> 	   khai báo theo kiểu literal hoặc object
		 
		 
		 string mutable
		 --> class StringBuilder, StringBuffer
		 --> cho phép mình cập nhật giá trị của ô nhớ tại HEAP sau khi khởi tạo
		 
		 // các hàm trong StringBuffer 100% giống StringBuilder
		  * phân biệt StringBuilder và StringBuffer sẽ tìm hiểu khi học xong
		  lập trình đa luồng: video tham khảo
		  
		  Sử dụng String Immutable trong hầu hết các trường hợp
		  --> Để khai báo, xử lý, tính toán
		  
		  Sử dụng String Mutable khi gặp các vấn đề liên quan đến cập nhât, cộng chuỗi nhiều lần
		  --> Immutable sẽ tốn bộ nhớ
		  --> Chuyển qua dùng Mutabel
		  
		 */
		String s1 = "hello";
		StringUtils.print("s1 before", s1);

		String s2 = "teo";
		s1 = s1 + " " + s2 ;
		StringUtils.print("s1 after", s1);
		
		
		System.out.println("\n==============\n");
		StringBuilder sb1 = new StringBuilder("goodbye");
		StringUtils.print("sb1 after", sb1);

		sb1.append(" ").append("nam");
		StringUtils.print("sb1 after", sb1);

	}

}
