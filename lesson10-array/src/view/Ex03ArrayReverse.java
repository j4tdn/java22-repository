package view;

import java.util.Arrays;

public class Ex03ArrayReverse {

	public static void main(String[] args) {
		String[] elements = {"a","b","c","d","e","f"};
		
		System.out.println("origin-->" + Arrays.toString(elements));
		
		reverse(elements);
		System.out.println("reverse-->" + Arrays.toString(elements));

	}
	
	private static void reverse(String[] elements) {
		int length = elements.length;
		for(int i = 0; i < elements.length / 2; i++) {
			String tmp = elements[i];
			elements[i] = elements[length - i - 1];
			elements[length - i - 1] = tmp;
			
		}
	}
}
