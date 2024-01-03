package homework;

import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int a = 0;
		
		while (a < 5) {
			System.out.println("Nhap so nguyen duong N: ");
			int n = Integer.parseInt(ip.nextLine());
			if (n > 1) {
				if (snt(n)) {
				System.out.println(n + " la so nguyen to");
			    } else {
				System.out.println(n + " khong phai so nguyen to");
			    }
				break;
			} else {
				System.out.println("Vui long nhap so nguyen lon hon 1 ");
			}
			a++;
			if (a == 5) {
				System.out.println("Qua so lan cho phep. Ket thuc chuong trinh");
				return;
			}
		}
		
	}
	public static boolean snt(int n) {
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(n); i++ ) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

}
