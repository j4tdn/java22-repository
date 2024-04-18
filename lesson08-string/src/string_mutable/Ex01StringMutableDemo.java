package string_mutable;

import util.StringUtils;

public class Ex01StringMutableDemo {

	/*
	 * Trong bài học xử lý chuỗi, 2 loại string
	 * 
	 * string immutable --> class String --> khai báo theo kiểu literal hoặc object
	 * string mutable --> class StringBuilder, StringBuffer -->cho phép cập nhật giá
	 * trị của ô nhớ tại HEAP sau khi khởi taooj
	 * 
	 * 
	 */

	public static void main(String[] args) {
		String s1 = "hello"; // H1
		StringUtils.print("s1 before ", s1);

		String s2 = "teo"; // H2
		s1 = s1 + "" + s2; // H3

		StringUtils.print("s1 after ", s1);

		System.out.println("\n=====================\n");
		StringBuilder sb1 = new StringBuilder("goodbye"); // h4
		StringUtils.print("sb1 before", sb1);
		sb1.append(" ").append("nam");
		sb1.deleteCharAt(0);
		StringUtils.print("sb1 after", sb1);
	}
}
