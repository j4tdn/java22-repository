package datastructure.primitive;

public class Ex02PrimitiveDemo_VariableScope {
     static int w = 88;
     static double z = 77d;

	public static void main(String[] args) { 
		//Biến a và b chỉ được phép dùng trong hàm main 
		//tổng quát : biến có phạm vi là block scope 
		//khai báo biến, có phạm vi từ { ngay trước nó đến } ngay sau nó 
		int a = 88;
		int b = 22;
		System.out.println("a ->" + a);
		System.out.println("b ->" + b);

		{
			char x = '@';
			System.out.println(x);
		}//một cái block 
		//System.out.println(x);  lỗi 
		demo();


	}
	private static void demo() {
		//Biến x và y chỉ được phép dùng trong hàm demo 
		int x = 11;
		int y = 77;
		System.out.println("demo x ->" + x  );
		System.out.println("demo y  ->" + y  );
		


		
	}
	

}
