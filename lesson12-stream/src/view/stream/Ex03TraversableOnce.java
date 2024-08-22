package view.stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex03TraversableOnce {
	
	/*
	 Câu hỏi: Vì sao sau khi gọi các hàm của stream để xử lý xong mình không lưu lại kết trong
	   stream mà phải chuyển đổi sang KDL khác
	 --> dữ liệu trong stream chỉ cho phép duyệt 1 lần duy nhất
	 --> dùng 1 lần rồi thôi ko cho đi duyệt xử lý trong các lần tiếp
	 */
	
	public static void main(String[] args) {
		int[] pa = {1, 2, 3, 4};
		Integer[] po = {1, 2, 3, 4};
		
		IntStream s4 = Arrays.stream(pa);
		Stream<Integer> s5 = Arrays.stream(po);
		
		s5.forEach(System.out::println);
		s5.forEach(System.out::println);
	}
	
}	