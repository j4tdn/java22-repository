/*
Bài 6: Viết chương trình tìm số nguyên lớn, nhỏ nhất trong 3 chữ số a,b,c
Biết rằng a,b,c là số nguyên được nhập từ bàn phiasm và nhỏ hơn 20 [0, 20)
VD: Nhập a = 6
	Nhập b = “xyz” → báo lỗi, yêu cầu nhập lại
	Nhập b = 12
	Nhập c = 8
	Số lớn nhất là 12
	Số nhỏ nhất là 6
 */
package homework;

import java.util.Scanner;

public class BT6 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int a, b, c;
		
		System.out.print("Nhap a: ");
		a = enterPositiveInteger(ip);
		
		System.out.print("Nhap b: ");
		b = enterPositiveInteger(ip);
		
		System.out.print("Nhap c: ");
		c = enterPositiveInteger(ip);
		
		int max = Math.max(Math.max(a, b), c);
		int min = Math.min(Math.min(a, b), c);
		
		System.out.println("So lon nhat la " + max);
		System.out.println("So nho nhat la " + min);
	}
	public static int enterPositiveInteger(Scanner ip) {
		while (true){
			if(ip.hasNextInt()) {
				int num = ip.nextInt();
				if(num >= 0 && num < 20) {
					return num;
				} else {
					System.out.println("Khong hop le! Vui long nhap lai!");
				}
			} else {
				System.out.println("Khong hop le! Vui long nhap lai!");
				ip.next();
			}
		}
	}
}
