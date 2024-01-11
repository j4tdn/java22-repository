package view;

public class Ex05StaticnonStaic_LoadingTime {
/*
 * Attribute, Method
 * 
 * +Static: Class, Object(Warning)
 * +non Static: Object
 * 
 * 
 * 
 * compile, runtime
 */
	
	//khoi tao khi chay chuong trinh len
	private static String staticVariable;
	
	
	//chi thuc su duoc khoi tao khi tao ra 1 doi tuong tu class hien tai
	private String nonStaticVariable;
	public static void main(String[] args) {
		
	}
	private static void staticMethod() {
		System.out.println("print - Static method");
		
		staticVariable = "static";
		//error: ko the goi bien, ham non static trong ham static
		//vi ham static khoi tao truoc
		//nonStaticVariable ="non";
	}
	 
	private void nonstaticMethod() {
		System.out.println("print - Non Static method");
		nonStaticVariable ="none";
		
		
		// để gọi được hàm non static, thì phải có 1 đối tượng gọi hàm, lúc đối tượng gọi hàm, trước đó calss đã khởi tạo
		// --> hàm biến static đã có rồi
		//--> gọi hàm, biến static bên trong non static
		
		staticVariable="static";
		staticMethod();
	}
}
