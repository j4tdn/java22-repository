package datastructure.primitive;

public class Ex02PrimitiveDemo_VariableScope {
	
	static int w = 333;
	static double z = 88.22d;
	
	//Cú pháp khai báo: [access modifier] [static] [final] datatype variablename
	
	
	public static void main(String[] args) {
		// khai báo biến trong hàm --> biến cục bộ = local variable
		// phạm vi sử dụng lớn nhất là bên trong hàm chứa nó
		
		//tổng quát: biến có phạm vi là block scope
		// khai báo biến, có phạm vi từ { ngay trước nó đến } ngay sau nó
		
		// biến a,b chỉ được phép tối đa trong hàm main
		int a = 88;
		int b = 22;
		
		//giải lập block, nhiều cú pháp chứa block
		{
			char x = '@';
			System.out.println("x block -> " + x);
			System.out.println("a block -> " + a);
		}
		
		System.out.println("a = "+ a);
		System.out.println("b = "+ b);
		
		demo();
		
		System.out.println("call'w' from main --> "+ Ex02PrimitiveDemo_VariableScope.w);
	}
    
	private static void demo() {
		//biến x,y chỉ được dùng tối đa trong hàm demo
		int x = 11;
		int y = 77;
		int w = 555;
		
		System.out.println("demo x -> " + x);
		System.out.println("demo y -> " + y);
		System.out.println("call'z' from demo --> "+ z);
		System.out.println("call'w' from demo --> "+ w);
	}
}
