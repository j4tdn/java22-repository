package datastructure.primitive;

public class Ex02PrimitiveDemo_VariableScope {
	public static void main(String [] args) {
		int a=88;
		int b=22;
		
		System.out.println("a = " +a);
		System.out.println("b = " +b);
		
		{
			char x ='@';
			System.out.println("a block = " +a);
			System.out.println("x block  = " +x);
		}
		
		demo();
	}
	
	private static void demo() {
		int x=11;
		int y=77;
		System.out.println("demo x = " +x);
	}
	
}
