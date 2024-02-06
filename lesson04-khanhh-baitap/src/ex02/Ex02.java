package ex02;

import java.util.ArrayList;
import java.util.Random;

public class Ex02 {
	public static void main(String[] args) {
		
		int n = 10; 
		
		int[] numbers = generateRandomNumbers(n);

		System.out.print("input:");
		printArray(numbers);

		sortNumbers(numbers);
		
		System.out.print("\noutput:");
		printArray(numbers);
	}

	public static int[] generateRandomNumbers(int n) {
		Random random = new Random();
		int[] numbers = new int[n];
		for (int i = 0; i < n; i++) {
			numbers[i] = random.nextInt(5, 100);
		}
		return numbers;
	}

	public static void sortNumbers(int[] numbers) {
		ArrayList<Integer> divisibleBy7 = new ArrayList<>();
		ArrayList<Integer> divisibleBy5 = new ArrayList<>();
		ArrayList<Integer> otherNumbers = new ArrayList<>();

		for (int number : numbers) {
			if (number % 7 == 0 && number % 5 != 0) {
				divisibleBy7.add(number);
			} else if (number % 5 == 0 && number % 7 != 0) {
				divisibleBy5.add(number);
			} else {
				otherNumbers.add(number);
			}
		}

		int index = 0;
		for (int num : divisibleBy7) {
			numbers[index++] = num;
		}
		for (int num : otherNumbers) {
			numbers[index++] = num;
		}
		for (int num : divisibleBy5) {
			numbers[index++] = num;
		}
	}

	public static void printArray(int[] arr) {
		for (int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
}
