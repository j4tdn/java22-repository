package baitap;

import java.util.Scanner;

public class bai3TimGiaiThua {
	public static void main(String[] args) {
		
		Scanner ip = new Scanner(System.in);
		
		System.out.print("Nhập số N: ");
		int n = ip.nextInt();
		
		System.out.println(n + "! = " + timGiaiThua(n));
			
	}
	private static long timGiaiThua(int n) {
		if(n < 0) {
			return 0;
		}
		if(n == 0 || n == 1) {
			return 1;
		}
		long giaithua = 1;
		for (int i = 2; i <= n; i++) {
			giaithua = giaithua * i;
		}
		return giaithua;
	}

}
