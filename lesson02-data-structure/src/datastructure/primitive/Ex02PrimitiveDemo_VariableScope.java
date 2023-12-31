package datastructure.primitive;

public class Ex02PrimitiveDemo_VariableScope {
	// cú pháp khai báo biến toàn cục = global varible:
	// trong JAVA thì gọi là: attribute
	// [access_modifier] [static] data_type variable_name = variable;
	static int w = 333;
	static double z = 88.2d;
	
	public static void main(String[] args) {
		// Khai báo biến trong hàm --> biến cục bộ = local variable
		// Phạm vi sử dụng lớn nhất là bên trong hàm chứa nó
		// tổng quát: biến có phạm vi là block scope
		
		// biến a, b chỉ được phép tối đa trong hàm main

		
		int a = 88;
		int b = 22;
		
		// giả lập block, nhiều cú pháp chứa block
		{
			char x = '@';
			System.out.println("x block --> " + x);
			System.out.println("a block --> " + a);
			
			System.out.println("call 'w' from main --> " + Ex02PrimitiveDemo_VariableScope.w);
			System.out.println("call 'z' from main --> " + Ex02PrimitiveDemo_VariableScope.z);
		}
		System.out.println("a --> " + a);
		System.out.println("b --> " + b);
		
		demo();
	}
	// biến x, y chỉ được dùng tối đa trong hàm demo
	private static void demo() {
		int x = 11;
		int y = 77;
		System.out.println("x --> " + x);
		System.out.println("y --> " + y);
		
		int w = 555;
		
		System.out.println("call 'w' from demo --> " + w);
		
		System.out.println("call 'w' from demo --> "+ Ex02PrimitiveDemo_VariableScope.w);
		System.out.println("call 'z' from demo --> "+ Ex02PrimitiveDemo_VariableScope.z);
	}

}
