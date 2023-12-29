package datastructure.primitive;

public class Ex02PrimitiveDemo_VariableScope {
	private static int w = 333;
	public static double z = 88.22d;
	
	
   public static void main(String[] args) {
   int a = 88; 
   int b = 22;
   {
	   char x = '@';
	   System.out.println("x block --> " + x);
	   System.out.println("a block --> " + a);
   }
   System.out.println("a ->" + a);
   System.out.println("b ->" + b);
   demo();
   // System.out.println("call 'w' from main -->" + Ex02PrimitiveDemo_VariableScope.w );
   System.out.println("call 'z' from main -->" + Ex02PrimitiveDemo_VariableScope.z );
}
   private static void demo() {
	   // biến x, y chỉ đc tối da trong hàm 
	   int x = 11;
	   int y = 77;
	   System.out.println("demo x ->" + x);
	   System.out.println("demo y ->" + y);
	   int w = 555;
	   System.out.println("call 'w' from main -->" +w );
	   
   }
   
}
