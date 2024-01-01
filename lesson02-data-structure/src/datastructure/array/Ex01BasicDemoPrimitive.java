package datastructure.array;

import java.util.Arrays;
import java.util.Random;

public class Ex01BasicDemoPrimitive {
	
	public static void main(String[] args) {
		
		int[] digits = new int[8];
		
		digits[2] = 123;
		digits[4] = 852;
		//digits[8]= 0;
		System.out.println("digits --> " + Arrays.toString(digits));
		System.out.println("digits length: " + digits.length);
		System.out.println("digits [5]: " + digits[5]);
		
		System.out.println("\n==============\n");
		
		//int[] number = new int[] {12,23,34,45,78};
		
		int[] number = {1,6,88,95,5};
		
		Random rd = new Random();
		
		int index = rd.nextInt(number.length);
		int randomValue = number[index];
		
		System.out.println("randomValue --> " + randomValue);
		
		
	}
	
	
}
