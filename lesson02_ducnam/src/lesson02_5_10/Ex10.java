package lesson02_5_10;

import java.util.Arrays;
import java.util.Random;

public class Ex10 {
	public static void main(String[] args) {
		int[] numbers = new int[5];
		
	  Random rd = new Random();
	  int a = rd.nextInt(20, 30);
	  numbers[0] = a;
	  
	 for(int i = 1 ; i <= 4; i++) {
		  a = rd.nextInt(20, 31);
		  if(checkExists(numbers, a)) {
			  i--;
		 } else {
			  numbers[i] = a;
		  }
	  }
	 
	  
		System.out.println("số nguyên ngẫu nhiên");
        System.out.println(Arrays.toString(numbers));
	}
	
	public static boolean checkExists(int[] arr, int value) {
		for(int i=0; i< arr.length; i++) {
			if(arr[i] == value) {
				return true;
			}
		}
		return false;
	}
}