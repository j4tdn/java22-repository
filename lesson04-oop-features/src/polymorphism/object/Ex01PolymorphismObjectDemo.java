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
		
		System.out.println("===================");
		
		// int, long
		// int a = 5;
		// long b = a;
		// long c = 10; // cha c = con
			
		// int max 2 ty
		// long max 4 ty
			
		// long a = 10; // ok
		// a = Integer.MAX_VALUE + 2; // [-2147483648, 2147483647]
		// int b = (int)a;
				
		// System.out.println("b --> " + b);
		
		// 2. Khởi tạo đối tượng KDL con cho biến KDL cha
		// Cha new con
		
		// Một biến lúc compile là KDL X nhưng lúc runtime nó có thể  
		// là/trỏ đến đối tượng chính nó hoặc các KDL con của X
		
		// Biến của x lúc compile nó sẽ gọi các hàm của KDL cha, lúc
		// runtime sẽ gọi hàm của KDL con
		Shape sh1 = new Square();
		sh1.paint();
		sh1.calcS();
		
		Shape sh2 = new Rectangle();
		sh2.paint();
		sh2.calcS();
		
		// Con new cha
		// runtime: ko thể ép kiểu giá trị KDL cha sang KDL con
		
		Square sq1 = (Square) new Shape();
		sq1.paint();
		sq1.calcS();
		sq1.setBackground();
		
		Shape shape2 = new Shape();
		Square square2 = new Square();
		Rectangle rectangle2 = new Rectangle();
		 
		// rectangle2 = new Square();
		// rectangle2 = square;
		 
	
		 Shape shape22 = new Shape();
		 Shape square22 = new Square();
		 Shape rectangle22 = new Rectangle();
		 square22 = rectangle22;
		
		/*
		 ChinhNo bien = new ChinhNo(); --> ok
		 Cha bien = new Con(); --> ok
		 --------------------
		 Con bien = new Cha(); --> lỗi
		 
		 Câu 1: Tại sao lấy biến Cha = cha, Con được nhưng Con = Cha thì lại lôi/
		 Vì 
		 + Lúc conpile biến thuộc KDL con có thể gọi đến hàm đã override từ KDL
		   cha và gọi thêm các hàm mới của riêng KDL con
		  
		 + Khi gọi hàm riêng của KDL con lúc runtime sẽ ko tìm đến được các hàm này trong 
		 đối tượng của KDL cha
		 
		 + Thay vì đợi đến khi chạy hàm mới llõi --> lúc ép kiểu nó đã báo lối rồi(runtime)
		 
		 Câu 2: Tại sao phải dùng đa hình trong đối tượng(Tại sao phải lấy cha = con mà
		   không lấy chính nó cha = cha, con = con) ?
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
		 
		 log(sq1);
		 log(shape);
		 log(rectangle2);
	}
	// Shape input = ?
		static void log(Shape input) {
			
		}

}
