
public class Ex05 {

	public static void main(String[] args) {

		int n = 44;

		if (happyNumber(n)) {
			System.out.println("n = " + n + " la so hanh phuc");
		} else {
			System.out.println("n = " + n + " khong phai la so hanh phuc");

		}

	}

	public static boolean happyNumber(int number) {
		int sum = 0;
		int check = 0;
		while (sum != 1) {
			for (int i = 0; i < Integer.toString(number).length(); i++) {
				int a = (int) Math.pow(Integer.parseInt("" + Integer.toString(number).charAt(i)), 2.0);
				sum += a;
			}
			if (sum != 1) {
				number = sum;
				sum = 0;
				++check;
				if (check > 20) {
					break;
				}

			} else {
				return true;
			}
		}

		return false;

	}

}
