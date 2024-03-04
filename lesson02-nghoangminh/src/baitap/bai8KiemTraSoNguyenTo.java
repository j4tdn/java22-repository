package baitap;

import java.util.Scanner;

public class bai8KiemTraSoNguyenTo {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
        int n = getValidInput("Nhập số nguyên dương N: ");

        if (isPrime(n)) {
            System.out.println(n + " là số nguyên tố.");
        } else {
            System.out.println(n + " không là số nguyên tố.");
        }
	}
	// tap
	private static int getValidInput(String prompt) {
        Scanner sc = new Scanner(System.in);
        int input;
        int attempts = 0;
        do {
            System.out.print(prompt);
            while (!sc.hasNextInt()) {
                System.out.println("không hợp lệ. Vui lòng nhập lại.");
                sc.next(); 
            }
            input = sc.nextInt();
            attempts++;
        } while (input <= 0 && attempts < 5);
        return input;
    }
	private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

}
