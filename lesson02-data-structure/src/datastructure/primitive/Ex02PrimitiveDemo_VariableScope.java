package datastructure.primitive;

public class Ex02PrimitiveDemo_VariableScope {
	//bien toan cuc
	static int w =333;
	static double z = 88.22d;
	
	public static void main(String[] args) {
		// khai bao bien trong ham -->bien cuc bo = local variable
		//pham vi su dung lon nhat ben trong ham chua no 
		
		//
		
		// bien a,b sd toi da trong ham main
		int a = 88;
		int b = 22;
		
		{
			char x = '@';
			System.out.println("x block--> " + x);
			System.out.println("a block--> " + a);
		}
		
		System.out.println("a--> " + a);
		System.out.println("b--> " + b);
//		System.out.println("x--> " + x); ko dc
		demo();
		System.out.println("call 'w'  from -->" + + Ex02PrimitiveDemo_VariableScope.w);
		System.out.println("call 'z'  from -->" + Ex02PrimitiveDemo_VariableScope.z);
	}
	private static void demo() {
		int x = 11;
		int y = 77;
		System.out.println("demo --> " + x);
		System.out.println("demo --> " + y);
		int w =555;
		System.out.println("call 'w' " + w);
		
		System.out.println("call 'w'  from -->" + + Ex02PrimitiveDemo_VariableScope.w);
		System.out.println("call 'z'  from -->" + Ex02PrimitiveDemo_VariableScope.z);
	}

}
