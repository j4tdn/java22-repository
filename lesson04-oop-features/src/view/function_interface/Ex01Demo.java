package view.function_interface;

public class Ex01Demo {

	/*
	 Functional Interface:
	 là interface có duy nhất 1 hàm trừu tượng 
	 Ví dụ 
	 interface Test01{
	 	void hello();
	 }
	 */
	
	public static void main(String[] args) {
		
		//Để khởi tạo 1 đối tượng cho 1 interface
		
		//Cách 1: Sử dụng từ khoá new
		//+ : không cần tạo class mới
		//- : nếu nội dung code override dài --> khó đọc
		
		F1Shape f11Shape = new F1Shape() {
			
			@Override
			public void paint(String color) {
				System.out.println("f11shape(anonymous class) --> paint(" + color + ")");
				
			}
		};
		f11Shape.paint("red");
		
		System.out.println("\n ==================\n");
		
		//Cách 2: Tạo implementation class, implement từ interface
		//		: sau đó new lớp thực thi ra 
		//+: toàn bộ phần override nằm bên impl class -> nơi gọi ngắn gọn
		//-: phải tạo thể class mới 
		F1Shape f12Shape = new F12Shape();
		f12Shape.paint("blue");
		
		//Cách 3: sử dụng biểu thức lamda(chỉ áp dụng cho functional interface)
		//lamda = anonymous function 
		
		F1Shape f13Shape = (String color) -> {
			System.out.println("f13shape(anonymous function) --> paint(" + color + ")");
		};
		f13Shape.paint("orange");
	}
}
