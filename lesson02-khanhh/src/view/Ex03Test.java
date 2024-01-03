package view;

import java.util.Scanner;

public class Ex03Test {
	
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		System.out.println("Nhập N = ");
		int number = ip.nextInt();
		
		if (number < 0) {
			System.out.println("N");
		} else {
			System.out.println(tinhGiaiThua(number));
		}
	}
	
	public static int tinhGiaiThua(int number) {
		if (number == 0 || number == 1) {
			return 1;
		} else {
			int lt = 1;
			for (int i = 1; i <= number; i++) {
				lt *= i;
			}
			return lt;
		}
	}
	

}
