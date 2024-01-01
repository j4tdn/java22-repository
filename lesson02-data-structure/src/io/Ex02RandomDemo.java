package io;

import java.util.Random;

public class Ex02RandomDemo {

	public static void main(String[] args) {
		
		Random rd = new Random();
		
		int a = rd.nextInt();//-2^32 -> 2^32-1
		
		int b = rd.nextInt(10);//[0, 10)
		
		int c = rd.nextInt(10, 20);//[10, 20)
		System.out.println("a--> " + a);
		
		System.out.println("b--> " + c);
		
		System.out.println("c--> " + c);
		
		

	}

}