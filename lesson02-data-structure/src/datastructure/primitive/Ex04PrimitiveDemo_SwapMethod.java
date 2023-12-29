package datastructure.primitive;

public class Ex04PrimitiveDemo_SwapMethod {
    //swap: hoán vị
	public static void main(String[] args) {
		int a = 11;
		int b =22;
		swap(a,b);
		System.out.println(a);
		System.out.println(b);
		modify (a);
		System.out.println(a);
	}
	private static void modify (int a) {
		int b =22;
		a=77;
		b=99;
	}
	public static void swap(int a, int b) {
		// TODO Auto-generated method stub
       int tmp = a;
       a=b;
       b=tmp;
	}
}
