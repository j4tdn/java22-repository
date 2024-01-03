package homework;

import java.util.Scanner;

public class Ex7 {
	public static void main(String[] args) {
		System.out.println("7. Chuyển cơ số nhị phân");
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so can kiem tra");
		int n = sc.nextInt();
		String binary = "";
		while (n>0) {
			binary = n%2+binary;
			n = n/2;
		}
		System.out.println("He nhi phan cua " + n + " la" + binary);
	}
}
