package view;

import java.util.Scanner;

public class Ex05sodoixung {
    public static void main(String[] args) {
        while (true) {
            int n;
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap vao so doi xung");
            int tem = n = sc.nextInt();
            int sum = 0;
            while (tem != 0) {
                sum = sum * 10 + tem % 10;
                tem /= 10;
            }
            if (sum == n) break;
            System.out.println("Nhap vao so doi xung");
        }
        System.out.println("Day la so doi xung");
    }
}