package view;

import bean.CustomInt;

public class Ex02SwapTest {
	
	public static void main(String[] args) {
		int x = 1;
		int y = 2;
		swapInt(x,y);
		System.out.println("x -->" + x);
		System.out.println("y -->" + y);
		
		System.out.println("==============================");
		
		Integer m = 55;
		Integer n = 77;
		swapInteger(m,n);
		System.out.println("m --> " + m);
		System.out.println("n --> " + n);
		
		System.out.println("==============================");
		
		CustomInt ci1 = new CustomInt(12); //H1(value=24)
		CustomInt ci2 = new CustomInt(24); //H2(value=12)
		swapCustomInt(ci1, ci2);
		System.out.println("ci1 -->" + ci1); //-->24
		System.out.println("ci2 -->" + ci2); //-->12
		
		System.out.println("===============================");
		//boxing - unboxing
		//Long,long
		//Double, double
		//Float, float
		//Integer, int
		
		int a = 123;
		int b = 234;
		
		Integer a1 = 555;
		Integer b1 = 777;
		
		a = a1;
		b1 = b;
		
		System.out.println("a --> " + a);
		System.out.println("b1 --> " + b1);
		
	}
	
	private static void swapCustomInt(CustomInt a, CustomInt b) {
		int temp = a.value;
		a.value = b.value;
		b.value = temp;
	}
	
	private static void swapInt(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}
	
	private static void swapInteger(Integer a, Integer b) {
		Integer temp = a;
		a = b;
		b = temp;
	}
	
	
}
