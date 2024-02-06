package Ex05;

import java.util.Scanner;

public class NumberLever {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n;
		int index = 0;
		do {
			System.out.print("Nhập tổng chữ số ( 3<= n <=20 ) = ");
			n = scanner.nextInt();
		} while (n < 3 || n > 20);
		int number[] = new int[n];
		for (int i = 0; i <= n - 1; i++) {
			System.out.print("Nhập số thứ " + (i + 1) + " =");
			number[i] = scanner.nextInt();
		}
		sortByLevel(number);
		System.out.println("Mảng sau khi đã sắp xếp theo level tăng dần:");
		for (int x : number) {
			System.out.print(x + " ");
		}
	}

	public static void sortByLevel(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (level(arr[j]) > level(arr[j + 1])) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	public static int level(int number) {
		int level = 0;
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				++level;
			}
		}
		return level;

	}

}
