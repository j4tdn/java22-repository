package view;

import java.util.Arrays;

public class Ex04 {

	//Em mới làm tới in ra các mảng số nguyên tố của 2 số thôi anh, đang suy nghĩ thêm cách loại bỏ các ước trùng 
	// nhau trong mỗi mảng để kết luận 2 mảng ước số nguyên tố có giống nhau hay không
	public static void main(String[] args) {

		int a = 75;
		int b = 15;

		printPrimeFactors(75);

		System.out.println("\n ====================");

		int[] listPrimeA = printPrimeFactors(a);
		printf("Các biến số nguyên tố của số a -->", listPrimeA);

		int[] listPrimeB = printPrimeFactors(b);
		printf("Các biến số nguyên tố của số b -->", listPrimeB);
	}

	public static boolean isPrime(int n) {
		int snt = 1;
		if (n <= 0) {
			snt = 0;
			return false;
		}
		if (n < 2) {
			snt = 0;
			return false;
		}

		int sq = (int) Math.sqrt(n);

		for (int i = 2; i <= sq; i++) {
			if (n % i == 0) {
				snt = 0;
			}
		}
		if (snt == 1) {
			return true;
		} else {
			return false;
		}

	}

	// Hàm tạo mảng các ước số nguyến tố của số đã cho
	public static int[] printPrimeFactors(int n) {
		int[] prime = new int[100];
		int count = 0;
		for (int i = 2; i <= n; i++) {
			if (isPrime(i)) {
				int a = n;
				while (a % i == 0) {
					prime[count++] = i;
					a /= i;
				}

			}
		}

		return Arrays.copyOfRange(prime, 0, count);
	}

	private static void printf(String prefix, int[] primeFactors) {
		System.out.println(prefix + " {");
		for (int prime : primeFactors) {
			System.out.println(" " + prime);
		}
		System.out.println("}\n");
	}
}
