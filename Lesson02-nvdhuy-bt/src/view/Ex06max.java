package view;

import java.util.Scanner;

public class Ex06max {
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a");
        int a = sc.nextInt();
        System.out.println("Nhap b");
        int b = sc.nextInt();
        System.out.println("Nhap c");
        int c = sc.nextInt();
        int max = a > b ? a : b;
        if (c > max) {
            max = c;
        }
        System.out.println("Số lớn nhất trong 3 số là: " + max);
        int min = a < b ? a : b;
        if (c < min) {
            min = c;
        }
        System.out.println("Số nhỏ nhất trong 3 số là: " + min);
    }
}
