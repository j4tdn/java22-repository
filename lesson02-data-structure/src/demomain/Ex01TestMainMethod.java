package demomain;

import java.util.Iterator;

public class Ex01TestMainMethod {
	public static void main(String[] args) {
		printStarTrianle(2);
		printNumberTriangle();
		
	}

	public static void printStarTrianle(int n) {
		for (int k = 1; k <= n; k++) {
			for (int i = 0; i <= 5; i++) {

				for (int j = 0; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}

	}

	public static void printNumberTriangle() {
		System.out.println("printl Number");
		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print((j + 1));
			}
			System.out.println();
		}
	}

}
