package view.function_interface;

public class Ex01Demo {
	public static void main(String[] args) {
		//để khởi tạo đối tượng cho interface
		//C1: sử dụng từ khóa new
		
		//anonymous class: class k có tên
		//anonymous function: function ko có tên
		
		//+ ko cần phải tạo class mới
		//- nếu nội dung code override dài --> khó đọc, nhớp
		F1Shape f11Shape = new F1Shape() {
			@Override
			public void paint(String color) {
				System.out.println("f11shape(anonymous class) --> paint(" + color + ")");
			}
		};
		f11Shape.paint("red");
		System.out.println("\n==============\n");
		
		//C2: Tạo implementation class, implements từ interface sau đó new class thực thi
		//+ toàn bộ phần override nằm bên imp class -> nơi gọi ngắn ngọn
		//- phải tạo class mới
		F1Shape f12Shape = new F12Shape();
		f12Shape.paint("Blue");
		System.out.println("\n==============\n");
		
		//C3: sử dụng biểu thức lambda(chỉ áp dụng cho functional interface)
		//lambda = anonymous function
		F1Shape f13Shape = (String color) -> {
			System.out.println("f13shape(anonymous function) --> paint(" + color + ")");
		};
		f13Shape.paint("orange");
		
		// Vì sao lambda chỉ có thể khởi tạo đối tượng cho functional interface ?
		
		// --> VÌ cấu trúc của lambda là (tham số) -> {body}
		//     Một lambda chỉ overide được duy nhất 1 hàm trừu tượng bên trong functional interface
	    //     Nếu functional interface có nhiều hơn 1 hàm trừu tượng --> lambda ko thể override
		//     các hàm trừu tượng đó
				
		// Mà ko thể khởi tạo đối tượng cho một interface bất kỳ(có thể có nhiều hơn 1 hàm trừu tượng)
			
		// Lambda là gì ?
		// Lambda(anonymous function) là cách viết ngắn gọn để khởi tạo một đối tượng
		// cho Functional Interface
		// Cấu trúc của lambda (params) -> {body}
		// (params): tham số của hàm trừu tượng trong functional interface
		// ->
		// {body} --> đoạn code override cho hàm trừu tượng của functional interface
	
	}
}
