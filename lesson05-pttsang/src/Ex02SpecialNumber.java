
import java.util.Scanner;

public class Ex02SpecialNumber {

	public static boolean isSpecialNumber(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
			if (sum == n)
				return true;
		}
		return false;
	}

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Nhap so nguyen n:");
			int a = scanner.nextInt();
			if (isSpecialNumber(a))
				System.out.println("TRUE");
			else
				System.out.println("FALSE");
		}
	}

}