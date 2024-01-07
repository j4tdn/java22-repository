package view.io;

import java.util.Scanner;

public class Ex02_Kiemtraluythua2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Nhập N: ");
            int N = scanner.nextInt();

            boolean laLuyThuaCuaHai = ktlt2(N);

            if (laLuyThuaCuaHai) {
                System.out.println(N + " là lũy thừa của 2.");
            } else {
                System.out.println(N + " không là lũy thừa của 2.");
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Lỗi! Vui lòng nhập một số nguyên.");
        }
    }

    private static boolean ktlt2(int N) {
        if (N <= 0) {
            return false;
        }

        return (N & (N - 1)) == 0;
    }
}
