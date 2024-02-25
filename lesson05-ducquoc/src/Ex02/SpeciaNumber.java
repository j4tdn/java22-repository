package Ex02;

import java.util.Scanner;

public class SpeciaNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhập số cần kiểm tra");
		int a = scanner.nextInt();
		if(isSpeciaNumber(a)) {
			System.out.println("a là số đặc biệt");
			
		}else {
			System.out.println("a ko phải số đặc biệt");
		}
	}
	public static boolean isSpeciaNumber(int a ) {
		int sum = 0;
		for(int i = 0; sum < a; i++) {
			sum += i;
			if(sum == a) {
				 return true; 
			}
			
		}
		return false;
	}
}
