package view;

public class Ex05StaticNonStatic_LoadingTime {
	
	/*
	 Attribute, method
	 
	 +Static: class, object(waring)
	 +non-static: Object
	 
	 runtime:
     +static : khởi tạo ra cho class khi runing, load chương trình
     +non-static: chỉ thực sự được khởi tạo khi khởi tạo đối tượng	 
	 */
	
	//khỏi tạo khi chạy chương trình lên
	private static String staticVariable;
	
	//chỉ thực sự được khởi tạo khi mình tạo ra 1 đối tượng từ class hiên tại
	private String nonStaticVariable;
	
	public static void main(String[] args) {
		Ex05StaticNonStatic_LoadingTime o1 = new Ex05StaticNonStatic_LoadingTime();
		o1.nonStaticMethod();
		
	}

	//khỏi tạo khi chạy chương trình lên
	private static void staticMethod() {
		System.out.println("print - static method");
		
		staticVariable = "static";
		
		//error: không thể gọi biến, hàm non-static trong hàm static
		//vì hàm static được khởi tạo trước, gỉa  sử láy class gọi 
		//hàm static lúc đó biến, hàm static được gọi bên trong không biết
		// của đối tượng nào --> lỗi
		//nonStaticVariable = "non";
		//nonStaticMethod();
	}
	
	//chỉ thực sự được khởi tạo khi mình tạo ra 1 đối tượng từ class hiên tại
	private void nonStaticMethod() {
		System.out.println("print - non static method");
	    
		nonStaticVariable = "none";
		
		
		//để gọi đươc hàm nóntatic, thì phải có 1 đôis tượng gọ hàm
		//lúc đối tượng gọi hàm, trước đó class đã khởi tạo rồi
		//--> hàm, biéne static đã có rồi
		//--> gọ hàm, biến static bên trong non-static
		staticVariable = "static";
		staticMethod();
		
		/*
		 static gọi trong nonstatic thì ok
		 nonstatic gọi bên trong static là không được
		 */
	}
	
	
}
