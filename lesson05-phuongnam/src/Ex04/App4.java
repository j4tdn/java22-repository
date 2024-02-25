package Ex04;

import java.util.Random;
import java.util.Scanner;

public class App4 {

	public static void main(String[] args) {
		Random rd = new Random();
		Scanner ip = new Scanner(System.in);
		int n;

		String text1 = null;
		int wrongTimes = 0;
		do {
			System.out.println("Nhập số phần tử: ");
			text1 = ip.next();
			if (isNumber(text1)) {
				break;
			}
			wrongTimes++;
			System.out.println("Số lần nhập sai = " + wrongTimes);
			if (wrongTimes == 5) {
				System.out.println("Số lần nhập sai = 5 --> Tài khoản bị khóa");
				System.out.println("Thoát chương trình");
				System.exit(0);
			}
		} while (true);

		n = Integer.parseInt(text1);
		int[] numbers = new int[n];
		int[] temp;
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = rd.nextInt(0, 100);
			System.out.println(numbers[i]);
		}

		printf("Dãy số", numbers);
		findSingle(numbers);
	}

	public static void printf(String prefix, int[] numbers) {
		System.out.println(prefix + " {");
		for (int number : numbers) {
			System.out.println("  + " + number);
		}
		System.out.println("}\n");
	}

	public static boolean isNumber(String text) {
		for (int i = 0; i < text.length(); i++) {
			char letter = text.charAt(i);
			if (!Character.isDigit(letter)) {
				return false;
			}
		}
		return true;
	}

	public static void findSingle(int numbers[]) {

		int length = numbers.length;
		for (int i = 0; i < length; i++) {
			int count = 0;
			for (int j = 0; j < length; j++) {
				if (numbers[i] == numbers[j]) {
					count++;
				}
			}
			if (count == 1) {
//				  numbers[i];
				System.out.println(numbers[i] + " xuất hiện 1 lần trong dãy số");
			}
		}

	}
}
