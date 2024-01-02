package baitap;

import java.util.Scanner;

public class bai6MinMax {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		int a;
        do {
            System.out.print("Nhập số nguyên a: ");
            while (!ip.hasNextInt()) {
                System.out.println("Định dạng không hợp lệ. Vui lòng nhập lại.");
                ip.next(); // Đọc và bỏ qua giá trị không phải số nguyên
            }
            a = ip.nextInt();
        } while (a < 0 || a >= 20);

        // Nhập giá trị b từ bàn phím và kiểm tra
        int b;
        do {
            System.out.print("Nhập số nguyên b: ");
            while (!ip.hasNextInt()) {
                System.out.println("Định dạng không hợp lệ. Vui lòng nhập lại.");
                ip.next();
            }
            b = ip.nextInt();
        } while (b < 0 || b >= 20);

        // Nhập giá trị c từ bàn phím và kiểm tra
        int c;
        do {
            System.out.print("Nhập số nguyên c: ");
            while (!ip.hasNextInt()) {
                System.out.println("Định dạng không hợp lệ. Vui lòng nhập lại.");
                ip.next(); // Đọc và bỏ qua giá trị không phải số nguyên
            }
            c = ip.nextInt();
        } while (c < 0 || c >= 20);
		
		int max = findMax(a, b, c);
		int min = findMin(a, b, c);
		
		System.out.println("Số lớn nhất là " + max);
		System.out.println("Số nhỏ nhất là " + min);
	}
	private static int findMax(int a, int b, int c) {
		return Math.max(Math.max(a, b), c);
	}
	private static int findMin(int a, int b, int c) {
		return Math.min(Math.min(a, b), c);
	}
}
