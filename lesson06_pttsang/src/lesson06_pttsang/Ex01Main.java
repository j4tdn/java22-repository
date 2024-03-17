package lesson06_pttsang;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex01Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = 0, b = 0;

        
        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.print("Nhập hệ số a: ");
                a = scanner.nextDouble();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Lỗi: Bạn đã nhập sai kiểu dữ liệu. Vui lòng nhập lại.");
                scanner.next();
            }
        }

        validInput = false;
        while (!validInput) {
            try {
                System.out.print("Nhập hệ số b: ");
                b = scanner.nextDouble();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Lỗi: Bạn đã nhập sai kiểu dữ liệu. Vui lòng nhập lại.");
                scanner.next();
            }
        }

        
        try {
            double result = solveLinearEquation(a, b);
            System.out.println("Nghiệm của phương trình " + a + "x + " + b + " = 0 là: x = " + result);
        } catch (ArithmeticException e) {
            System.out.println("Lỗi: Phép chia cho 0. Vui lòng nhập lại hệ số a và b.");
        }
    }

   
    public static double solveLinearEquation(double a, double b) throws ArithmeticException {
        if (a == 0) {
            throw new ArithmeticException("Không thể chia cho 0.");
        }
        return -b / a;
    }
}