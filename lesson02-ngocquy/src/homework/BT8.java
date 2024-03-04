/*
Bài 8: Viết chương trình(hàm) kiểm tra số nguyên N có phải là số nguyên tố hay không
Biết rằng N là số nguyên dương được nhập từ bàn phím, bắt buộc nhập lại nếu N không hợp lệ
tối đa 5 lần) hoặc khai báo biến có sẵn giá trị hợp lệ
VD: Nhập N = abc → báo lỗi, yêu cầu nhập lại
		   = 4 → false
		   = 7 → true
 */
package homework;

import java.util.Scanner;

public class BT8 {
	public static void main(String[] args) {
		int N = enterPositiveInteger();
		if(isPrime(N)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
	public static boolean isPrime(int N) {
		if (N <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(N); i++) {
			if (N % i == 0) {
				return false;
			}
		}
		return true;
	}
	public static int enterPositiveInteger() {
		Scanner ip = new Scanner(System.in);
		int n = 0;
		int count = 0;
		while (count < 5){
			System.out.print("Nhap so nguyen duong N: ");
			String input = ip.nextLine();
			if(input.matches("\\d+")) {
				n = Integer.parseInt(input);
				if(n>0) {
					return n;
				} else {
					System.out.println("Khong hop le! Vui long nhap lai!");
				}
			} else {
				System.out.println("Khong hop le! Vui long nhap lai!");
			}
			count++;
		}
		System.out.println("Da nhap sai qua 5 lan. Ket thuc chuong trinh.");
		System.exit(0);
		return 0;
	}
}
