package polymorphism.object;

public class Ex01PolymorphismObjectDemo {
	public static void main(String[] args) {
		//1. Khoi tao doi tuong cho chinh KDL cua no
		
		Shape shape = new Shape();
		shape.paint();
		shape.calcS();
		
		Square square = new Square();
		square.paint();
		square.calcS();
		
		Rectangle rectangle = new Rectangle();
		rectangle.paint();
		rectangle.calcS();
		
		System.out.println("\n===================\n");
		
		//2.khoi tao doi tuong KDL con cho bien KDL cha
		//Cha new con
		
		// Một biến X lúc compile là kiểu dữ liệu X
		// nhưng lúc runtime có thể là/trỏ đến đối tượng chính nó hoặc KDL con
		Shape sh1 = new Square();
		sh1.paint();
		sh1.calcS();
		
		Shape sh2 = new Rectangle();
		sh2.paint();
		sh2.calcS();
		
		//Con new cha 
		//class polymorphism.object.Shape cannot be cast to class polymorphism.object.Square 
		//runtime: khong the ep KDL cha sang KDL con
		Square sq1 = (Square) new Shape();
		sq1.paint();
		sq1.calcS();
		
		//Câu 1: Tại sao lấy biến Cha = Cha, con được nhưng Con = Cha lại lỗi
		//	Vì lúc compile biến thuộc KDL con có thể gọi đến hàm đã Override từ KDL cha
		//và gọi thêm các hàm mới của riêng KDL con
		
			//+Khi gọi hàm riêng của KDL con lúc runtime sẽ ko tìm đến được các hàm này trong Cha
			//+Thay vù đợi đến khi chạy gọi hàm mới lỗi --> lúc ép kiểu 
		
		//Câu 2: Tại sao phải dunhf đa hình trong đối tượng?
			//-> dễ dang ép kiểu qua về giữa các biến trong phạm vi KDL cha con
			//-> hỗ trợ tạo danh sách (mảng) các phần tử trong phạm vi cha con
			//-> hỗ trợ tạo hàm có KDL cha (chung)
				// có thể truyền tham số KDL cha,con
		
		
		/*
		 * Set (tập hợp các phần tử không trùng nhau)
		 * hashset(cho phép lưu trữ)
		 * treeset(cho phép lưu trữ và tựu động xếp tăng dần)
		 * 
		 *  log(shape);
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
