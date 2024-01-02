package homework;

import java.util.Random;

public class Ex04 {
	public static void main(String[] args) {
		Random rd = new Random();
		int a = rd.nextInt(10,21);
		int b = rd.nextInt(10,21);
		int c = rd.nextInt(10,21);
		int d = rd.nextInt(10,21);
		System.out.println("a --> " + a);
		System.out.println("b --> " + b);
		System.out.println("c --> " + c);
		System.out.println("d --> " + d);
		long s = sum(a, b, c, d);
		System.out.println("Tong giai thua cua a,b,c,d la " + s);
	}
	public static long giaiThua(int n) {
		 if (n < 0) {
			 System.out.println("Vui long nhap so nguyen duong");
	        }
	        long giaiThua = 1;
	        for (int i = 1; i <= n; i++) {
	            giaiThua *= i;
	        }
	        return giaiThua;
	}
	public static long sum(int a, int b, int c, int d) {
		long sum = giaiThua(a) + giaiThua(b) + giaiThua(c) + giaiThua(d);
		return sum;
	}
	
}
