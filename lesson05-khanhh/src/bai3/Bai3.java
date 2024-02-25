package bai3;

import java.util.Scanner;

public class Bai3 {

	public static int greatestCommonDivisorint(int a, int b) {
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}

	public static int leastCommonMultiple(int a, int b) {
		int c = (a * b) / greatestCommonDivisorint(a, b);
		return c;
	}

	public static int getLeastCommonMultiple(int[] A, int n) {
		int a = A[0];

		for (int i = 1; i < n; i++) {
			a = leastCommonMultiple(a, A[i]);
		}
		return a;
	}

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
				if (A[1] < 1 || A[i] > 10) {
					System.err.println("không thể thực hiện");
					return;
				}
			}

			System.out.println("BCNN: " + getLeastCommonMultiple(A, n));
		}
	}
}
