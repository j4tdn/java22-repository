package homework;

import java.util.Scanner;

public class Ex03 {
	/*
	 Bài 3: Viết chương trình tìm giai thừa của một số nguyên dương N
	Biết rằng: N có thể được nhập từ bàn phím hoặc khai báo sẵn
	Ví dụ: Nhập N = 1 → 1! = 1
	Nhập N = 5 → 5! = 5.4.3.2.1 = 120
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		long factorial = calculateFactorial(n);
		System.out.println("Giai thừa của " + n + " là " + factorial);
	}
	public static long calculateFactorial(int n) {
		if(n < 0) {
			return -1;
		}else if(n == 0 || n ==1) {
			return 1;
		}else {
			long kq = 1;
			for(int i = 2; i <= n; i++) {
				kq *= i;
			}
			return kq;
		}
	}
}