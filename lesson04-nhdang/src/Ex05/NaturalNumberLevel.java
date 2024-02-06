package Ex05;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NaturalNumberLevel {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		do {
			System.out.print("Nhập số phần tử mảng: ");
			n = sc.nextInt();
			if (n < 3 || n > 20) {
				System.out.println("Nhập lại.");
			}
		}while (n < 3 || n > 20); 

		int array[] = new int[n];

		System.out.println("Nhập các phần tử cho mảng: ");
		for (int i = 0; i < n; i++) {
			System.out.print("Phần tử " + (i + 1)+ ": ");
			array[i] = sc.nextInt();
		}
		System.out.println("\nGiá trị mảng: ");
		System.out.println(Arrays.toString(array));
		countDivisors(array);
	}
	public static void countDivisors(int[] array) {
		int [] countDivisor = new int[array.length];
		System.out.println("\nSố ước số của các phần tử trong mảng ");
		for (int i = 0; i < array.length; i++) {
			int count = 0;
			for (int j = 1; j <= array[i]; j++) {
				if (array[i] % j == 0) {
					count++;
				}
			}
			countDivisor[i] = count;
			System.out.println("Phần tử " + (i+1) + " có " + count + " ước số.");
		}
		Arrays.sort(countDivisor);
		System.out.println(Arrays.toString(countDivisor));
	}
}
