package datastructure.primitive;

public class Ex02PrimitiveDemo_VariableScope {
	
	static int w = 333;
	static double z = 88.22d;
	
	public static void main(String[] args) {
	  	int a = 88;
	  	int b = 22;
	  	int w = 555;
	  	
	  	
	  	{
	  		char x = '@';
	  		System.out.println("x block -->" + x);
	  		System.out.println("a block -->" + a);
	  	}
	  	
	  	System.out.println("a--> " + a);
	  	System.out.println("b--> " + b);
	  	//System.out.println("x --> " + x);
	  	
	  	demo(); 
	  	
	  	System.out.println("call 'w' from main -->" + w);
	  	System.out.println("call 'z' from main -->" + z);
	  	
	  	System.out.println(Ex02PrimitiveDemo_VariableScope.w);
	  	System.out.println(Ex02PrimitiveDemo_VariableScope.z);
	}
	
	private static void demo() {
		int x = 11;
		int y = 77;
		System.out.println("demo x--> " + x);
		System.out.println("demo y--> " + y);
		
		System.out.println(w);
	  	System.out.println(z);
	}

}
