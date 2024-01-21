package polymorphism.object;

public class Ex01PolymorphismObjectDemo {
	
	public static void main(String[] args) {
		// 1. Khởi tạo đối tượng cho chính KDL của nó
		// ChinhNo new ChinhNo
		Shape shape = new Shape();
		shape.paint();
		shape.calcS();
		
		Square square = new Square();
		square.paint();
		square.calcS();
		
		Rectangle rectangle = new Rectangle();
		rectangle.paint();
		rectangle.calcS();
		
		System.out.println("==================");
		
		// long a = 10; 
		// a = Integer.MIN_VALUE;
		// int b = (int)a;
		
		// System.out.println("b --> " + b);
		// 2. Khởi tạo đối tượng KDL con cho KDL cha
		// Cha new Con
		
		// Một biến shape lúc compile là kiểu Shape nhưng lúc runtime nó
		// có thể là/ trỏ đến KDL Shape/Rectangle/Square
		
		// Một biến lúc compile là KDL X nhưng lúc runtime nó có thể là/trỏ đến
		// đối tượng chính nó hoặc các KDL con của X
		
		// Biến của x lúc compile nó sẽ gọi các hàm của KDL cha, lúc runtime
		// sẽ gọi hàm của KDL con
		Shape sh1 = new Square();
		sh1.paint();
		sh1.calcS();
		
		Shape sh2 = new Rectangle();
		sh2.paint();
		sh2.calcS();
		
		// Con new Cha
		// runtime: ko thể ép kiểu giá trị KDL cha sang KDL con
		
		
		Square sq1 = (Square) new Shape();
		sq1.paint();
		sq1.calcS();
		sq1.setBackground();
		
		/*
		 ChinhNo bien = new ChinhNo();
		 Cha bien = new Con(); --> OK
		 -----------------------------
		 Con bien = new Cha(); --> LỖI
		 
		 CÂU 1: Tại sao lấy biến Cha = Cha, con được nhưng lấy con = cha lại lỗi
		 --> 
		 + Vì lúc compile biến thuộc KDL con có thể gọi đến hàm đã override từ KDL cha và 
		 gọi thêm các hàm mới của riêng KDL con
		 + Khi gọi hàm riêng của KDL con lúc runtime sẽ ko tìm đến được các hàm này trong đối tượng
		 của KDL cha
		 
		 Thay vì đợi đến khi chạy gọi hàm mới lỗi --> lúc ép kiểu nó đã báo lỗi rồi (runtime ERROR)
		 
		 CÂU 2: Tại sao phải dùng đa hình trong đối tượng(tại sao phải lấy cha = con mà ko lấy chính nó
		 cha = cha, con = con) ?
		 
		 --> Dễ dàng ép KDL qua veef giữa các biến trong phạm vi KDL cha con
		 --> hỗ trợ tạo danh sách(mảng) các phần tử trong phạm vi cha con
		 --> hỗ trợ tạo hàm có KDL cha(chung)
		 		Có thể truyền tham số KDL cha, con
		 */
	}

}
