package view;

public class Ex05StaticNonStatic_LoadingTime {
	/*
	 Attribute, Method
	 
	 + Static: Class, object(Warning)
	 
	 + Non-Static: Object
	 
	 // Compile, Runtime
	 
	 // Runtime(
	  * Static(khởi tạo cho class khi running, load chương trình) -->
	  * Non-Static(chỉ thật sự đc khởi tạo khi khởi tạo đối tượng)
	 
	 */
	// Khởi tạo khi chạy chương trình lên
	private static String staticVariable;
	
	// Thật sự đc khởi tạo khi tạo ra 1 đối tượng từ class hiện tại
	private String nonStaticVariable;
	
	public static void main(String[] args) {
		Ex05StaticNonStatic_LoadingTime o1 = new Ex05StaticNonStatic_LoadingTime();
		o1.nonStaticMethod(); 
	}
	
	private static void staticMethod() {
		System.out.println("Ptint - Static Method");
		
		staticVariable = "static";
		
		// error: k thể gọi biến, hàm non-static trong hàm static
		// vì hàm static khởi tạo trước, giả sử lấy class gọi hàm static
		// lúc đó biến, hàm static đc gọi bên trong k biết của đối tượng nào --> lỗi
		
		// nonStaticVarible = "none";
		// nonStaticMethod();
	}
	
	// thật sự đc khởi tạo khi tạo ra 1 đối tượng từ class hiện tại
	private void nonStaticMethod() {
		System.out.println("Ptint - Non Static Method");
		
		nonStaticVariable = "none";
		
		// để gọi đc hàm non static, thì phải có 1 đối tượng gọi hàm
		// lúc đói tượng gọi hàm, truowvs đó class đã khởi tạo rồi
		// --> hàm, biến static đã có rồi
		// --> gọi hàm, biến static bên trong non-static
		
		staticVariable = "static";
		staticMethod();
	}
}
