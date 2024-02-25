package Ex01;

import java.util.Scanner;

public class ExponentiationTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập 2 số nguyên cần kiểm tra ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a > 0 && b > 0) { 
            if (isPowerOf(a, b) || isPowerOf(b, a)) {
                System.out.println("a,b là số lũy thừa");
            } else {
                System.out.println("a,b không phải là số lũy thừa");
            }
        } else {
            System.out.println("nhập lại a và b  cả hai số phải lớn hơn 0");
        }

        scanner.close();
    }

    
    public static boolean isPowerOf(int base, int exponent) {
        int c = 1;

        for (int i = 1; c < exponent; i++) {
            c *= base;
        }

        return c == exponent;
    }

}
