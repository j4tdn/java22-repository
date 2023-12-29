package datastructure.primitive;

public class Ex02PrimitiveDemo_VariableScope {
	static int w=333;
	static double z = 88.22d;
  public static void main(String[] args) {
	  int a = 88;
	  int b = 22;
	  {
		  char x = '@';
		  System.out.println(x);
	  }
	  System.out.println("a="+a);
	  System.out.println("b="+b);
	  demo();
	  Ex02PrimitiveDemo_VariableScope.demo();
	  System.out.println(z);
	  System.out.println(w);
}
  private static void demo() {
	  int x= 12;
	  int y= 13;
	  System.out.println(x);
	  System.out.println(y);
	  System.out.println(z);
	  System.out.println(w);
  }
}
