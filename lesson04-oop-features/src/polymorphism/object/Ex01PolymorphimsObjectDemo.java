package polymorphism.object;

public class Ex01PolymorphimsObjectDemo {
	
	public static void main(String[] args) {
		//1. khởi tạo 1 đối tượng cho chính kiểu dữ liệu của nó
		Shape shape = new Shape();
		shape.paint();
		shape.calcS();

		Square square = new Square();
		square.paint();
		square.calcS();
		
		Rectangle rectangle = new Rectangle();
		rectangle.paint();
		rectangle.calcS();
		
		System.out.println("=================================");
		
		//2. khởi tạo 1 đối tượng KDL con cho biến KDL cha
		//cha new con
		Shape sh1 = new Square();
		sh1.paint();
		sh1.calcS();

		Shape sh2 = new Rectangle();
		sh2.paint();
		sh2.calcS();
		// ==> 1 biến Shape lúc compile  là kiểu DL Shape 
		//		nhưng lúc runtime nó có thể trỏ đến chính nó
		//		hoạc lớp con của Shape
		
		//con new cha ==> lối: không thể ép kiểu giá trị KDL cha sang KDL con
		Square sq1 = (Square) new Shape();
		sq1.paint();
		sq1.calcS();
		
		/*
		 ChinhNo biến = new ChinhNo();	--> OK
		 Cha biến = new Con();			--> OK
		 (tương tự gán "=")
		 -------------------------------------
		 Con biến = new Cha(); 			--> No OK
		  (tương tự gán "=")
		  
		 Câu 1: Why "cha = cha, con " được  but "con = cha " lỗi 
		 	Because: 
		 		+ lúc compile biến thuộc KDL con có thể gọi đến hàm Override từ KDL cha và gọi thêm 
		 		các hàm mới của riêng con
		 		+ thay vì đợi đến khi chạy gọi hàm mới lỗi --> lúc ép kiểu nó đã báo lỗi(runtime)
		 Câu 2: Why phải dùng đa hình trong đối tượng(Why lấy cha = con mà không lấy chính nó gọi chính nó)?
		 	-> Dễ dàng ép kiểu qua về giữa các biến trong phạm vi KDL cha con
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
		 
		 log(sq1);
		 log(shape);
		 log(rectangle);
	}
	
	// Shape input = ?
	static void log(Shape input) {
		
	}
	
}