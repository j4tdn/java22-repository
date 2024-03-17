/*
 * Bài 1: Giải phương trình bậc nhất ax + b = 0 . Các hệ số nhập vào từ bàn phím. Sử dụng try -
catch để bẫy các lỗi khi nhập sai kiểu dữ liệu, ví dụ nhập số nhưng nhập chữ. Bẫy lỗi chia 0,
trường hợp xảy ra lỗi phải thông báo cho người dùng biết và nhập lại đến khi a b hợp lệ thì in ra
kết qua x = -b/a
 */

package ex01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	static Scanner ip = new Scanner(System.in);
    public static void main(String[] args) {
    	System.out.println("Giải hệ phương trình bậc nhất ax + b = 0");
		double a = 0, b = 0;
		boolean validInput = false;
		while (!validInput) {
			try {
				System.out.print("Nhập hệ số a: ");
				a = ip.nextDouble();
				System.out.print("Nhập hệ số b: ");
				b = ip.nextDouble();
				validInput = true;
			} catch (InputMismatchException e) {
				System.out.println("Lỗi! Hãy nhập số");
				ip.next();
			}
		}
		
		while (a == 0) {
            System.out.println("Lỗi: a phải khác 0.");
            System.out.print("Nhập lại hệ số a: ");
            try {
                a = ip.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Lỗi: Hãy nhập số.");
                ip.next(); 
            }
        }
		System.out.println("Phương trình vừa nhập vào là: " + a + "x + " + b + " = 0.");
		System.out.println("Nghiệm phương trình: x = " + (-b/a));
	}
}

