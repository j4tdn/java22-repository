package view;

import bean.CustomInt;

public class Ex02SwapTest {

	public static void main(String[] args) {
		int x = 1;
		int y = 2;
		swapInt(x ,y);
		
		System.out.println("x --> " + x);
		System.out.println("y --> " + y);
		
		System.out.println("===================");
		
		Integer m =1;
		 Integer n = 77;
		 swapInteger(m, n);
		 System.out.println("m--> " + m);
		 System.out.println("n--> " + n);
		
		 System.out.println("===================");
		 
		 CustomInt ci1 = new CustomInt(12);
		 CustomInt ci2 = new CustomInt(24);
		 swapCustomInt(ci1,ci2);
		 System.out.println("ci1--> " + ci1);
		 System.out.println("ci2--> " + ci2 );
		 
		 System.out.println("===================");
		 int a =123;
		 int b =234;
		 
		 Integer a1 = null;
		 Integer b1 = 777;
		 
		 a = a1;//gan kieu du lieu doi tuong cho nguyen thuy 
		 b1 = b; //gan kDL nguyen thuy cho doi tuong
		 
		 

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
		System.out.println("a--> " + a);
		 System.out.println("b--> " + b);
	}
	private static void swapInteger(Integer a, Integer b) {
		Integer temp = a ;
		a = b;
		b =temp;
		System.out.println("a--> " + a);
		 System.out.println("b--> " + b); 
	}

}