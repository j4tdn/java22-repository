package ex1;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {

		Scanner ip = new Scanner(System.in);

		double a = 0;
		double b = 0;

		while (true) {
			try {
				System.out.println("a = ");
				a = Double.parseDouble(ip.nextLine());

				if (a == 0) {
					throw new Exception("nhap sai");
				}

				break;
			} catch (NumberFormatException e) {
				System.out.println("nhap sai");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

		while (true) {
			try {
				System.out.println("b = ");
				b = Double.parseDouble(ip.nextLine());

				if (b == 0) {
					throw new Exception("nhap sai");
				}

				break;
			} catch (NumberFormatException e) {
				System.out.println("nhap sai");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

		System.out.println(solveFirstOrderEquations(a, b));

		ip.close();
	}

	private static double solveFirstOrderEquations(double a, double b) {
		return -b / a;
	}
}
