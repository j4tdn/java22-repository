package view.stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex03TraversableOnce {

	public static void main(String[] args) {

		//Dữ liệu trong stream chỉ cho phép duyệt 1 lần duy nhất 
		// ==> Ko được lưu dữ liệu trong stream mà phải chuyển qua kiểu dữ liệu khác .	

		int[]  pa = {1,2,3,4};
		 Integer[] po = {1,2,3,4};
		 
		 IntStream s4 = Arrays.stream(pa);
		 Stream<Integer> s5 = Arrays.stream(po);
		 
		 s4.forEach(System.out::println);
		 s4.forEach(System.out::println);

		 

	}

}
