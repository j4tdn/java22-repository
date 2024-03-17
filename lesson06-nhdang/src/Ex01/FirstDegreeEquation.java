package Ex01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FirstDegreeEquation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = 0;
		double b = 0;
		boolean validInput = false;
		System.out.println("Nhập a: ");
		while (!validInput) {
			try {
				a = sc.nextDouble();
				validInput=true;
			} catch (InputMismatchException e) {
				System.out.println("Sai định dạng, nhập lại: ");
				sc.nextLine(); 
			}
		}
		validInput = false; 
		System.out.println("Nhập b: ");
		while (!validInput) {
			try {
				b = sc.nextDouble();
				if (b != 0) {
                    validInput = true;
                } else {
                    System.out.println("Giá trị của b phải khác 0, nhập lại: ");
                }
			} catch (InputMismatchException e) {
				System.out.println("Sai định dạng, nhập lại: ");
				sc.nextLine(); 
			}
		}
		if (a != 0) {
            FirstDegreeEquation firstDegreeEquation = new FirstDegreeEquation();
            double equal = firstDegreeEquation.Equation(a, b);
            System.out.println("Giá trị của phương trình " + a + "x" + "+" + b + " là: " + equal);
        } else {
            if (b == 0) {
                System.out.println("Phương trình có vô số nghiệm");
            } else {
                System.out.println("Phương trình vô nghiệm");
            }
        }
	}

	public double Equation(double a, double b) {
		double x = -b / a;
		return x;
	}
}
