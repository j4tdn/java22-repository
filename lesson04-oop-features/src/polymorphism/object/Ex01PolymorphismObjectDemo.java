package polymorphism.object;

public class Ex01PolymorphismObjectDemo {
	
	public static void main(String[] args) {
		
		//1. Khởi tạo đối tượng cho chính kdl của nó
		Shape shape = new Shape();
		shape.paint();
		shape.calcS();
		
		Square square = new Square();
		square.paint();
		shape.calcS();
		
		Rectangle rectangle = new Rectangle();
		rectangle.paint();
		rectangle.calcS();
		
		shape = square;
	
		System.out.println("====================");
		
		//2. Khởi tạo đối tượng kdl con cho biến kdl cha
		
		//1 biến Shape lúc compile là kiểu Shape nhưng lúc Runtime 
		//nó có thể là kdl Shape/Rectangle/Square
		
		// 1 biến lúc compile có thể là kdl X nhưng lúc runtime nó có thể là/trỏ đến
		// đối tượng của chính nó hoặc các kdl con của X
		
		// Biến của x lúc compile nó sẽ gọi các hàm của kdl cha, lúc runtime
		// sẽ gọi hàm của kdl con
		Shape sh1 = new Square();
		sh1.paint();
		sh1.calcS();
		
		Shape sh2 = new Rectangle();
		sh2.paint();
		sh2.calcS();
		
		// Con new cha
		//runtime: ko thể ép kiểu giá trị kdl cha sang gia trị kdl con
		Square sq1 =  (Square) new Shape();
		sq1.paint();
		sq1.calcS();
		sq1.setBackground();
		
		/*
		 ChinhNo bien = new ChinhNo();
		 Cha bien = new Con(); --> OK
		 ------------------------------
		 Con bien = new Cha(); --> Lỗi
		 
		 Câu 1 : Tại sao lấy Cha = Cha, Con được nhưng lấy Con = Cha thì lại lỗi?
		 Vì
		 + lúc compile biến thuộc kdl con có thể gọi đến hàm đã Override từ kdl cha và gọi thêm các hàm
		 mới của riêng kdl con
		 
		 + Khi gọi hàm riêng của kdl con lúc runtime sẽ ko tìm đến đc các hàm này trong đối tượng của kdl cha
		 
		 + Thay vì đợi đến khi chạy gọi hàm mới lỗi --> lúc ép kiểu nó đã báo lỗi rồi (runtime)
		 
		 Câu 2 : Tại sao phải dùng đa hình trong đối tượng(tại sao phải lấy cha = con mà ko lấy chính nó cha = cha, con = con)
		  --> Dễ dàng ép kiểu qua về giữa các biến trong phạm vi KDL cha con
		 Shape shape = new Shape()
		 Square square = new Square();
		 Rectangle rectangle = new Rectangle();
		 
		 rectangle = new Square();
		 rectangle = square;
		 
		 ----------------------------
		 Shape shape = new Shape()
		 Shape square = new Square();
		 Shape rectangle = new Rectangle();
		 square = rectangle;
		 
		 Set(tập hợp các phần tử ko trùng nhau)
		 HashSet(cho phép lưu trữ)
		 TreeSet(cho phép lưu trữ và tự động sắp xếp tăng dần)
		 
		 Set set1 = new HashSet();
		 set1 = new TreeSet();
		 
		 
		 --> Hỗ trợ tạo danh sách(mảng) các phần tử trong phạm vi cha con
		 --> Hỗ trợ tạo hàm có KDL cha(chung)
		 	 --> Có thể truyền tham số KDL cha, con 
		         
		         log(shape);
		         log(rectangle);
		         log(square);
		         
		         // Shape shape = shape;
		         // Shape shape = rectangle;
		         // Shape shape = square;
		         void log(Shape shape) {
		            sout(shape);
		         }
		      --> Hỗ trợ factory pattern
		 
		 Thực tế
		 Cha, Con
		 
		 --> Cha cha = [new] Con(); --> để vận dụng các điểm mạnh của đa hình trong đối tượng
		 --> Con con = [new] Con(); --> dùng hàm riêng của thằng còn lúc compile
		 
		 */
		
		Shape[] shapes = {shape, sq1, square, rectangle};
		
		log(sh1);
		log(sq1);
		log(shape);
		
	}
	
	static void log(Shape input) {
		
	}

}
