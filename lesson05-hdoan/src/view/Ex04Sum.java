package view;

import java.util.Arrays;

public class Ex04Sum {

	public static void main(String[] args) {
		int[] a1 = { 1, 5, 8, 9, 2, 5, 9 };

		System.out.println("Array a1: " + sumExceptMinMax(a1));
	}

	public static int sumExceptMinMax(int[] arr) {
		if (arr == null || arr.length < 3) {
			return 0;
		}
		Arrays.sort(arr);
		int sum = 0;
		for (int i = 1; i < arr.length - 1; i++) {
			if (arr[i] != arr[i - 1] && arr[i] != arr[i + 1]) {
				sum += arr[i];
			}
		}
		return sum;
	}
}
