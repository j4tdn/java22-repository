package homework;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số nguyên dương N - tối thiểu 2 số ");
		int n = sc.nextInt();
		if (number(n)) {
			System.out.println(n + " là số đối xứng");
		} else {
			System.out.println(n + " không phải số đối xứng");
		}
	
	}
	public static boolean number(int n) {
		int a = 0; 
		int temp = n;
		while (n > 0) {
			a = a*10 + temp % 10;
			temp /= 10;
		} if(a == n) {
			return true;
		} else {
			return false;
		}
	}
	
}
