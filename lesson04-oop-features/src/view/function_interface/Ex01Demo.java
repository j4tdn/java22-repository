package view.function_interface;

public class Ex01Demo {
	//Function interface là interface có duy nhất một hàm trừu tượng
	public static void main(String[] args) {
		
		//Để khởi tạo đối tượng cho 1 interface có
		//Cách 1: sử dụng từ khóa new tạo ra anonymous 
		
		F1Shape f11shape = new F1Shape() {
			
			@Override
			public void paint(String color) {
				System.out.println("f1Shape --> paint ("+color+")");
				
			}
		};
		f11shape.paint("red");
		System.out.println("=================");
		//cách2: tạo ra implementation class, implement từ interface
		//          sau đó thực thi
		F1Shape f12shape = new F12Shape();
		f12shape.paint("red");
		System.out.println("=================");
		//cách 3: sử dụng biểu thức lamda(chỉ áp dụng cho functional interface)
		//lamda = anonymous function
		F1Shape f13Shape = (String color) -> {
			System.out.println("f13Shape --> paint ("+color+")");
		};
		
		f13Shape.paint("blue");
		System.out.println("=================");
		
		// Vì sao lambda chỉ có thể khởi tạo cho functional interface
		// ---> vì cấu trúc của lambda là (tham số) -->{body}
		//  Một lambda chỉ override duy nhất 1 hàm trừu tượng 
		// Nếu functional interface có nhiều hơn 1 hàm trừu tươngj --> lambda
		// không thể override các hàm trừu tượng đó
		
		//lambda là gì ?
		// Lambda(anonymous function) là cách viết ngắn gọn để khởi tạo một đối tượng
		// cho Functional Interface
	}
}
