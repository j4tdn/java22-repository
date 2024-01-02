package homework;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int i = 0;
		
		while(i < 5) {
			System.out.println("Nhap so nguyen duong N: ");
			int number = Integer.parseInt(ip.nextLine());
			if (number > 0 && number % 2 == 0) {
				System.out.println("So N la boi so cua 2 --> " + number);
				break;
			} else {
				System.out.println("N khong hop le. Yeu cau nhap lai");
			}
			i++;
			if (i == 5) {
				System.out.println("Qua so lan cho phep. Ket thuc chuong trinh");
				return;
			}
		}
			
	}

}
