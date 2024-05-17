package view.pattern;

import java.util.Arrays;

import functional.IntCon;

public class Ex01Test01 {

	public static void main(String[] args) {

		int[] elements = { 1, 7, 2, 8, 20, 44, 80 };
		
		/*
		 Viết chương trình thực hiện
		 + Tìm các phần tử chẵn trong mảng
		 + Tìm các phần tử lẻ trong mảng
		 + Tìm các phần tử là số nguyên tố trong mảng
		 + Tìm các phần tử là số hạnh phúc trong mảng
		 
		 Yêu cầu: Kết quả trả về là mảng
		 */
		
		int[] evenElements = filter(elements, nb -> nb % 2 == 0);
		int[] oddElements = filter(elements, nb -> nb % 2 != 0);
		int[] primeElements = filter(elements, nb -> isPrime(nb));
		int[] happyElements = filter(elements, nb -> isHappy(nb));
		
		System.out.println("evenElements --> " + Arrays.toString(evenElements));
		
		System.out.println("\noddElements --> " + Arrays.toString(oddElements));
		
		System.out.println("\nprimeElements --> " + Arrays.toString(primeElements));
		
		System.out.println("\nhappyElements --> " + Arrays.toString(happyElements));
	}
	
	private static int[] filter(int[] elements, IntCon intCon) {
		int[] result = new int[elements.length];
		int count = 0;
		for (int element: elements) {
			if (intCon.test(element)) {
				result[count++] = element;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
	
	/*
	 + isPrime(number)
	 + number % 2 != 0
	 + number % 2 == 0
	 + isHappy(number)
	 --> input: là 1 số
	 --> output: là 1 boolean
	 ==> interface: boolean test(int number) 
	 
	 */
	
	private static boolean isPrime(int number) {
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % 2 == 0) {
				return false;
			}
		}
		return true;
	}
	
	private static boolean isHappy(int number) {
		int[] elements = new int[9999]; // nên thay thế bằng CTDL khác có thể lưu số lượng phần tử dynamic
		int count = 0;
		while(true) {
			if (number == 1) {
				return true;
			}
			int sum = sumOfSquare(number);
			if (isExists(elements, sum, count)) {
				return false;
			}
			elements[count++] = sum;
			number = sum;
		}
	}
	
	private static boolean isExists(int[] elements, int checkElement, int numberOfRealValues) {
		for (int i = 0; i < numberOfRealValues; i++) {
			if (elements[i] == checkElement) {
				return true;
			}
		}
		return false;
	}
	
	private static int sumOfSquare(int number) {
		int sum = 0;
		String numberAsText = "" + number;
 		for (int i = 0; i < numberAsText.length(); i++) {
 			int digit = Integer.parseInt(numberAsText.charAt(i) + "");
 			sum += digit * digit;
 		}
		return sum;
	}
}
