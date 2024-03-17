package homework;

import java.util.Scanner;

/*
 Bài 6: Viết chương trình tìm số nguyên lớn, nhỏ nhất trong 3 chữ số a,b,c
		Biết rằng a,b,c là số nguyên được nhập từ bàn phiasm và nhỏ hơn 20 [0, 20)
		VD: Nhập a = 6
		Nhập b = “xyz” → báo lỗi, yêu cầu nhập lại
		Nhập b = 12
		Nhập c = 8
 		*/

public class Ex06 {
	public static void main(String[] args) {

		System.out.println("Nhập số a --> ");
		int a = CheckInput();

		System.out.println("Nhập số b --> ");
		int b = CheckInput();

		System.out.println("Nhập số c --> ");
		int c = CheckInput();

		System.out.println("a --> " + a);
		System.out.println("b --> " + b);
		System.out.println("c --> " + c);

		System.out.println("Số lớn nhất trong 3 số là --> " + Max(a, b, c));
		System.out.println("Số nhỏ nhất trong 3 số là --> " + Min(a, b, c));

	}

	public static int CheckInput() {

		int count = 0;

		Scanner ip = new Scanner(System.in);
		while (!ip.hasNextInt() && (count < 5)) {
			System.out.println("Bạn nhập sai định dạng !");

			ip.next();

			if (ip.hasNextInt()) {
				int a = Integer.parseInt(ip.next());
				return a;

			} else {

				count++;
				if (count == 5) {
					System.out.println("Bạn nhập sai định dạng 5 lần. Kết thúc chương trình !");
					System.exit(0);

				}

			}

		}

		int b = Integer.parseInt(ip.next());
		return b;

	}

	public static int Min(int a, int b, int c) {
		int min = Math.min(a, b);
		if (c < min) {
			return c;
		} else {
			return min;
		}
	}

	public static int Max(int a, int b, int c) {
		int max = Math.max(a, b);
		if (c > max) {
			return c;
		} else {
			return max;
		}
	}
}
