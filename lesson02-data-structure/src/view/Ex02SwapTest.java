package view;

import bean.CustomInt;

public class Ex02SwapTest {
	public static void main(String[] args) {
		CustomInt ci1 = new CustomInt(12);
		CustomInt ci2 = new CustomInt(24);
		SwapCustomInt(ci1, ci2);
		System.out.println("ci1 --> " + ci1);
		System.out.println("ci2 --> " + ci2);
		
		System.out.println("====================");
		//boxing - unboxing
		
		int a = 123;
		int b = 234;
		
		Integer a1 = 555;
		Integer b1 = 777;
		
		a = a1;//gán a1.intValue();
		b1 = b;//Integer.parseInt(b)
		// xuất hiện từ JDK 1.5 --> là cho phép :
		//auto boxing --> primitive -    > obj
		//auto unboxing --> obj -> primitive
		System.out.println("");
		
	}
	
	public static void SwapCustomInt(CustomInt a, CustomInt b) {
		int temp = a.value;
		a.value = b.value;
		b.value = temp;
	}
}
