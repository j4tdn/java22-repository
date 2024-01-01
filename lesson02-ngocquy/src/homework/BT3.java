/*
Bài 3: Viết chương trình tìm giai thừa của một số nguyên dương N
Biết rằng: N có thể được nhập từ bàn phím hoặc khai báo sẵn
Ví dụ: Nhập N = 1 → 1! = 1
Nhập N = 5 → 5! = 5.4.3.2.1 = 120
 */
package homework;

import java.util.Scanner;

public class BT3 {
	public static void main(String[] args) {
		int N = enterPositiveInteger();
		long f = calculateFactoeial(N);
		System.out.println(N+"! = "+f);
	}
	
	public static long calculateFactoeial(int N) {
		if(N == 0 || N == 1) {
			return 1;
		}
		
		long rs = 1;
		for (int i = 1; i<=N;i++) {
			rs *=i;
		}
		return rs;
	}
	
	public static int enterPositiveInteger() {
		Scanner ip = new Scanner(System.in);
		int n = 0;
		while (true){
			System.out.print("Nhap so nguyen duong N: ");
			String input = ip.nextLine();
			if(input.matches("\\d+")) {
				n = Integer.parseInt(input);
				if(n>=0) {
					return n;
				} else {
					System.out.println("Khong hop le! Vui long nhap lai!");
				}
			} else {
				System.out.println("Khong hop le! Vui long nhap lai!");
			}
		}
	}
}
