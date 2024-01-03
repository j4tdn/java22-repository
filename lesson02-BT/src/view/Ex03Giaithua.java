package view;

import java.util.Scanner;

public class Ex03Giaithua {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào số nguyên n: " );
		
		int n = sc.nextInt();
		int res = 1;
		
		for (int i = 1; i <=n; i++) {
			res *= i;
			
		}
		System.out.println("Kết quả là: " + res);
	}

}
