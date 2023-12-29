package view;

import bean.CustomInt;

public class Ex02SwapTest {
	public static void main(String[] args) {
		int x = 1;
		int y = 2;
		swapInt(x, y);
		System.out.println("x --> " + x);
		System.out.println("y --> " + y);
		
		System.out.println("===========================");
		
		Integer m = 55;
		Integer n = 77;
		swapInteger(m, n);
		System.out.println("m --> " + m);
		System.out.println("n --> " + n);
		
		System.out.println("===========================");
		
		CustomInt ci1 = new CustomInt(12);
		CustomInt ci2 = new CustomInt(24);
		swapCustomInt(ci1, ci2);
		System.out.println("ci1 --> " + ci1);
		System.out.println("ci2 --> " + ci2);
		
		System.out.println("=========================");
		
		
		
	}
	
	private static void swapCustomInt(CustomInt a, CustomInt b) {
		int temp = a.value;
		a.value = b.value;
		b.value = temp;
	}
	
	private static void swapInt(int a, int b) {
		int tem = a;
		a = b;
		b = tem;
	}
	
	private static void swapInteger(Integer a, Integer b) {
	    Integer tem = a;
		a = b;
		b = tem;
	}

}
