package ex05;

import java.util.*;

public class Ex05 {
	public static void main(String[] args) {

		int n = 5;
		int[] numbers = generateRandomNumbers(n);

		System.out.print("input:");
		printArray(numbers);

		sortNumbersByLevel(numbers);

		System.out.print("output:");
		printArray(numbers);
	}

	public static int[] generateRandomNumbers(int n) {
		Random random = new Random();
		int[] numbers = new int[n];
		for (int i = 0; i < n; i++) {
			numbers[i] = random.nextInt(3, 20);
		}
		return numbers;
	}

	public static int calculateLevel(int num) {
		int count = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		return count;
	}

	public static void sortNumbersByLevel(int[] numbers) {
		for (int i = 0; i < numbers.length - 1; i++) {
			for (int j = 0; j < numbers.length - i - 1; j++) {
				if (calculateLevel(numbers[j]) > calculateLevel(numbers[j + 1])) {
					int temp = numbers[j];
					numbers[j] = numbers[j + 1];
					numbers[j + 1] = temp;
				}
			}
		}
	}

	public static void printArray(int[] arr) {
		for (int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();
	}

}
