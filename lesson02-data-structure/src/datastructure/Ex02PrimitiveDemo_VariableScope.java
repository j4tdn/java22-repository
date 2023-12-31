package datastructure;

public class Ex02PrimitiveDemo_VariableScope {
	public static void main(String[] args) {
		
		//biến x,y chỉ đc phép sử dụng tối đa trong hàm main

		int a = 88;
		int b = 22;
		
		System.out.println("a : " + a);
		System.out.println("b : " + b);

	}
	private static void demo() {
		//biến x,y chỉ đc phép sử dụng tối đa trong hàm demo
		int x = 77;
		int y = 11;
		System.out.println("x : " + x);
		System.out.println("y : " + y);


	}
}
