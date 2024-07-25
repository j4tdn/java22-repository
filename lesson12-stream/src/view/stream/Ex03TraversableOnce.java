package view.stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex03TraversableOnce {
	
	public static void main(String[] args) {
		int[] pa = {1,2,3,4};
		Integer[] po =  {1,2,3,4};
		
		IntStream s4 = Arrays.stream(pa);
		Stream<Integer> s5 = Arrays.stream(po);
		
		s4.forEach(System.out::println);
	}
}
