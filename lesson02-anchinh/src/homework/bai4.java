package homework;

import java.util.Random;

/*
 * Viết chương trình tính tổng giải thừa của các số nguyên dương S = a! +b! + c! + d!
Biết rằng a,b,c,d là các số nguyên ngẫu nhiên từ 10 đến 20 → [10, 20]
 */
public class bai4 {
	public static void main(String[] args) {
		Random rd = new Random();
		
		int a = rd.nextInt(10,21);
		int b = rd.nextInt(10,21);
		int c = rd.nextInt(10,21);
		int d = rd.nextInt(10,21);
		int sum = factorial(a) + factorial(b) + factorial(c) + factorial(d);
		
		System.out.println("a-> "+ factorial(a));
		System.out.println("b-> "+ factorial(b));
		System.out.println("c-> "+ factorial(c));
		System.out.println("d-> "+ factorial(d));
		System.out.println("sum = " + sum);
			
	}
	public static int factorial(int n) {
		int fac = 1;
		for(int i = 2; i <= n; i++) {
			fac *= i;
		}		
		return fac;
	}
}
