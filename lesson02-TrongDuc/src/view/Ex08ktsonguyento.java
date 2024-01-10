package view;

import java.util.Scanner;
public class Ex08ktsonguyento {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số nguyên N: ");
        int N = scanner.nextInt();

        boolean songuyento = kiemTraSoNguyenTo(N);

        if (songuyento) {
            System.out.println(N + " là số nguyên tố.");
        } else {
            System.out.println(N + " không là số nguyên tố.");
        }
    }

	private static boolean kiemTraSoNguyenTo(int N) {
	    if (N == 2) {
	        return true;
	    }

	    if (N <= 1) {
	        return false;
	    }

	    for (int i = 2; i < N; i++) {
	        if (N % i == 0) {
	            return false;
	        }
	    }

	    return true; 
	}
}