 package datastructure.primitive;

public class Ex04PrimitiveDemo_SwapMethod {

	public static void main(String[] args) {
		int a = 11;
		int b = 22;
		swap(a, b);
		System.out.println(a);
		System.out.println(b);

}
	private static void swap(int a,int b) {
		int temp = a;
		
		a = b;
		
		b = temp;
	}

}
