package lesson02_minhtai;

import java.util.Random;
/*
 * Viết chương trình tính tổng giải thừa của các số nguyên dương S = a! +b! + c! + d!
Biết rằng a,b,c,d là các số nguyên ngẫu nhiên từ 10 đến 20 → [10, 20]
 */

public class bai4 {
	public static void main(String[] args) {
		Random rd = new Random();
		int a = rd.nextInt(10,20);
		int b = rd.nextInt(10,20);
		int c = rd.nextInt(10,20);
		int d = rd.nextInt(10,20);
		
		System.out.println("Giai thừa của " + a + " là :" + giaiThua(a) );
		System.out.println("Giai thừa của " + b + " là :" + giaiThua(b) );
		System.out.println("Giai thừa của " + c + " là :" + giaiThua(c) );
		System.out.println("Giai thừa của " + d + " là :" + giaiThua(d) );
		System.out.println(" Tổng của các giai thừa là : " + (giaiThua(a)+giaiThua(b)+giaiThua(c)+giaiThua(d)));
	}
	private static long giaiThua(int n) {
		  // dung de quy
	        if (n > 0) {
	            return n * giaiThua(n - 1);
	        } else {
	            return 1;
	        }
	    }
}
