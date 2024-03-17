/*
Bài 1: Viết chương trình(hàm) kiểm tra số nguyên N có phải là bội của 2 hay không
Yêu cầu: N là số nguyên dương được nhập từ bàn phím, bắt buộc nhập lại nếu N không hợp lệ (tối
đa 5 lần)
VD: Nhập N  = abc → báo lỗi, yêu cầu nhập lại
			= 4 → true
			= 6 → true
			= 7 → false
*/
package homework;

import java.util.Scanner;

public class BT1 {
	public static void main(String[] args) {
		int N = enterPositiveInteger();
		
		if(N % 2 == 0) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
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
