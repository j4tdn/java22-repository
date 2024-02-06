/*
Bài 5: Viết chương trình tìm level của số tự nhiên.
Biết rằng level của một số tự nhiên được xác định bằng số lượng ước số của nó
Ví dụ:
8 có level là 4 vì có 4 ước số: 1, 2, 4 ,8
5 có level là 2 vì có 2 ước số: 1, 5
9 có level là 3 vì có 3 ước số: 1, 3, 9
20 có level là 6 vì có 6 ước số: 1, 2, 4, 5, 10, 20
Cho một mảng số nguyên gồm n (3 <= n <= 20) phần tử. Viết chương trình sắp xếp mảng số
nguyên theo level tăng dần
Ví dụ: n = 4. Mảng số nguyên: 8 5 9 20
Kết quả sau khi đã sắp xếp: 5 9 8 20
 */
package BT5;

import java.util.Scanner;

public class LevelNumber {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);

		String text = null;
		do {
			System.out.print("Nhập số phần tử mảng: ");
			text = ip.next();
			if (isNumber(text)) {
				break;
			}
		} while (true);

		System.out.println("Số phần tử mảng: " + text);
		int n = Integer.parseInt(text);

		int[] listNumber = new int[n];

		System.out.println("Nhập giá trị cho từng phần tử mảng: ");
		Input(listNumber);
		printf("Các phần tử của mảng: ", listNumber);
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
				System.out.print("Nhập phần tử thứ " + (i + 1) + " :  ");
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
					.println("Phần tử thứ " + (i + 1) + " là: " + listNumber[i] + " có " + factors[i] + " ước số. ");
		}

		for (int j = 0; j < n - 1; j++) {
			for (int k = 0; k < n - j - 1; k++) {
				if ((factors[k] > factors[k + 1])
						|| ((listNumber[k] > listNumber[k + 1]) && (factors[k] == factors[k + 1]))) {
					swap(factors, k);
					swap(listNumber, k);

				}
			}
		}

		System.out.print("Các phần tử sau khi sắp xếp theo số lượng ước số: ");
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