package bai5;

import java.util.Scanner;

public class SoDoiXung {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in); 
		int n;
		while(true) {
			System.out.println("Nhập n: ");
			n = ip.nextInt();
			if( n>=10 ) {
				break;
			} else {
				System.out.println("Nhap sai. Vui long nhap lai");
			}
		}
		boolean laSoDoiXung = laSoDoiXung(n);
		if(laSoDoiXung) {
			System.out.println(n + "là số đối xứng");
		} else {
			System.out.println(n + " không phải là sô đối xứng");
		}
	}
	
	// Hàm ktra xem một sôs nguyên có phải là số đối xứng hay không
	public static boolean laSoDoiXung(int number) {
		int soBanDau = number;
		int soDaoNguoc = 0;
		while(number!=0) {
			int chuSo = number % 10;
			soDaoNguoc = soDaoNguoc * 10 + chuSo;
			number/=10;
		}
		return soBanDau == soDaoNguoc;
	}
}
