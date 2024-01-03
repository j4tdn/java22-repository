package view;

import java.util.Arrays;
import java.util.Random;

public class Ex10Random {
	public static void main(String[] args) {
		Random rd = new Random();
		
		int [] number = {20, 21 ,22, 23, 24, 25, 26, 27, 28, 29, 30}; // [20, 31)
		
		int k = 5;
		int running = 0;
		int [] picknumber = new int [k];
		
		while (true) {
			int temp = number[rd.nextInt(number.length)];
			
			if (isExists(temp, picknumber)) {
				continue;		
			} 
			picknumber[running] = temp;
			running ++;
			if (running == k) {
				break;
			}
		}
		
		System.out.println("picknumber --> " + Arrays.toString(picknumber));
	}
	
	private static boolean isExists(int temp, int [] elements) {
		for (int i = 0; i < elements.length; i++) {
			if (temp == elements [i]) {
				return true;
			}
		}
		return false;
	}

}
