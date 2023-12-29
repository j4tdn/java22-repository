package datastructure.primitive;

public class Ex02PrimitiveDemo_VariableScope {
	
	private static int w = 333;
	public static double z = 88.22d;
	
	public static void main(String[] args) {
		int a = 88;
		int b = 22;
		
		{
			char x = '@';
			System.out.println("x --> " + x);
			System.out.println("a --> " + a);
		}
		
		System.out.println("a --> " + a);
		System.out.println("b --> " + b);
		//System.out.println("x --> " + x);
		
		Ex02PrimitiveDemo_VariableScope.demo();
		
		System.out.println("call 'w' from main --> " + Ex02PrimitiveDemo_VariableScope.w);
		System.out.println("call 'w' from main --> " + Ex02PrimitiveDemo_VariableScope.z);
	}
	
	private static void demo() {
		int x = 11;
		int y = 77;
		System.out.println("x --> " + x);
		System.out.println("y --> " + y);
		
		int w = 555;
		
		System.out.println("call 'w' from main --> " + w);
		
		//System.out.println("call 'w' from main --> " + Ex02PrimitiveDemo_VariableScope.w);
		System.out.println("call 'w' from main --> " + Ex02PrimitiveDemo_VariableScope.z);
	}
}
