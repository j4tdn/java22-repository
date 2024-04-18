package p1_strategy;

import java.util.Arrays;

import p1_strategy_bean.Book;

public class Ex06NumberTest {
	/*
	 Cho 1 mảng chứa tập hợp các số nguyên dương
	 Viết chương trình thực hiện các chức năng sau
	 1. Tìm các phần tử lẻ
	 2. Tìm các phần tử chẵn
	 3. Tìm các phần tử là số nguyên tố
	 4. Tìm các phần tử là bội của 5
	 Yêu cầu: Chỉ viêt 1 hàm duy nhất cho 4 chức năng trên
	 Vì nếu mỗi chức năng viết 1 hàm, sau này khách hàng yêu cầu thêm
	   lại phải tạo hàm mới trùng lập code
	 */
	public static void main(String[] args) {
		int[] numbers = {1, 5, 7, 9, 2, 33, 20, 17};
		
	}
	/*
	 isPrime(number)
	 number % 2 == 0
	 number % 2 != 0
	 
	 --> IntCheck boolean test(int number)
	 */
	public static int[] findElements(int[] numbers, IntCheck intCheck) {
		int[] result = new int[numbers.length];
		int count = 0;
		for (int number : numbers) {
			if (intCheck.test(number)) {
				result[count++] = number;
			}
		}
		return Arrays.copyOfRange(result, 0, count);	
	}
	private static void generate(String prefix, Book[] books) {
		System.out.println(prefix + " ---> {");
		for (Book book: books) {
			System.out.println("    " + book);
		}
		System.out.println("}\n");
	}
	
	/*public static int[] findEvenElements(int[] numbers) {
		int[] result = new int[numbers.length];
		int count = 0;
		for (int number : numbers) {
			if (number % 2 == 0) {
				result[count++] = number;
			}
		}
		return Arrays.copyOfRange(result, 0, count);	
	}
	public static int[] findOddElements(int[] numbers) {
		int[] result = new int[numbers.length];
		int count = 0;
		for (int number : numbers) {
			if (number % 2 != 0) {
				result[count++] = number;
			}
		}
		return Arrays.copyOfRange(result, 0, count);	
	}
	public static int[] findPrimeElements(int[] numbers) {
		int[] result = new int[numbers.length];
		int count = 0;
		for (int number : numbers) {
			if (isPrime(number)) {
				result[count++] = number;
			}
		}
		return Arrays.copyOfRange(result, 0, count);	
	}
	public static boolean isPrime(int number) {
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
	public static int[] findMultiOfFiveElements(int[] numbers) {
		int[] result = new int[numbers.length];
		int count = 0;
		for (int number : numbers) {
			if (number % 5 == 0) {
				result[count++] = number;
			}
		}
		return Arrays.copyOfRange(result, 0, count);	
	}*/

}
