package Ex02;

import java.util.Random;

public class Ex02Test {

	public static void main(String[] args) {
		Random rd = new Random();
		int[] numbers = new int[11];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = rd.nextInt(5, 100);
			System.out.println(numbers[i]);
		}

		int[] divisible7 = Order(numbers);
		printf("Dãy số chia hết cho 7", divisible7);
	}

	public static int[] Order(int[] numbers) {
		int[] result = new int[numbers.length];

		int count = numbers.length;
		int count2 = 0;
		int count3 = 0;
		int dem = 0;
		for (int i = 0; i < numbers.length; i++) {

			if ((numbers[i] % 5 == 0) && (numbers[i] % 7 != 0)) {
				result[count - 1] = numbers[i];
				count--;
				dem++;
			}

			if ((numbers[i] % 7 == 0) && (numbers[i] % 5 != 0)) {
				result[count2] = numbers[i];
				count2++;
			}

			if (((numbers[i] % 7 == 0) && (numbers[i] % 5 == 0)) || ((numbers[i] % 7 != 0) && (numbers[i] % 5 != 0))) {
				count3++;
			}

		}

		System.out.println("số lượng các số chia hết cho 5 -->" + dem);
		System.out.println("số lượng các số chia hết cho 7 -->" + count2);
		System.out.println("số lượng các số chia hết cho 5 và 7 và các số còn lại -->" + count3);

		for (int j = 0; j < numbers.length; j++) {
			if (((numbers[j] % 7 != 0) && (numbers[j] % 5 != 0)) || ((numbers[j] % 7 == 0) && (numbers[j] % 5 == 0))) {
				result[count2] = numbers[j];
				count2++;
			}
		}

		return result;
	}

	public static void printf(String prefix, int[] numbers) {
		System.out.println(prefix + " {");
		for (int number : numbers) {
			System.out.println("  + " + number);
		}
		System.out.println("}\n");
	}
}
