package view;

import java.util.Scanner;

public class Ex01multiple {
    public static void main(String[] args) {
        int n;
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhập vào số nguyên n: ");
            n = sc.nextInt();
            if (n % 2 == 0) break;
            System.out.println("Nhập lại só nguyên n ");
        }
        System.out.println("n la boi cua 2--> " + n);
    }
}