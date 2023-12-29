package io;

import java.util.Random;

public class Ex02RandomDemo {
	public static void main(String [] args) {
		Random rd = new Random();
		
		int a = rd.nextInt(10);
		
		int c = rd.nextInt(10,20);
		System.out.println(a);
		System.out.println(c);
		
		
		float  fRand = rd.nextFloat(8.8f);
		System.out.println(fRand);
	}
}
