package view;

public class Ex05StaticNonStatic_LoadingTime {

	private static String staticVariable;
	private String nonStaticVariable;
	public static void main(String[] args) {
		
	}
	
	private static void staticMethod() {
		System.out.println("PRINT - STATIC METHOD");
		
		staticVariable = "static";
		//error: ko thể gọi biến , hàm non-static trong hàm static
		//vì hàm static khởi 
	}
	
	private void nonStaticMethod() {
		
		staticVariable = "static";
		nonStaticVariable = "non";
		
		//đẻ goi dc hàm nonstatic , thì phải có 1 đối tượng gọi hàm 
		//lúc đối tượng goi hàm, trước đó class đã khởi tạo rồi
		// --> hàm , biến static đã có rồi
		// --> gọi hàm, biến static bên trong non-static
		
		
		staticMethod();
	}
}
