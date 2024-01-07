package view;

public class Ex05StaticNonStatic_Loadingtime {
	
	private static String staticVariable;// khởi tạo khi chatyj chương trình lên 
	private String nonVariable ;// khởi tạo khi khởi tạo đối tượng từ class hiện tại 
	public static void main(String[] args) {
		
	}
	private static void staticMethod() {
		System.out.println("print -static method");
	}
	private void nonStaticMethod() {
		System.out.println("non staic");
		nonStaticMethod();
		staticVariable= "static";
		nonVariable = "none";
	}
}
