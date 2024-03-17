package homework;

import java.util.Scanner;

/*
	Bài 3: Viết chương trình tìm giai thừa của một số nguyên dương N
	Biết rằng: N có thể được nhập từ bàn phím hoặc khai báo sẵn
	Ví dụ: Nhập N = 1 → 1! = 1
	Nhập N = 5 → 5! = 5.4.3.2.1 = 120
 */


public class Ex03 {
	
	public static int calFactorial(int n) {
		int factorial = 1;
		for(int i = 2; i < n ; i++) {
			factorial *= i;
		}
		return factorial;
	}
	
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Input n: ");
		int n = ip.nextInt();
		int factorial = calFactorial(n);
		System.out.println(n + "! = " + factorial);
	}
	
}
