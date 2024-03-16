package ex01;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = 0;
		double b = 0;
		boolean result = true;
		
		do {
            try {
                System.out.print("Nhập hệ số a khác 0: ");
                a = Double.parseDouble(sc.nextLine());
                if (a == 0) {
                    throw new ArithmeticException("Hệ số a phải khác 0");
                }
                result = false; 
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập lại.");
            } catch (ArithmeticException e) {
                System.out.println("Lỗi: " + e.getMessage() + " Vui lòng nhập lại.");
            }
        } while (result);

	 result = true; 

        do {
            try {
                System.out.print("Nhập hệ số b: ");
                b = Double.parseDouble(sc.nextLine()); 
                result = false; 
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập lại.");
            }
        } while (result);

        double x = -b / a;
        System.out.println("Phương trình " + a + "x + " + b + " = 0 có nghiệm x = " + x);

	}
}
