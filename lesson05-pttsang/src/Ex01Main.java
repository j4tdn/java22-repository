import java.util.Scanner;

public class Ex01Main {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			double inputNumber;
			int attemptCount = 0;

			do {
				System.out.print("Nhập vào một số thực có phần thập phân khác 0: ");
				inputNumber = scanner.nextDouble();
				attemptCount++;

				
				if (isValidDecimal(inputNumber)) {
					break; 
				} else {
					if (attemptCount >= 3) {
						System.out.println("Bạn đã nhập sai quá 3 lần. Kết thúc chương trình.");
						return;
					}
					System.out.println("Số nhập vào không hợp lệ. Số phải có phần thập phân khác 0.");
				}
			} while (attemptCount < 3);

			
			Fraction simplifiedFraction = findSimplifiedFraction(inputNumber);
			System.out.println("Phân số tối giản của số thập phân " + inputNumber + " là: "
					+ simplifiedFraction.getNumerator() + "/" + simplifiedFraction.getDenominator());
		}
	}

	
	public static boolean isValidDecimal(double number) {
		return number % 1 != 0;
	}

	
	public static Fraction findSimplifiedFraction(double decimal) {
		int numerator = (int) (decimal * 1000000); 
		int denominator = 1000000;
		int gcd = findGCD(numerator, denominator);
		numerator /= gcd;
		denominator /= gcd;
		return new Fraction(numerator, denominator);
	}

	
	public static int findGCD(int a, int b) {
		if (b == 0) {
			return a;
		}
		return findGCD(b, a % b);
	}
}


class Fraction {
	private int numerator;
	private int denominator;

	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}

	public int getNumerator() {
		return numerator;
	}

	public int getDenominator() {
		return denominator;
	}
}
