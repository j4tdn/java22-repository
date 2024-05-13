package view.pattern;

import java.util.Arrays;

import functional.IntCon;

public class Ex01Test01 {

	public static void main(String[] args) {
		int[] elemets = { 1, 7, 2, 8, 20, 44, 80 };
		
		/*
		 Viết chương trình thực hiện
		 + Tìm các phần tử chẵn trong mảng
		 + Tìm các phần tử lẻ trong mảng
		 + Tìm các phần là số nguyên tố trong mảng
		 + Tìm các phần là số hạnh phúc trong mảng
		 
		 Yêu cầu: Kết quả trả về là mảng
		 */	
		
		int[] evenElements = filter(elemets, nb -> nb % 2 == 0);
		int[] oddElements = filter(elemets, nb -> nb % 2 != 0);
		int[] primeElements = filter(elemets, nb -> isPrime(nb));
		int[] happyElements = filter(elemets, nb -> isHappy(nb));
		
		System.out.println("evenElements --> " + Arrays.toString(evenElements));
		System.out.println("\noddElements --> " + Arrays.toString(oddElements));
		System.out.println("\nprimeElements --> " + Arrays.toString(primeElements));
		System.out.println("\nhappyElements --> " + Arrays.toString(happyElements));
		
	}

	private static int[] filter(int[] elements, IntCon intCon) {
		int[] result = new int[elements.length];
		int count = 0;
		for(int element: elements) {
			if(intCon.test(element)) {
				result[count++] = element;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
	
	private static boolean isPrime(int number) {
		for(int i = 2; i< Math.sqrt(number); i++) {
			if(number % 2 ==0) {
				return false;
			}
		}
		return true;
	}
	
	private static boolean isHappy(int number) {
		int[] elements = new int[999]; // nên thay thế bằng CTDL khác có thể lưu số lượng phần tư dynamic
		int count = 0;
		
		while(true) {
			// b1: nếu element/next element = 1 --> dừng lại --> nó là số hạnh phúc
			if(number == 1) {
				return true;
			}
			
			// b2: phân tích number thành tổng bình phương của các ký tự số
			int sum = sumOfSquare(number);
			// b3: nếu tổng != 1 --> kiểm tra xem tổng đó đã xuất hiện trong elements hay chưa
			// --> nếu đã xuất hiện --> dừng lại --> ko phải là số hạnh phúc
			// --> nếu chưa xuất hiện --> đưa vào elements --> tiếp tục phân tích tổng(b1)
						
			if(isExists(elements, sum, count)) {
				return false;
			}
			
			elements[count++] = sum;
			number = sum;
		}
		
	}
	
	private static boolean isExists(int[] elements, int checkElement, int numberOfRealValues) {
		for(int i = 0; i < numberOfRealValues; i++) {
			if(elements[i] == checkElement) {
				return true;
			}
		}
		return false;
	}
	
	private static int sumOfSquare(int number) {
		int sum = 0;
		String numberAsText = "" + number;
		for(int i = 0; i < numberAsText.length(); i++) {
			int digit = Integer.parseInt(numberAsText.charAt(i) + "");
			sum += digit * digit;
		}
		
		return sum;
	}
	
	/*
	 --> input: là 1 số
	 --> output: là 1 boolean
	 ==> interface: boolean test(int number)
	 */
	
}
