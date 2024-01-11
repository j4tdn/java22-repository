package view;

public class Ex05StaticNonStatic_LoadingTime {
	/*
	 * Atribute, Method
	 * 
	 *  	+Static: Class, Object(Warning)
	 *  	+Non-static:Object
	 *  
	 *  //Compile, Runtime
	 *  
	 *  //Runtime(
	 *  	Static(Khởi tạo ra cho class khi running, load chương trình 
	 *  	Non-static( Chỉ thật sự được khởi tạo khi khởi tạo đối tượng)
	 */
	//Khơi tạo khi chạy chương trình lên
	private static String staticVariable;
	//Thật sự được khởi tạo khi tạo ra 1 đối tượng từ class hiện tại
	private String nonStaticVariable;
	
	public static void main (String[] args) {
		
	}
	
	private static void staticMethod() {
		System.out.println("Print-Static Method");
		
		staticVariable ="Static";
		//hàm static khởi tạo trước
		//biến, hàm static được gọi đến không biết là của đối tượng nào ->error
	}
	
	private void nonStaticMethod() {
		System.out.println("Print- Non Static Method");
		
		//để gọi được hàm non static, thì phải có đối tượng
		//lúc đối tượng gọi hàm, trước đó class đã khởi tạo rồi
		//--> hàm, biến static đã có rồi  
		nonStaticVariable = "non";
		staticVariable ="Static";
		staticMethod();
		
	}
}
