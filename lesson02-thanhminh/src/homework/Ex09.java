package homework;

public class Ex09 {
	public static void main(String[] args) {
		int a = 0;
		int n = 2;
		while (a < 200) {
			if (snt(n)) {
				a++;
				if (a == 200) {
					System.out.println("Số nguyên tố thứ 200 --> " + n);
					break;
				}
			} n++;
		}
	}
	public static boolean snt(int n) {
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(n); i++ ) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
