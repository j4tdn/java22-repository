package homework;

import java.util.Scanner;

/*
	Bài 6: Viết chương trình tìm số nguyên lớn, nhỏ nhất trong 3 chữ số a,b,c
	Biết rằng a,b,c là số nguyên được nhập từ bàn phiasm và nhỏ hơn 20 [0, 20)
	VD: Nhập a = 6
	Nhập b = “xyz” → báo lỗi, yêu cầu nhập lại
	Nhập b = 12
	Nhập c = 8
	Số lớn nhất là 12
	Số nhỏ nhất là 6
 */

public class Ex06 {
	
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		System.out.print("Nhập a = ");
		int a = ip.nextInt();
		

		// Nhập số nguyên b
		int b;
		do {
			System.out.print("Nhập b = ");
			while (!ip.hasNextInt()) {
				System.out.println("Lỗi, Bạn cần nhập một số nguyên.");
				ip.next();
			}
			b = ip.nextInt();
		} while (b < 0 || b >= 20);

		System.out.print("Nhập c = ");
		int c = ip.nextInt();

		findMinMax(a, b, c);

	}

	public static void findMinMax(int a, int b, int c) {
		int max = a;
		int min = a;

		if (b > max) {
			max = b;
		} else if (b < min) {
			min = b;
		}

		if (c > max) {
			max = c;
		} else if (c < min) {
			min = c;
		}
		System.out.println("Số lớn nhất là " + max);
		System.out.println("Số nhỏ nhất là " + min);
	}
	
}
