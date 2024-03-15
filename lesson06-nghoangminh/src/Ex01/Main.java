package Ex01;

import java.math.BigDecimal;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = 0;
		double b = 0;
		
		boolean validInput = false;
		while (!validInput) {
			try {
			System.out.println("Nhập hệ số a: ");
			a = sc.nextDouble();
			System.out.println("Nhập hệ số b");
			b = sc.nextDouble();
			validInput = true;
			} catch (InputMismatchException e) {
				System.out.println("Nhập sai dữ liệu, vui lòng nhập lại");
				sc.next();
			}
		}
		
		if(a == 0) {
			if(b == 0) {
				System.out.println("phương trình có vô số nghiệm");
			} else {
				System.out.println("phương trình vô nghiệm");
			}
		} else {
			double x = -b/a;
			BigDecimal result = new BigDecimal(x).setScale(2, BigDecimal.ROUND_HALF_UP);
			System.out.println("nghiệm của phương trình là: x = " + result);
		}
		sc.close();
	}

}
