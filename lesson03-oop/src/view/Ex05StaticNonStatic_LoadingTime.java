package view;

public class Ex05StaticNonStatic_LoadingTime {
    //Khoi tao khi chay chuong trinh
	private static String staticVariable;
	
	//Thật sự được khởi tạo khi tạo ra 1 đối tượng từ class hiện tại 
	private String nonStaticVariable;


	public static void main(String[] args) {

	}
	private static void staticMethod() {
		System.out.println("Print - Static Method");
		//Error :không thể gọi biến, hàm non-static trong hàm static,
		// vì hàm static khởi tạo trước, giả sử lấy class gọi hàm static thúc đó
		// biến, hàm static được gọi bên trong ko biết của đối tượng nào --> lỗi 
		// nonStaticVariable = " one ";
		// nonStaticVariable();
		
	}
	//That su dc khoi tao khi tao ra 1 doi tuong tu Class hien tai 
	private  void nonStaticMethod() {
		System.out.println("Print - Non-Static Method");
		nonStaticVariable =" none";
		
		staticVariable ="static";
		staticMethod();
	}

}
