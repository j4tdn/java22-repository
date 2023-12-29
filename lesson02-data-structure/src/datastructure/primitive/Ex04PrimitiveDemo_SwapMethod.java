package datastructure.primitive;

public class Ex04PrimitiveDemo_SwapMethod {
	public static void main (String [] args) {
		int a =11;
		int b=22;
		swap(a,b);
		
		System.out.println("a -->" +a);
		System.out.println("b ->>" +b);
	}
	
	private static void swap( int a, int b) {
		int tmp=a;
		a=b;
		b=tmp;
	}
}
