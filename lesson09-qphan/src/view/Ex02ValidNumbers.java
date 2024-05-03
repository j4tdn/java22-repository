package view;

import java.util.Arrays;

public class Ex02ValidNumbers {
	
	public static void main(String[] args) {
		String[] elements = {"azkb12tt981oiu", "aaaa", "1234bbb34ki987"};
		System.out.println(
				"Số tự nhiên hợp lệ lớn nhất --> " 
		       + Arrays.toString(getLargestValidNumbers(elements)));
	}
	
	private static int[] getLargestValidNumbers(String[] elements) {
		int[] maxValidNumbers = new int[elements.length];
		
		for (int i = 0; i < elements.length; i++) {
			int max = getValidMaxNumber(elements[i]);
			maxValidNumbers[i] = max;
		}
		
		return maxValidNumbers;
	}
	
	private static int getValidMaxNumber(String s) {
		String[] tokens = s.split("[a-z]+");
		if (tokens.length == 0) {
			return 0;
		}
		int max = Integer.MIN_VALUE;
		for (String token: tokens) {
			if (!token.isEmpty()) {
				int number = Integer.parseInt(token);
				max = Math.max(number, max);
			}
		}
		return max;
	}
	
}
