package homework;

import java.util.Random;

public class Ex04 {
	/*
	Bài 4: Viết chương trình tính tổng giải thừa của các số nguyên dương S = a! +b! + c! + d!
	Biết rằng a,b,c,d là các số nguyên ngẫu nhiên từ 10 đến 20 → [10, 20]
	 */
	
	
	public static void main(String[] args) {
		Random rd = new Random();
		int a = rd.nextInt(10,20);
		int b = rd.nextInt(10,20);
		int c = rd.nextInt(10,20);
		int d = rd.nextInt(10,20);
		
		long sum = calculateFactorialSum(a) + calculateFactorialSum(b) 
				+ calculateFactorialSum(c) + calculateFactorialSum(d);
		
		System.out.println("a: " + a + ", b: " + b + ", c: " + c + ", d: " + d );
		System.out.println("Tổng lũy thừa: " + sum);
	}
	public static long calculateFactorialSum(int n) {
		long factorial = 1;
		
		for(int i = 1; i <= n; i++) {
			factorial *= i;
		}
		return factorial;
	}
}
