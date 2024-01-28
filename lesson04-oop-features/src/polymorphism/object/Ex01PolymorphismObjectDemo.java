package polymorphism.object;

public class Ex01PolymorphismObjectDemo {
	
	public static void main(String[] args) {
		// 1. Khởi tạo đối tượng chi chính KDL của nó
		
		Shape shape = new Shape();
		shape.paint();
		shape.calcS();
		
		Square square = new Square();
		square.paint();
		square.calcS();
		
		Rectangle rectangle = new Rectangle();
		rectangle.paint();
		rectangle.calcS();
		
		System.out.println("=========================");
		
		// 2.Khởi tạo đối tượng KDL con cho biến cha
		// Cha new con
		
		// Một biến shape lúc compile là kiểu Shape nhưng lúc runtime nó
		// có thể là/ trỏ đến KDL Shape/Rectangle/Square
		
		// Một biến lúc compile là KDL X nhưng lúc runtime nó có thể là/ troe đến
		// đối tượng chính nó hoặc các KDL con của X
		
		// Biến của x lúc compile nó sẽ gọi các hàm của KDL cha, lúc runtime
		// sẽ gọi hàm của KDL con
		
		Shape sh1 = new Square();
		sh1.paint();
		sh1.calcS();
		
		Shape sh2 = new Rectangle();
		sh2.paint();
		sh2.calcS();
		
		// Con new cha
		// runtime: k thể ép kiểu giá trị KDL cha sang KDL con
		Square sq1 = (Square) new Shape();
		sq1.paint();
		sq1.calcS();
		
		/*
		 ChinhNo bien - new ChinhNo(); --> OK
		 Cha bien = new Con(); --> OK
		 --------------------------------------
		 Con bien = new Cha(); --> Lỗi
		 
		 Câu 1: Tại sao lấy biến Cha = Cha, con được nhưng Con = Cha thì lại lỗi?
		 + Vì lúc compile biến thuộc KDL con có thể gọi đén hàm đã override từ KDL cha và
		 gọi thêm các hàm mới của riêng KDL con
		 
		 + Khi gọi hàm riêng của KDL con lúc runtime sẽ k tìm đến được các hàm này trong đối
		 tượng KDL cha
		 
		 + Thay vì đợi đến khi chạy gọi hàm mới lỗi --> lúc ép kiểu nó đã báo lỗi rồi (runtime)
		 
		 Câu 2:Tại sao phải dùng đa hình trong đối tượng (tại sao phải lấy cha = con mà không lấy
		 chính nó cha = cha, con = con)?
		 
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
	}
	
}
