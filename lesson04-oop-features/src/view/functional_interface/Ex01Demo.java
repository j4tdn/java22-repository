package view.functional_interface;

public class Ex01Demo {

	public static void main(String[] args) {
		
		//anonymous class: class ko có tên
		//anonymous function: function ko có tên
		
		//Để khởi tạo 1 đối tượng cho interface 
		
		//Cách 1: Sử dụng new tạo ra 1 anonymous class
		// +: ko cần phải tạo class mới
		// -: nếu nội dung code ovveride dài -> khó đọc 
		//anonymous class
		F1Shape f11Shape = new F1Shape() {
			
			@Override
			public void paint(String color) {
				System.out.println("f11shape --> paint(" +color + ")");
			}
		};
		f11Shape.paint("red");
		
		System.out.println("\n=============\n");
		
		//c2: tạo implementation class, implements từ interface
		//	 sau đó new lớp thực thi đó ra
		// +: toàn bộ phần override nằm bên impl class --> nơi gọi ngắn gọn
		// -: phải tạo class mới
		
		F12Shape f12shape = new F12Shape();
		f11Shape.paint("blue");
		
		System.out.println("\n=============\n");
		
		//C3: sử dụng biểu thức lambda(chỉ áp dụng cho functional interface)
		// lambda = anonymous function
		
		F1Shape f13Shape = (String color) -> {
			System.out.println("f13shape(annonymous class) --> paint(" +color + ")");
		};
		f13Shape.paint("orange");
		
		
		
		// vì sao lambda chỉ có thể khởi tạo đối tượng cho function interface?
		// -> vì cấu trúc của lamda là (tham số) -> {body}
		// nếu functional interface có nhiều hơn 1 hàm trừu tượng --> lambda ko thể override các hàm trừu tượng đó
		//Mà ko thể khởi tạo đối tượng cho 1 interface bất kì(có thể có nhiều hơn 1 hàm trừu tượng)
		
		//Lambda là gì?
		// Lambda(annoymous function) là cách viết gọn để khởi tạo đối tượng cho functional interface
		
	}
}
