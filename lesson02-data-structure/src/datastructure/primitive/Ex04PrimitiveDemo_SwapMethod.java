package datastructure.primitive;

public class Ex04PrimitiveDemo_SwapMethod {
	
	public static void main(String[] args) {
		// swap = hoán vị
		
		int a = 11;
		int b = 22;
		
		swap(a, b);
		
		System.out.println("a --> " + a);
		System.out.println("b --> " + b);
		
		modify(a);
		System.out.println("a --> " + a);
		
	}	
	private static void modify(int a) {
		int b = 22;
		a = 77;
		b = 99;
	}
	
	private static void swap(int a, int b) {
		int tmp = a;
		a = b;
		b = tmp;
		
	}
}
