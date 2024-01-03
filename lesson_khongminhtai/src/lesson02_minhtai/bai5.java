package lesson02_minhtai;

import java.util.Scanner;

public class bai5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("Moi ban nhap : ");
//		int  n = sc.nextInt();
//		int tem = n ; // tem la số ban đầu nhập từ bàn phím 
//		int sum = 0 ;// Chứa số đảo ngược
//		if (n<10) {
//			System.out.println("Bạn đã nhập sai , mời nhập lại : s");
//		}
//		while (tem != 0) {
//			//121 % 10 = 1 --> sum = 0 + 1 = 1 tem =121/10 = 12 ...--> sum = 121
//			sum = sum*10 + tem%10 ; 
//			tem = tem/10;
//		}
//		if (sum == n) {
//			System.out.println(n + " Là số đối xứng ");
//		}else {
//			System.out.println(n + " Không là số đối xứng ");
//		}
		
		int N;
		do {
			System.out.print("Nhập một số nguyên dương : ");
			while (!sc.hasNextInt()) {
				System.out.println("Lỗi! Hãy nhập một số nguyên.");
				sc.next();
			}
			N = sc.nextInt();
		} while (N < 10); // Số > 2 chữ số là số > 10

		// Tìm số đảo ngược và kiểm tra số đối xứng
		int sdn = soDaoNguoc(N);
		if (sdn == N) {
			System.out.println(N + " là số đối xứng.");
		} else {
			System.out.println(N + " không là số đối xứng.");
		}

		System.out.println("Số đảo ngược của " + N + " là " + sdn);

		sc.close();
	}

	// Hàm tìm số đảo ngược
	private static int soDaoNguoc(int number) {
		int SDN = 0;
		while (number > 0) {
			int digit = number % 10;
			SDN = SDN * 10 + digit;
			number /= 10;
		}
		return SDN;
	}
}
