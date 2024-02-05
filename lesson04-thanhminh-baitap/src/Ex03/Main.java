package Ex03;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số hàng của tam giác Pascal: ");
		int n = sc.nextInt();
		
		printPascal(n);
		
	}
	private static void printPascal(int n) {
		for (int i = 1; i < n; i++) {
			for (int j = 1; j < n - i - 2; j++) {
                System.out.print("  ");
            }
			 for (int k = 0; k <= i; k++) {
	                System.out.print(getPascalValue(i, k) + "  ");
	            }
			 System.out.println();
		}
	}
	private static int getPascalValue(int i, int k) {
        if (k == 0 || k == i) {
            return 1;
        } else {
            return getPascalValue(i - 1, k - 1) + getPascalValue(i - 1, k);
        }
    }

}
