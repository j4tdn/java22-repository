package bai8;

import java.util.Scanner;

public class KiemTraStn {
	public static void main(String[] args) {
		int lanNhap = 0;
		int number = 0;
		while (lanNhap < 5) {
			number = getValidInput();
			if(isPrime(number)) {
				System.out.println(number + "la so nguyen to");
				break;
			}else {
				System.out.println(number + "khong phai la so nguyen to.vui long nhap lai");
				lanNhap++;
			}
			if(lanNhap == 5) {
				System.out.println("ket thuc chuong trinh");
			}
		}
		private static int getValidInput() {
			Scanner ip = new Scanner(System.in);
			int number = 0;
			boolean isValid = false;
			while (!isValid) {
				System.out.println("Nhap mot so nguyen duong:");
				Sring input=ip.nextLine();
				
				}
		}
	}

}
