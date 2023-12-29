package datastructure;

public class Ex02PrimitiveDemo_VariableScope {
	/*
	 Cấu trúc dữ liệu(khai báo biến để lưu trữ dữ liệu) [toàn cục]
	
	//cú pháp khai báo biên toàn cục:
	[access modified] [static] data_type variable_name [=] [initial value];
	
	//cú pháp khai báo biến cục bộ:
	 data_type variable_name [=] [initial value];
	*/
	static int w = 333;
	static double z = 88.22d;
	
	public static void main(String[] args) {
		//khai bao bien trong ham --> bien cuc bo (local varible)
		//pham vi lon nhat là bên trong hàm chứa nó
		
		//tổng quát: biến có phạm vi là block scope
		//khai báo biến, có phạm vi từ { ngay trước nó đến } ngay sau nó
		int a = 88;
		int b = 22;
		
		//giải lập block, nhiều cú pháp chứa block
		{
			char x = '@';
			System.out.println("x block -->" + x );
			System.out.println("a block ->" + a);
		}
		
		System.out.println("a->" + a);
		System.out.println("b->" + b);
//		System.out.println("x-->" + x );
		
		Ex02PrimitiveDemo_VariableScope.demo();
		
		System.out.println("call w from main" + Ex02PrimitiveDemo_VariableScope.w); //có static 
		System.out.println("call z from main" + Ex02PrimitiveDemo_VariableScope.z);
	}
	
	private static void demo() {
		//bien x,y chi dc phai dung toi da trong ham demo
		int x = 11;
		int y = 77;
		System.out.println("demo x->" + x);
		System.out.println("demo y->" + y);
		
		int w = 555;
		System.out.println("call w from demo -->"+w); // 333
		
//		System.out.println("call w from main -->" + Ex02PrimitiveDemo_VariableScope.w); //có static 
		System.out.println("call z from main --> " + Ex02PrimitiveDemo_VariableScope.z);
		
	}
	
}
