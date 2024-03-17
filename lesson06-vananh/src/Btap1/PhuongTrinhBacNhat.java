package Btap1;

import java.util.Scanner;

public class PhuongTrinhBacNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = 0, b = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print("Nhập hệ số a (a != 0): ");
                a = Double.parseDouble(scanner.nextLine());
                
                if (a == 0) {
                    throw new ArithmeticException("Hệ số a phải khác 0.");
                }

                System.out.print("Nhập hệ số b: ");
                b = Double.parseDouble(scanner.nextLine());
                
                validInput = true; 
            } catch (NumberFormatException e) {
                System.out.println("Lỗi nhập liệu. Vui lòng nhập số.");
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        }
        double x = -b / a;
        System.out.println("Phương trình " + a + "x + " + b + " = 0 có nghiệm x = " + x);
        scanner.close();
    }
}
