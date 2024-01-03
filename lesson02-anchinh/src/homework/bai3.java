package homework;

import java.util.Scanner;

/*
 * Viết chương trình tìm giai thừa của một số nguyên dương N
Biết rằng: N có thể được nhập từ bàn phím hoặc khai báo sẵn
Ví dụ: Nhập N = 1 → 1! = 1
Nhập N = 5 → 5! = 5.4.3.2.1 = 120
 */
public class bai3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập n: ");
		int n = sc.nextInt();
		int result = factorial(n);
		System.out.println(n + "!= " + result);
		
	}
	public static int factorial(int n) {
		int fac = 1;
		for(int i = 2; i <= n; i++) {
			fac *= i;
		}		
		return fac;
	}
	
}
