package io;

import java.util.Random;

public class Ex02RandomDemo {
	public static void main(String[] args) {
		
		Random rd=new Random();
		
		int a=rd.nextInt();
		int b=rd.nextInt(10);
		int c=rd.nextInt(10, 20);
		System.out.println("a-->"+a);
		System.out.println("b-->"+b);
		System.out.println("c-->"+c);
//		rd.nextFloat(c, b)
		float fRand=rd.nextFloat(8.8f);
		System.out.println("->"+fRand);
	}
}
