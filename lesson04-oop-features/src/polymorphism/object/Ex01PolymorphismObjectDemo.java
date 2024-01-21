package polymorphism.object;

public class Ex01PolymorphismObjectDemo {
	public static void main(String[] args) {

		// 1. Khơi tạo 1 đoi tượng cho chính kiểu dữ liệu của nó
		// chính no new chính no

		Shape shape = new Shape();
		shape.paint();
		shape.calcS();

		Square square = new Square();
		square.paint();
		square.calcS();

		Rectangle rectangle = new Rectangle();
		rectangle.paint();
		rectangle.calcS();

		System.out.println("===============================");
		
		long a = 10;
		a = Integer.MAX_VALUE + 200;
		int b = (int)a;
		
		System.out.println("b--> " + b);

		// 2. Khởi tạo kdl con cho biến kdl cha
		// cha new con

		// một biến shape lúc compile là kiểu shape nhưng lúc runtime nó có thê là/trỏ
		// đến kdl shape/rectangle/squale

		// một biến lúc compile là kdl x nhưng lúc runtime nó có thể là/trỏ đến đối
		// tượng chính nó hoặc kdl con của x

		// biến của x lúc compile nó sẽ gọi hàm của kdl cha, lúc runtime sẽ gọi hàm của
		// kdl con

		Shape sh1 = new Square();
		sh1.paint();
		sh1.calcS();

		Shape sh2 = new Rectangle();
		sh2.paint();
		sh2.calcS();
		
		//Con new Cha
		// runtime : ko thể ép kiểu gia trị kdl cha sang kdl con
		
		Square sq1 = (Square) new Shape();
		sq1.paint();
		sq1.calcS();
		
		/*
		  ChinhNo bien = new ChinhNo();
		  Cha bien = new Con(); --> OK
		  ------------------------------
		  Con bien = new Cha(); --> LỖI
		  
		  Câu 1: Tại sao lấy Cha = Cha,Con được nhuưng Con = Cha lại lỗi ?
		  Vì lúc compile biến thuộc kdl con có thể gọi đến hàm đã override từ kdl cha và gọi
		  thêm các hàm mới của riêng kld con	  
		  
		  +Khi goi hàm riêng của kdl con lúc runtime sẽ không tìm đến được các hàm này trong đối tượng của
		  kdl cha
		  
		  +Thay vì đợi đến khi chạy gọi hàm mới lỗi --> lúc ép kiểu nó đã báo lỗi(runtime)
		  
		  Câu 2: Tại sao phải dùng đa hình trong đối tượng(tại sao phải lấy cha = con mà không lấy 
		  chính nó cha = cha, con = con) ?
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
		 
		 
	
}
		  
		  
	}



		