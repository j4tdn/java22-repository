package view;

import java.awt.geom.NoninvertibleTransformException;

public class Ex05StaticNonStatic_LoadsingTime {

/*
 Atrribute, Method
 
 + static: Class, Object(warning)
 
 + Non-Static: Object
 
 //Compile, Runtime
 
 // Runtime
  * Static( Khỏi tạo cho class running, load chương trình) -->
  * Non-Static( Chỉ thật sự được tạo khi khỏi tạo đối tượng)
 */
	//Khởi tạo khi chạy chương trình lên
	private static String staticVariable;
	
	//thật sự được khởi tạo khi tạo ra 1 đối tượng từ class hiện tại
	private String nonStaticVariable;
	
	public static void main(String[] args) {
		
	}
	
	//Khởi tạo khi chạy chương trình lên
	private static void staticMethod() {
		System.out.println("PRINT - STATIC MOTHOD");
		
		staticVariable = "static";
		
		//error: không thể gọi biến, hàm non-static trong hàm static
		//vì hàm static khỏi tạo trước, giả sử lấy class gọi hàm static
		//lúc đó biến, hàm static đuợc gọi bên trong không biết của đối tượng nào --> lỗi
		
		//nonStaticVariable = "none";
		//nonStaticMethod():
	}
	
	//thật sự được khởi tạo khi tạo ra 1 đối tượng từ class hiện tại
	private void nonStaticMethod() {
		System.out.println("PRINT - NON STATIC METHOD");
		
		nonStaticVariable = "none";
		
		//để gọi được hàm non static, thì phải có 1 đối tượng gọi hàm
		//lúc đối tượng gọi hàm, trước đó class đã khởi tạo rồi
		// --> hàm, biến static đã có rồi
		// --> gọi hàm, biến static bên trong non-static
		
		staticVariable = "static";
		staticMethod();
	}
}
