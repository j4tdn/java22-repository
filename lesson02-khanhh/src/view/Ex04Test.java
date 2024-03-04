package view;

import java.util.Random;

public class Ex04Test {
	
	public static void main(String[] args) {
		Random rd = new Random();
		
		int a = rd.nextInt(10,21);
		int b = rd.nextInt(10,21);
		int c = rd.nextInt(10,21);
		int d = rd.nextInt(10,21);
		
		int s = Ex03Test.tinhGiaiThua(a) 
				+ Ex03Test.tinhGiaiThua(b)
				+ Ex03Test.tinhGiaiThua(c)
				+ Ex03Test.tinhGiaiThua(d);
		
		System.out.println("S = " + s);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}

}
