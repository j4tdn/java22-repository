/*
Bài 4: Viết chương trình tính tổng giải thừa của các số nguyên dương S = a! +b! + c! + d!
Biết rằng a,b,c,d là các số nguyên ngẫu nhiên từ 10 đến 20 → [10, 20]
 */
package homework;

import java.util.Random;
public class BT4 {
	public static void main(String[] args) {
		sumFactorial();
	}
	public static void sumFactorial() {
		Random r = new Random();
		int a = r.nextInt(9, 21);
		int b = r.nextInt(9, 21);
		int c = r.nextInt(9, 21);
		int d = r.nextInt(9, 21);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		long s1 = 1;
		for(int i=1; i<=a; i++) {
			s1 *=i;
		}
		
		long s2 = 1;
		for(int i=1; i<=b; i++) {
			s2 *=i;
		}
		
		long s3 = 1;
		for(int i=1; i<=c; i++) {
			s3 *=i;
		}
		
		long s4 = 1;
		for(int i=1; i<=d; i++) {
			s4 *=i;
		}
		
		System.out.println("S = " + (s1+s2+s3+s4));
	}
}
