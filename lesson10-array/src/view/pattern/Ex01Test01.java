package view.pattern;

import java.util.Arrays;

import functional.IntCon;

public class Ex01Test01 {
	
	public static void main(String[] args) {
		
		int[] elements = {1,7,2,8,20,44,80};
		
		/*
		 Viết CT thực hiện:
		 +Tìm các phần tử chẵn trong mảng
		 +Tìm các phần tử lẻ trong mảng
		 +Tìm các phần tử là số nguyên tố trong mảng
		 +Tìm các phần tử là số hạnh phúc trong mảng
		 
		 Yêu cầu: kết quả trả về là mảng
		 
		 */
		int[] oddements = filter(elements, nb -> nb % 2 != 0);
////		int[] primeElements = filter(elements,nb -> isHappy(nb);
		int[] isPrime = filter(elements, nb -> isPrime(nb));

		int[] evenElements = filter(elements, nb -> nb % 2 == 0);
		System.out.println(Arrays.toString(evenElements));
	}
	private static int[] filter(int[] elements, IntCon intCon) {
		int[] result = new int[elements.length];
		int count = 0;
		for(int element : elements) {
			if(intCon.test(element)) {
				result[count++] = element;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
	
	private static boolean isPrime(int number) {
		for(int i = 2; i <= Math.sqrt(number); i++) {
			if(number % 2 == 0) {
				return false;
			}
		}
		return true;
	}
	
	/*
	 isPrime(number)
	 number % 2 != 0
	 number % 2 == 0
	 isHappy(number)
	 => input: là 1 số
	 => output : là 1 boolean
	 ==> interface: boolean test(int number)
	 */

}
