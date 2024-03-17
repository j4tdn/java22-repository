package homework;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int i = 1;
		long giaiThua = 1;
		System.out.println("Nhap so nguyen duong N: ");
		int n = Integer.parseInt(ip.nextLine());
		if (n < 0) {
			System.out.println("Vui long nhap so nguyen duong");
		} else {
			for (i = 1; i <= n; i++) {
				giaiThua = giaiThua*i;
			}
			System.out.println("Gia tri giai thua cua N la " + giaiThua);
		}
		}
		
}
