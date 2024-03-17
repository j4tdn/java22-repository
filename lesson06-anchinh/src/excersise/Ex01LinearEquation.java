package excersise;

import java.util.Scanner;

public class Ex01LinearEquation {

	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Nhập số a: ");
		float a = inputNum();
		System.out.print("Nhập số b: ");
		float b = inputNum();
		ip.close();

		float x = -b / a;
		System.out.println("Nghiệm của phương trình là: " + x);
	}

	private static float inputNum() {
		String text = null;
		while (true) {
			try {
				text = ip.nextLine();
				float num = Float.parseFloat(text);
				if (num == 0) {
					throw new ArithmeticException(">> Số nhập phải khác 0, hãy nhập lại");
				}
				break;
			} catch (NumberFormatException | ArithmeticException e) {
				System.out.println("Hãy nhập số hợp lệ " + e.getMessage());
			}
		}
		return Float.parseFloat(text);
	}
}
