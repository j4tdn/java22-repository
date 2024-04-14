package string_demo;

import java.util.Arrays;

public class Ex02StringDemo {
	
	public static void main(String[] args) {
		String s = "welcome to java 22 class";
		String s1 = "we";

		System.out.println("Kiểm tra chuỗi s1 có phải là bắt đầu của s hay không --> " + s.startsWith(s1));
		System.out.println("Kiểm tra chuỗi s1 có phải là kết thúc của s hay không --> " + s.endsWith(s1));
		
		// thay thế s1 bằng s2 trong chuỗi s
		String s2 = "We";
		s = s.replace(s1, s2).replace("j", "J");;
		System.out.println("Thay thế s1 bằng s2 trong chuỗi s --> " + s);
		
		// Loại bỏ khoảng trắng thừa chủa chuỗi s3
		// Các từ cách bởi khoảng trắng, ko có khoảng trắng ở 2 đầu
		// khi user nhập vào bị thừa --> thay thế
		// java hiểu \\ là \
		// \\s -> \s
		// regex -->{n} 	 --> yêu cầu n kí tự
		//		 -->{n, m}   --> yêu cầu kí tự từ m đến n inclusive
		//		 -->{n,}     --> 					n đến dương vô cùng
		//		 -->{1,} = + --> yêu cầu số kí tự từ 1 trở đi
		
		s = " 		Welcome	 to  Java22 	class		 ";
		s = s.strip().replaceAll("\\s{1,}" , " ");

		s = s.strip().replaceAll("\\s{1,}" , " "); //strip() dùng để bỏ khoảng trắng ở đầu và cuối

		System.out.println("Chuỗi s mới --> |||" + s + "|||");
		
		s = "aaaaa";
		s = s.replaceAll("a+", "A");
		System.out.println("Thao tác với string regex -->" + s);
		
		//Viết chương trình loại bỏ các phần tử trùng nhau
		//Các phần tử trùng nhau chỉ lấy 1 kí tự --> UNIQUE
		s = "aaabbccccd";
//		s = s.replaceAll("a+", "A").replaceAll("b+", "B");
		
		// [a,b]+ --> 1 hoặc nhiều kí tự a hoặc b hoặc ab hoặc ba --> thỏa mãn điều kiện

		s = "15bazadx202wks999";
//		s = s.replaceAll("[a,b]+", "-");
//		String[] sa = s.split("[a,b]+");
		String[] sa = s.split("[a-z]+");
		System.out.println("Thao tác với string regex 2 -->" + Arrays.toString(sa));

//		s = s.replaceAll("[a,b]+", "-");
//		String[] sa = s.split("[a,b]+");
		s = "15bazadx202wks999";
		String[] sa1 = s.split("[a-z]+");
		String sb = s.replaceAll("[a-z]+", "");
		System.out.println("Thao tác với string regex 2(split) -->" + Arrays.toString(sa1));
		System.out.println("Thao tác với string regex 3(replaceAll) --> " + sb);
		
		//Kiểm tra số điện thoại :
		// tất cả là kí tự số
		// số lượng 10-11
		// yêu câu kí tự đầu là mấy
		
		//kiểm tra 1 file có phải là file hình ảnh
		// ko phải là folder
		// đuôi phải kết thúc bằng jpg, png, gif...
		
		//Tạo chuỗi con s bắt đầu từ vị trí 2 --> bài tóa cắt chuỗi
		s = "Welcome to Java22 class";
		String s3 = s.substring(0); //[0,s.length);
		System.out.println("Bài toán cắt chuỗi --> " + s3);
		
		s3 = s.substring(0,s.length()-1); //[0,s.length);
		System.out.println("Bài toán cắt chuỗi 2 --> " + s3);
		
		//Xác định chuỗi s2 có tồn tại trong chuỗi s1 ko
		System.out.println("Kiểm tra tồn tại hay ko --> " + s.toLowerCase().contains("java"));
	}

}
