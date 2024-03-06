package view;

import java.util.Arrays;

public class Ex06NumberTest {
	
	/*
	 * Cho 1 mảng chứa tập hợp các số nguyên dương
	 * Viết chương trình thực hiện các chức năng sau
	 * 
	 * 1/ Tìm các phần tử lẻ
	 * 2/ Tìm các phần tử chẵn
	 * 3/ Tìm các phần tử là số nguyên tố
	 * 4/ Tìm các phần tử là bội của 5
	 * 
	 * Yêu cầu: chi viết 1 hàm duy nhất cho 4 chức năng trên
	 * 
	 * Vì nếu mỗi chức năng viết 1 hàm, sau này khách hàng yêu cầu
	 * thêm lại phải tạo hàm mới trùng lặp code....
	 * 
	 */
	
	// --> IntCheck boolean test(int Number)
	
	public static void main(String[] args) {
		
		int[] numbers = {1, 5, 7, 9, 2, 33, 20, 17};
		
		generate("1. Số lẻ là ", findEvenElements(numbers));
		generate("1. Số lẻ là ", findElements(numbers, nb -> nb % 2 != 0 ));
		System.out.println("");
		
		generate("2. Số chắn là ", findOddElements(numbers));
		generate("2. Số chắn là ", findElements(numbers, nb -> nb % 2 == 0));
		System.out.println("");
		
		generate("3. Số nguyên tố là ", findPrimeElements(numbers));
		generate("3. Số nguyên tố là ", findElements(numbers, nb -> isPrime(nb)));
		System.out.println("");
		
		generate("4. Số bội của 5 là là ", findElements(numbers, nb -> nb % 5 == 0));
		
	}
	
	
	public static int[] findElements(int[] numbers, IntCheck intcheck) {
		int[] result = new int[numbers.length];
		int count = 0; 
		for(int number : numbers) {
			if(intcheck.test(number)) {
				result[count++] = number;
			}
		}
		
		return Arrays.copyOfRange(result, 0, count);
	}
	public static int[] findEvenElements(int[] numbers) {
		int[] result = new int[numbers.length];
		int count = 0; 
		for(int number : numbers) {
			if(number % 2 != 0) {
				result[count++] = number;
			}
		}
		
		return Arrays.copyOfRange(result, 0, count);
	}
	public static int[] findOddElements(int[] numbers) {
		int[] result = new int[numbers.length];
		int count = 0; 
		for(int number : numbers) {
			if(number % 2 == 0) {
				result[count++] = number;
			}
		}
		
		return Arrays.copyOfRange(result, 0, count);
	}
	
	public static int[] findPrimeElements(int[] numbers) {
		int[] result = new int[numbers.length];
		int count = 0; 
		for(int number : numbers) {
			if(isPrime(number)) {
				result[count++] = number;
			}
		}
		
		return Arrays.copyOfRange(result, 0, count);
	}
	
	public static boolean isPrime(int number) {
		for(int i = 2; i<= Math.sqrt(number); i++) {
			if(number % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void generate(String prefix, int[] numbers) {
		System.out.println(prefix + " --> "+ Arrays.toString(numbers));
	}
}
