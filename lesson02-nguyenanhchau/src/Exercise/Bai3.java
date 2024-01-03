package Exercise;

import java.util.Scanner;

public class Bai3 {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Nhap so nguyen = ");
		if (ip.hasNextInt()) {
			int a = ip.nextInt();
			System.out.println("Giai thua cua so nguyen N = " + a + " la : " + tinhGiaithua(a));

		} else {
			System.out.println("Loi, nhap vao so nguyen.");
		}
	}

	private static int tinhGiaithua(int a) {
		int ketqua = 1;
		for (int i = 1; i <= a; i++) {
			ketqua *= i;
		}
		return ketqua;
	}
}
