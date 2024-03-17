package homework;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        System.out.print("Nhập số nguyên a: ");
        int a = ip.nextInt();

        System.out.print("Nhập số nguyên b: ");
        int b = ip.nextInt();

        System.out.print("Nhập số nguyên c: ");
        int c = ip.nextInt();

        int min = Min(a, b, c);
        int max = Max(a, b, c);

        System.out.println("Số nhỏ nhất là " + min);
        System.out.println("Số lớn nhất là " + max);
    }

    public static int Min(int a, int b, int c) {
        return Math.min(Math.min(a, b), c);
    }

    public static int Max(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }

}
