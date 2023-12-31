package io;

import java.util.Random;

public class Ex02RandomDamo {
	
	public static void main(String[] args) {
		Random rd = new Random();
		int a = rd.nextInt(); // -2^32 -> 2^32-1
		
		int b = rd.nextInt(10); // 0->9
		
		int c = rd.nextInt(10,20);
		
		System.out.println("a--> "+a);
		System.out.println("b--> "+b);
		System.out.println("c--> "+c);
	}
}
