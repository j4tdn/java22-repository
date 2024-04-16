package view.function_interface;

public class Ex01Demo {
	
	public static void main(String[] args) {
		
		// anonymous class: class không có tên
		// anonymous function: function không có tên
		
		
		// Để khởi tạo 1 đối tượng cho interface
		
		// Cách 1: Sử dụng từ khóa new tạo ra anonymous class
		// +: không cần phải tạo class mới
		// -: nếu nội dung code override dài --> khó đọc, nhớp
		F1Shape f11Shape = new F1Shape() {
			
			@Override
			public void paint(String color) {
				System.out.println("f11shape(anonymous class) --> paint(" + color + ")");
			}
		};
		f11Shape.paint("red");
		
		System.out.println("\n=================\n");
		
		// Cách 2: Tạo implementation class, implements từ interface
		//       : Sau đó new lớp thực thi ra
		// +: toàn bộ phần override nằm bên impl class -> nơi gọi ngắn gọn
		// -: phải tạo thể class mới
		F1Shape f12Shape = new F12Shape();
		f12Shape.paint("blue");
		
		System.out.println("\n=================\n");
		
		// Cách 3: sử dụng biểu thức lambda(chỉ áp dụng cho functional interface)
		// lambda = anonymous function
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
