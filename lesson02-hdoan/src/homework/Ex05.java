package homework;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhập một số nguyên dương có tối thiểu 2 chữ số: ");
            while (!ip.hasNextInt()) {
                System.out.print("Lỗi! Nhập lại: ");
                ip.next(); // Đọc bỏ giá trị không phải số
            }
            n = ip.nextInt();
        } while (n < 10);

        boolean result = checkSymmetric(n);
        System.out.println("--> " + result);
        ip.close();
    }

    public static boolean checkSymmetric(int n) {
        int temp = n;
        int reversedNum = 0;

        while (n != 0) {
            int digit = n % 10;
            reversedNum = reversedNum * 10 + digit;
            n /= 10;
        }

        return temp == reversedNum;
    }
	
}
