package datastructure.primitive;

public class Ex02primitiDemo_VariableScope {
	static int w= 128;
	static double  q= 12.1d;
	public static void main(String[] args) {
		int a = 88;
		int b = 22;
		System.out.println(a);
		System.out.println(b);
		{ 
			char x ='a';
			System.out.println(x);
		}
		demo();
	}
	private static void demo() {
		int w = 128;
		System.out.println(w);// ưu tiên biến cục bộ
		int x = 12;
		int y = 232;
		System.out.println(x);
		System.out.println(y);
	}
}
