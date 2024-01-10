package bai4;

import java.util.Random;

public class TongGiaiThua {
	
	public static void main(String[] args) {
		Random rd = new Random();
		int a = rd.nextInt(10,20);
		int b = rd.nextInt(10,20);
		int c = rd.nextInt(10,20);
		int d = rd.nextInt(10,20);
		long sum = giaithua(a) + giaithua(b)+giaithua(c)+giaithua(d);
		System.out.println("a = " + a +"!");
		System.out.println("b = " + b +"!");
		System.out.println("c = " + c +"!");
		System.out.println("d = " + d +"!");
		System.out.println("sum = " + sum);
	}
	private static long giaithua (int n) {
		if(n ==0 || n == 1) {
			return 1;
		} else {
			int result = 1;
			for(int i=2; i<=n; i++) {
				result*=i;
			}
			return result;
		}
	}
}


