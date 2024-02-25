package Ex01;

import java.util.Scanner;

public class AIsPowerOfB {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhập a: ");
		int a = sc.nextInt();
		System.out.println("Nhập b: ");
		int b = sc.nextInt();
		
		if (isPowerOf(a, b)) {
            System.out.println(a + " là lũy thừa của " + b);
        } else {
            System.out.println(a + " không phải là lũy thừa của " + b);
        }
	}

	private static boolean isPowerOf(int a, int b) {
		if (a <= 1) {
            return false;
		}
		while (b > 1) {
            if (a % b == 0) {
                b /= a;
            } else {
                return false;
            }
		}
		return false;
	}

}
