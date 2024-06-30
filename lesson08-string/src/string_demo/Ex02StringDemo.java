package string_demo;

import java.util.Arrays;

public class Ex02StringDemo {
	/*
	 * 
	 */
	public static void main(String[] args) {
		String s = "welcome to java22 class";
		String s1 = "we";
		
		System.out.println("1. Kiểm tra chuỗi s1 có phải chuỗi bắt đầu của s hay không: "+s.startsWith(s1));
		System.out.println("1. Kiểm tra chuỗi s1 có phải chuỗi kết thúc của s hay không: "+s.endsWith(s1));
		
		String s2 = "We";
		s = s.replace(s1, s2).replace("j", "J");
		System.out.println("2. Thay thế s1 bằng s2 trong s: "+ s);
		
		// Loại bỏ khoảng trắng
		// các từ thường cách nhau bởi 1 khoảng trắng, và không có khoảng trắng 2 đầu
		s = "         Welcome     to   Java22           class          ";
		s = s.strip().replaceAll("\\s{1,}", " ");
		/*
		 * \s: đại diện khoảng trắng
		 * \\s: \ là 1 kí tự đặt biệt --> \\-->\
		 * \\s: \s
		 * regex--> {n} --> yêu cầu n ký tự
		 				--> ...
		 */
		System.out.println("Chuỗi s mới --> |||"+s+"|||");
		s = "aaaaaa";
		s = s.replaceAll("a+", "A");
		System.out.println("Chuỗi s mới --> |||"+s+"|||");
		
		// viết chương trình loại bỏ các kí tự trùng nhau chỉ lấy 1 kí tự
		s = "aaabbcccc";
//		s = s.replaceAll("a+", "a").replaceAll("b+", "b").replaceAll("c+","c");
		s = "aa45adsc2002bxbb999";
//		s = s.replaceAll("[a,b]+", "-");
		String[] sa = s.split("[a-z]+");
		System.out.println("Chuỗi s mới --> |||"+Arrays.toString(sa)+"|||");
		
		
		// kiểm tra ddienj thoại hợp lệ 
		/*
		 - tất cả phải là số
		 - số lương 10-11 chữ số
		 - các nhà đài có kí tự đầu:
		   (034), (037), (0122),...
		 */
		//kiểm tra 1 file có phải là 1 file hình ảnh ?
		/*
		 - file đó phải là file, ko p là folder
		 - đuôi file kết thúc bằng jpg, jpeg, png
		 */
		
		//tạo chuỗi con từ chuỗi s từ vị trí số 2
		s = "welcome to java22 class";
		String s3 = s.substring(2);
		System.out.println("Chuỗi cắt ra đc từ s: "+ s3);
		// xác đinh s2 có tồn tại trong s1 ko
		System.out.println("Kiểm tra tồn tại: "+ s.contains(s3));
		
		// phân biệt StringBuilder và StringBuffer
		// ==> video
	}
}