package ex05;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);

		String text = null;
		int wrongTimes = 0;
		do {
			System.out.println("Nhập số phần tử mảng: ");
			text = ip.next();
			if (isNumber(text)) {
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

		System.out.println("Số phần tử mảng --> " + text);
		int n = Integer.parseInt(text);

		int[] listNumber = new int[n];

		System.out.println("Nhập giá trị cho từng phần tử mảng: ");
		Input(listNumber);
		printf("Các phần tử của mảng ", listNumber);
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

	public static void Input(int[] listNumber) {
		Scanner ip = new Scanner(System.in);
		int n = listNumber.length;
		String text = null;
		for (int i = 0; i < n; i++) {
			do {
				System.out.println("Nhập phần tử thứ " + (i + 1) + " : --> ");
				text = ip.nextLine();
				if (isNumber(text)) {
					int num = Integer.parseInt(text);
					if (num >= 3 && num <= 20) {
						listNumber[i] = num;
						break;
					} else {
						System.out.println("Nhập sô trong khoảng từ 3 tới 20 !");
					}
				}

			} while (true);
		}

	}

	public static void printf(String prefix, int[] listNumber) {
		int n = listNumber.length;
		int[] factors = new int[n];
		System.out.println(prefix + " {");
		for (int i = 0; i < n; i++) {
			factors[i] = countFactors(listNumber[i]);
			System.out
					.println("Phần tử thứ " + (i + 1) + " là --> " + listNumber[i] + " có " + factors[i] + " ước số. ");
		}

		for (int j = 0; j < n - 1; j++) {
			for (int k = 0; k < n - j - 1; k++) {

				// kiểm tra nếu số lượng ước số của phần tử trước lớn hơn phần tử liền sau thì
				// hoán đổi 2 phần tử cho nhau
				// hoặc nếu 2 số có cùng số lượng ước số thì số nào có giá trị nhỏ hơn sẽ được
				// đứng trước
				if ((factors[k] > factors[k + 1])
						|| ((listNumber[k] > listNumber[k + 1]) && (factors[k] == factors[k + 1]))) {
					swap(factors, k);
					swap(listNumber, k);

				}
			}
		}

		System.out.println("Các phần tử sau khi sắp xếp theo số lượng ước số: ");
		for (int a = 0; a < n; a++) {
			System.out.print(listNumber[a] + " ");
		}
	}

	public static int countFactors(int listNumber) {
		int count = 0;
		for (int i = 1; i <= listNumber; i++) {

			if (listNumber % i == 0) {
				count++;
			}
		}
		return count;
	}

	public static void swap(int[] list, int k) {
		int temp = list[k];
		list[k] = list[k + 1];
		list[k + 1] = temp;
	}
}
