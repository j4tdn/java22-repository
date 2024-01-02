package homework;

import java.util.Random;

/*
 	Bài 4: Viết chương trình tính tổng giải thừa của các số nguyên dương S = a! +b! + c! + d!
	Biết rằng a,b,c,d là các số nguyên ngẫu nhiên từ 10 đến 20 → [10, 20]
 */
public class Ex04 {

	public static void main(String[] args) {

		Random rd = new Random();

		int a = rd.nextInt(2, 10);
		System.out.println("Số a --> " + a);

		int b = rd.nextInt(2, 10);
		System.out.println("Số b --> " + b);

		int c = rd.nextInt(2, 10);
		System.out.println("Số c --> " + c);

		int d = rd.nextInt(2, 10);
		System.out.println("Số d --> " + d);

		System.out.println("Giai thừa của a --> " + Factorial(a));
		System.out.println("Giai thừa của b --> " + Factorial(b));
		System.out.println("Giai thừa của c --> " + Factorial(c));
		System.out.println("Giai thừa của d --> " + Factorial(d));

		System.out.println("Tổng giai thừa của 4 số --> " + Sum(Factorial(a), Factorial(b), Factorial(c), Factorial(d)));
	}

	public static long Factorial(int n) {
		long s = 1;
		for (int i = 1; i <= n; i++) {
			s = s * i;
		}
		return s;
	}

	public static long Sum(long m, long n, long x, long y) {
		long sum = m + n + x + y;
		return sum;
	}
}
