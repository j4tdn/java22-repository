package view;

public class Ex05StaticNonStatic_LoandingTime {
	// khởi tạo khi chạy chương trình lên
	private static String staticVariable;
	//Thật sự được khởi tọa khi tạo ra 1 đối tượng từ class hiện tại
	private String nonStaticVariable;
	public static void main(String[] args) {
		// Compile, Runtime
		//Runtime (
		// + Static(khởi tạo ra cho class khi running, load chương trình) -->
		// + Non-Static(chỉ thật sự được khởi tạo khi khởi tạo đối tượng)
		
	}
	// khởi tạo khi chạy chương trình lên
	private static void staticMethod() {
		System.out.println("PRINT - STATIC METHOD");
		staticVariable = "static";
		/*erro: ko thể gọi biến, hàm non-static trong hàm static
		 * vì hàm static khởi tạo trước, giả sử lấy class gọi hàm static
		 * lúc đó biến, hàm static được gọi bên trong ko biết của đối tượng nào --> lỗi
		nonStaticVariable = "none";
		nonStaticMethod();
		*/
	}
	//Thật sự được khởi tọa khi tạo ra 1 đối tượng từ class hiện tại
	private static void nonStaticMethod() {
		System.out.println("PRINT - NON STATIC METHOD");
	
		/*
		 để gọi được hàm non static, thì phải có 1 đối tượng gọi hàm
		 lúc đó đối tượng gọi hàm, trước đó class đã khởi tạo rồi
		 --> hàm, biến static đã có rồi
		 --> gọi hàm, biến static bên trong non-static
		 */
		staticVariable = "static";
		staticMethod();
	}

}
