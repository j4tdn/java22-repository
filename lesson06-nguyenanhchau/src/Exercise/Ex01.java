package Exercise;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double a = 0, b = 0;

        while (true) {
            try {
                System.out.print("Nhập a: ");
                a = Double.parseDouble(scanner.nextLine());
                System.out.print("Nhập b: ");
                b = Double.parseDouble(scanner.nextLine());

                if (a == 0) {
                    System.out.println(" a phải khác 0,nhập lại.");
                } else {
                    double x = -b / a;
                    System.out.println(" x = " + x);
                }
            } catch (ArithmeticException e) {
                System.out.println("Lỗi Chia cho 0,nhập lại.");
            } catch (NumberFormatException e) {
                System.out.println("Sai kiểu dữ liệu,nhập lại.");
            }
        }

    }
}
