package view;

import java.util.Scanner;

public class Ex01BoiCuaHai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int soLanNhapSai = 0;
        int N = 0;

     

        while (soLanNhapSai < 5) {
            System.out.print("Nhập N: ");
            String nhap = scanner.next();

            try {
                N = Integer.parseInt(nhap);

                if (N <= 0) {
                    System.out.println("N phải là số nguyên dương.");
                    soLanNhapSai++;
                } else if (N > 0) {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Lỗi! Vui lòng nhập lại số nguyên.");
                soLanNhapSai++;
            }
        }


        if (soLanNhapSai < 5) {
            boolean Boicua2 = kiemTraBoiCuaHai(N);
            System.out.println("N là bội của 2: " + Boicua2);
        } else {
            System.out.println("Đã nhập sai quá số lần quy định.");
        }
    }

    private static boolean kiemTraBoiCuaHai(int N) {
        return N % 2 == 0;
    }
}