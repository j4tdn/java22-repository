package baitap;

public class Ex09 {
	public static void main(String[] args) {
		int a = 2000;
		int count = 0;
		int number = 1;
		while (count < a) {
			if (checksonguyento(number)) {
				count++;
			}
			if (count == a) {
				System.out.println("số nguyên tố thứ 2000 là : " + number);
				break;
			}
		}
		number++;

	}

	public static boolean checksonguyento(int number) {
		if (number <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
}
