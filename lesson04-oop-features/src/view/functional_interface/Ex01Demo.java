package view.functional_interface;

public class Ex01Demo {
	public static void main(String[] args) {
		// để khởi tạo 1 đối tượng interface
		// cách 1:sử dụng từ khóa new
			// +: không cần phải khởi tạo class mới
			// -: code dài ở đoạn override
		F1Shape f11shape = new F1Shape() {
			
			@Override
			public void paint(String color) {
				System.out.println("f11shape --> paint(" +color+")");
			}
		};// anonymous class : class không tên 
		f11shape.paint("red");
		System.out.println("=========================");
		
		// cách 2: Tạo implementation class, implements từ interface
			// +: tạo code ngắn gọn sạch sẽ
			// -: phải tạo thêm class mới
		F1Shape f12shape = new F12shape();
		f12shape.paint("blue");
		
		// cách 3: sử dụng biểu thức lamda (chỉ áp dựng cho functional interface)
		// lambda = anonymous function: là 1 cách viết ngắn gọn để tạo đối tượng cho funtional_interface 
		F1Shape f13shape = (String color)->{
			System.out.println("f13shape(anonymous function) --> paint(" +color+")");
		};
		f13shape.paint("orange");
		
		// vì sao lamda chỉ khởi tạo cho functional_interface chứ không phải cho 1 interface khác
		//--> vì 1 lampa là (tham số: params) ->{body}
		
		// 1 lamda chir override 1 hamf duy nhat  1 ham truu tuong ben trong functional interface
		
				
	}
	
	
}
