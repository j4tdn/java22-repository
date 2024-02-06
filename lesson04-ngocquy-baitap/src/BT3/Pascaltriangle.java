/*
Bài 3: Viết chương trình in ra màn hình tam giác Pascal. 
Ví dụ, với n=4 sẽ in ra hình sau:

1 1
1 2 1
1 3 3 1
1 4 6 4 1
1 5 10 10 5 1

Gợi ý:
- Hàng thứ n được xác định từ hàng n-1:
- Phần tử đầu tiên và phần tử cuối cùng luôn bằng 1.
- Phần tử thứ 2 là tổng của phần tử thứ nhất và thứ 2 của hàng n-1
- Phần tử thứ k của hàng thứ n là tổng của phần tử thứ k-1 và k của hàng thứ n-1.
 */
package BT3;

import java.util.Scanner;

public class Pascaltriangle {

	public static void main(String[] args) {

		int n;
		Scanner ip = new Scanner(System.in);
		do {
			System.out.println(" Nhập n: ");
			String nStr = ip.nextLine();
			if (isNumber(nStr)) {
				n = Integer.parseInt(nStr);
				if (n > 0)
					break;
			}
		} while (true);
		output(Pascal(n), n);
	}

	private static int[][] Pascal(int n) {

		int[][] arr = new int[n + 2][n + 2];
		for (int i = 0; i < n + 2; i++) {
			for (int j = 0; j < n + 2; j++) {
				if ((j == 0 || j == i) && i > 0)
					arr[i][j] = 1;
				else if (j > i)
					arr[i][j] = 0;
				else if (i == 0 && j == 0)
					arr[i][j] = 0;
				else {
					arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
				}
			}
		}
		return arr;
	}

	private static void output(int[][] arr, int n) {
		for (int i = 0; i < n + 2; i++) {
			for (int j = 0; j < n + 2; j++) {
				if (arr[i][j] == 0)
					System.out.print(" \t");
				else
					System.out.print(arr[i][j] + "\t");
			}
			System.out.println("");
		}
	}

	private static boolean isNumber(String text) {
		for (int i = 0; i < text.length(); i++) {
			char letter = text.charAt(i);
			if (!Character.isDigit(letter)) {
				return false;
			}
		}
		return true;
	}
}