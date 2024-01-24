package polymorphism.object;

public class Ex01PolymorphismObjectDemo {

	public static void main(String[] args) {
		// 1. Khởi tạo đối tượng cho chính KDL của nó
		Shape shape = new Shape();
		shape.paint();
		shape.calcS();
		
		Square square = new Square();
		square.paint();
		square.calcS();
		
		Rectangle rectangle = new Rectangle();
		rectangle.paint();
		rectangle.calcS();
		
		shape = square;
//		rectangle = (Rectangle)shape;
		
		System.out.println("===================");
		
		//2. Khởi tạo đối tượng KDL con cho biến KDL cha
		//Cha new Con
		
		// một biến shape lúc compile là kiểu Shape nhưng lúc runtime nó 
		//có thể là/ trỏ đến KDL Shape/rectangle/square
		
		//Một biến lúc compile là KDL X nhưng lúc runtime nó có thể là/trỏ đến
		//đối tượng chính nó hoặc các KDL con của X 
		
		//Biến của x lúc compile nó sẽ gọi các hàm của KDL cha, lúc runtime
		//sẽ gọi hàm của KDL con 
		
		Shape sh1 = new Square();
		sh1.paint();
		sh1.calcS();
		
		Shape sh2 = new Rectangle();
		sh2.paint();
		sh2.calcS();
		
		//Con new cha
		// class polymorphism 
		//runtime: ko thể ép kiểu giá trị KDL cha sang KDL con 
		
		Square sq1 = (Square) new Shape();
		sq1.paint();
		sq1.calcS();
		
		/*
		 ChinhNo bien = new ChinhNo();
		 Cha bien = new Con(); --> OK
		 ----------------------------
		 Con bien = new Cha(); ---> LỖI 
		 
		 Câu 1: Tại sao lấy Cha = Cha, Con được nhưng Con = Cha thì lại lỗi ?
		 Vì lúc compile biến thuộc KDL con có thể gọi đến hàm đã override từ KDL cha và gọi thêm các hàm mới
		 của riêng KDL con 
		 Khi gọi hàm riêng của KDL con lúc runtime sẽ ko tìm đến dc các hàm này trong đối tượng của KDL cha 
		 
		 Thay vì đợi đến khi chạy gọi hàm mới lỗi --> lúc ép kiểu nó đã báo lỗi rồi (runtime)
		 
		 Câu 2: Tại sao phải dùng đa hình trong đối tượng(tại sao phải lấy cha = con mà ko lấy
		 chính nó cha = cha, con = con) ? 
		 
		 --> Dễ dàng ép kiểu qua về giữa các biến trong phạm vi KDL cha con
		 Shape shape = new Shape()
		 Square square = new Square();
		 Rectangle rectangle = new Rectangle();
		 
		 rectangle = new Square();
		 rectangle = square;
		 */
	}
}
