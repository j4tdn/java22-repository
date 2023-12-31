package datastructure.array;

import java.util.Arrays;
import java.util.Random;

public class Ex01BasicDemoPrimitive {
	
	public static void main(String[] args) {
		// 1 --> Khai báo ,khởi tạo mảng

		//Cách 1
		int[] digits = new int[8];
		
		//gán,cập nhật giá trị cho phần tử trong mảng
		digits[2] = 123;
		digits[4] = 832;
		
		//in mảng
		System.out.println("digits --> " + Arrays.toString(digits));
		System.out.println("digits length: " + digits.length);
		System.out.println("digits[5] --> "+ digits[5]);
		
		
		System.out.println("================");
		
		//Cách 2 :khai báo và khởi tạo giá trị cho mảng
//		int[] numbews = fetchData();
//		int[] numbers = new int[] {47,86,95,15,34};
		int[] numbers = {47,86,95,15,34};
		//BT0 --> Tìm những phần tử lẻ trong mảng
		for(int i = 0; i< numbers.length; i++) {
			int currentNumber = numbers[i];
			if(currentNumber%2 != 0) {
				System.out.println("lẻ --> " + currentNumber);
			}
		}
		
		//BT1 --> Lấy 1 phần tử ngẫu nhiên trong mẳng numbers
		Random rd = new Random();
		int randomValue = numbers[rd.nextInt(numbers.length)];
		System.out.println("randomValue --> "+ randomValue);	
	}
	
	private static int[] fetchData() {
		return new int[] {47,86,95,15,34};
	}
}
