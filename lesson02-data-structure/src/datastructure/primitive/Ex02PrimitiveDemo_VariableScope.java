package datastructure.primitive;

public class Ex02PrimitiveDemo_VariableScope {

	
	 static int w = 333;
	 static double z = 88.22d;
	
	public static void main(String[] args) {
		// khai báo biến trong hàm --> biến cục bộ = local variable
		// phạm vi sử dụng lớn nhất là bên trong hàm chứa nó
		
		// tong quat: bien co pham vi la block scope 
		
		
		int a = 88;
		int b = 22;
		
		{
			char x = '@';
			System.out.println("x block -->" + x);
			System.out.println("a block -->" + a);
		}
		
		System.out.println("a->" + a);
		System.out.println("b->" + b);
		
		demo();
		
		System.out.println("call 'w' from main = " + Ex02PrimitiveDemo_VariableScope.w);
		System.out.println("call 'z' from main = " + Ex02PrimitiveDemo_VariableScope.z);
		
	}
	
	private static void demo() {
		// biến x, y chỉ dc dùng 
		int x = 11;
		int y = 77;
		System.out.println("demo x ->" + x);
		System.out.println("demo y ->" + y);
		
		int w = 555;
		
		System.out.println("w -> "+w);
		
		System.out.println("call 'w' from demo --> " + Ex02PrimitiveDemo_VariableScope.w);
		
		System.out.println("call 'z' from demo -->" + Ex02PrimitiveDemo_VariableScope.z);
	}
	
}
