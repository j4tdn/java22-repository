package datastructure.primitive;

public class Ex02PrimitiveDemo_VariableScope {
	
	static int w = 333;
	static double z = 88.22d;
	
	public static void main(String[] args) {
		// block scope
		int a = 88;
		int b = 22;
		
		// giải lập block, nhiều cú pháp chứa block
		{
			char x = '@';
			System.out.println("x -> "+x);
		}
		
		
		System.out.println("a -> "+a);
		System.out.println("b -> "+b);
		
		demo();
		
		System.out.println("call 'w' from main -> " +Ex02PrimitiveDemo_VariableScope.w);
		System.out.println("call 'z' from main -> " +Ex02PrimitiveDemo_VariableScope.z);
	}
	
	private static void demo() {
		int x = 11;
		int y = 77;
		System.out.println("x -> "+x);
		System.out.println("y -> "+y);
		int w = 555;
		
		System.out.println("w -> "+w);
		
//		System.out.println("call 'w' from main -> " +Ex02PrimitiveDemo_VariableScope.w);
		System.out.println("call 'z' from main -> " +Ex02PrimitiveDemo_VariableScope.z);
	}
}
