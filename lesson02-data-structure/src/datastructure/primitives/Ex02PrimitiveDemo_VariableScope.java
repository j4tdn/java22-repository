package datastructure.primitives;

public class Ex02PrimitiveDemo_VariableScope {
	
	/*
	 * Chương trình = Class
	 * + Cấu trúc dữ liệu(khai báo biến để lưu trữ dữ liệu) [toàn cục]
	 * 
	 * + Hàm, phương thức(chức năng)
	 * 	 -> khai báo biến[cục bộ]
	 */
	
	// cú pháp khai báo biến toàn cục = global variable
	// --> JAVA: attribute(thuộc tính)
	// [access_modifier] [static] data_type variable_name [=] [initial value]
	
	// cú pháp khai báo biến cục bộ = local variable
	// data_type variable_name [=] [initial value]
	
	private static int w = 333;
	public static double z = 88.22d;
	
	public static void main(String[] args) {
		// khai báo biến trong hàm --> biến cục bộ = local variable
		// phạm vị sử dụng lớn nhất là bên trong hàm chứa nó
		
		// tổng quát: biến có phạm vi là block scope
		// khai báo biến, có phạm vi từ { ngay trước nó đến } ngay sau nó
		
		// biến a, b chỉ được phép tối đa trong hàm main
		int a = 88;
		int b = 22;
		
		// giải lập block, nhiều cú pháp chứa block
		{
			char x = '@';
			System.out.println("x block --> " + x);
			System.out.println("a block --> " + a);
		}
		
		System.out.println("a -> " + a);
		System.out.println("b -> " + b);
		// System.out.println("x --> " + x);
		
		// cách gọi khi hàm non-static
		// Ex02PrimitiveDemo_VariableScope object = new Ex02PrimitiveDemo_VariableScope();
		// object.demo();
		
		Ex02PrimitiveDemo_VariableScope.demo();
		
		System.out.println("call 'w' from main --> " + Ex02PrimitiveDemo_VariableScope.w);
		System.out.println("call 'z' from main --> " + Ex02PrimitiveDemo_VariableScope.z);
	}
	
	private static void demo() {
		// biến x, y chỉ được phải dùng tối đa trong hàm demo
		int x = 11;
		int y = 77;
		System.out.println("demo x -> " + x);
		System.out.println("demo y -> " + y);
		
		int w = 555;
		
		System.out.println("call 'w' from demo --> " + w);
		
		// System.out.println("call 'w' from demo --> " + Ex02PrimitiveDemo_VariableScope.w);
		System.out.println("call 'z' from demo --> " + Ex02PrimitiveDemo_VariableScope.z);
	}
}