package baitap;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Ex10 {
	public static void main(String[] args) {
		int i =0;
		int[] array = new int[5];
		for(; i  < 5 ; i++) {
			int number = new  Random().nextInt(20, 30);
			
			System.out.println(number);
		}
		
	}
}
