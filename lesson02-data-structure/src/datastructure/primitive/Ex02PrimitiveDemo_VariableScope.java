package datastructure.primitive;

public class Ex02PrimitiveDemo_VariableScope {
	
	/*
	 * chuong trinh = class
	 * + cau truc du lieu (khai bao bien de luu tru du lieu)[toan cuc]
	 * + Ham, phuong thuc(chuc nang)
	 *  -> khai bao bien [cuc bo] khai bao ben trong ham
	 */
	
	// cu phap khai bao bien toan cuc = global variable
	// --> JAVA: attribute(thuoc tinh)
	// [access_modifier] [static] data_type variable_name [=] [initial value];
	
	// cu phap khai bao bien cuc bo = local variable
	// data_type variable_name [=] [initial value]
	
	static int w = 333;
	static double z = 88.22d;
	
	
	
	public static void main(String[] args) {
		// khai bao bien trong ham -->bien cuc bo = local variable
		// pham vi su dung lon nhat la ben trong ham chua no 
		
		//tong quat: bien co pham vi la block scope
		//khai bao bien, co pham vi tu {ngay truoc no den} ngay sau no
		
		// bien a , b chi duoc phep toi da trong ham` main
		int a = 88;
		int b = 22;
		
		{
			char x = '@';
			System.out.println("x block --> " + x);
			System.out.println("a block --> " + a);
		}
		
		System.out.println("a -> " + a);
		System.out.println("b -> " + b);
		
		// System.out.println("x --> " + x);
		
		// cach goi khi ham non-static
		//Ex02PrimitiveDemo_VariableScope object = new Ex02PrimitiveDemo_VariableScope
		// object.demo();
		
		Ex02PrimitiveDemo_VariableScope.demo();
		
		System.out.println("call 'w' from main --> " + Ex02PrimitiveDemo_VariableScope.w);
		System.out.println("call 'z' from main --> " + Ex02PrimitiveDemo_VariableScope.z);
	}
	private static void demo () {
		// bien x, y chi duoc phep dung trong ham demo
		int x = 11;
		int y = 77;
		System.out.println("demo x -> " + x);
		System.out.println("demo y -> " + y);
		
		int w = 555;
		
		System.out.println("call 'w' from demo --> " + Ex02PrimitiveDemo_VariableScope.w);
		System.out.println("call 'z' from demo --> " + Ex02PrimitiveDemo_VariableScope.z);
	}
}
