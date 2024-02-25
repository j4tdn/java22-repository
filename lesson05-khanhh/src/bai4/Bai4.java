package bai4;

import java.util.Scanner;

public class Bai4 {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);

		System.out.println("n= ");
		int n = ip.nextInt();

		if (n < 2 || n > 20) {
			System.out.println("không thể thực hiện");
		} else {
			int[] A = new int[n];
			for (int i = 0; i < n; i++) {
				System.out.print("Ak = ");
				A[i] = ip.nextInt();
			}
			
			for (int i = 0; i < n; i++) {
				if (A[1] < 0 || A[i] > 100) {
					System.err.println("không thể thực hiện");
					return;
				}
			}

			System.out.println("BCNN: " );
		}
	}
}
