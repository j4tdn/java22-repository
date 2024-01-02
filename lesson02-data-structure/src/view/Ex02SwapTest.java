package view;

import bean.CustomInt;

public class Ex02SwapTest {
	public static void main(String[] args) {
		int x = 1;
		int y = 2;
		swapInt(x,y);
		System.out.println("x --> " + x);
		System.out.println("y --> " + y);
		System.out.println("==============================");
		
		
		Integer m = 55;
		Integer n = 77;
		swapInt (x,y);
		
		System.out.println("m --> " + m);
		System.out.println("n --> " + n);
		
		CustomInt ci1 = new CustomInt(12);
		CustomInt ci2 = new CustomInt(24);
		swapCustomInt(ci1, ci2);
		System.out.println("ci1 --> " + ci1);
		System.out.println("ci2 --> " + ci2);
		
		int a = 123;
		int b = 234;
		
		Integer a1 = 555;
		Integer b1 = 777; 
		
		a= a1; // gan KDL doi tuong cho nguyen thuy
		b1 = b;// gan KDL nguyen thuy cho doi tuoung
		
		// XUat hien tu JDK 1.5 --> cho phep tu dong 
		// auto boxing --> primitive --> object
		// auto unboxing --> object --> primitive
		
		
	}
	
	private static void swapCustomInt(CustomInt a, CustomInt b) {
		// TODO Auto-generated method stub
		int temp = a.value;
		a.value = b.value;
		b.value = temp;
	}
	// int a = x
	// int b = y
	private static void swapInt(int a, int b) {
		// TODO Auto-generated method stub
		int temp = a;
		a = b;
		b = temp;
	}
	private static void swapInteger(Integer a, Integer b) {
			// TODO Auto-generated method stub
		int temp = a;
		a = b;
		b = temp;
			
		
	}

}
