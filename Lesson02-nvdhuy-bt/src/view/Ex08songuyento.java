package view;

import java.util.Scanner;

public class Ex08songuyento {
    public static void main(String[] args) {
        block0: while (true) {
            Scanner sc = new Scanner(System.in);
            int dem = 0;
            System.out.println("Nhập vào số nguyên to n: ");
            int n = sc.nextInt();
            int i = 1;
            while (true) {
                if (i > n) continue block0;
                if (n % i == 0) {
                    ++dem;
                }
                if (dem == 2) {
                    System.out.println("n la so nguyen to --> " + n);
                    continue block0;
                }
                System.out.println("Nhập lại só nguyên to n ");
                ++i;
            }
            break;
        }
    }
}