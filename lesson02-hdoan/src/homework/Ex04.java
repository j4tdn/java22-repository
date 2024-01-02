package homework;
import java.util.Random;

/*
	Bài 4: Viết chương trình tính tổng giải thừa của các số nguyên dương S = a! +b! + c! + d!
	Biết rằng a,b,c,d là các số nguyên ngẫu nhiên từ 10 đến 20 → [10, 20]
 */

public class Ex04 {
	
	public static void sumFactorialRanDomInt() {
		
		Random rd = new Random();
		int a = rd.nextInt(10, 21);
		int b = rd.nextInt(10, 21);
		int c = rd.nextInt(10, 21);
		int d = rd.nextInt(10, 21);
		
		long S1 = 1;
		for (int i = 1; i <= a; i++) {
			S1 = S1*i;
		}
		long S2 = 1;
		for (int i = 1; i <= b; i++) {
			S2 = S2*i;
		}
		long S3 = 1;
		for (int i = 1; i <= c; i++) {
			S3 = S3*i;
		}
		long S4 = 1;
		for (int i = 1; i <= d; i++) {
			S4 = S4*i;
		}
			
		System.out.println("a --> " +a);
		System.out.println("b --> " +b);
		System.out.println("c --> " +c);
		System.out.println("d --> " +d);
		System.out.println("Sum of factorial 4 Random: " + (S1 + S2 + S3 + S4));
	}
	
	public static void main(String[] args) {
		sumFactorialRanDomInt();
	}
	
}
