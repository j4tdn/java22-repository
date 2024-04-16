package polymorphism.method;

// Tất cả mọi class trong Java mặc định đều kế thừa từ class Object
public class Ex02OverridingDemo {
	
	public static void main(String[] args) {
		
		// Khi in ra 1 biến KDL đối tượng
		// Mặc định lấy biến đó gọi hàm toString của class đó hoặc class Object
		
		// before override --> polymorphism.method.Ex02OverridingDemo@515f550a
		// gọi toString của class cha Object
		
		// after override --> -- Custom ToString from Ex02 --
		
		Ex02OverridingDemo o2 = new Ex02OverridingDemo();
		System.out.println("toString --> " + o2.toString());
		
		System.out.println("\n==================\n");
		
		PolyMethodChild pc = new PolyMethodChild();
		pc.log();
		
		// 1. Có thể overide hàm static được ko
		
		// 2. Có thể override thuộc tính(static/non-static) được ko
		
		// --> cho ví dụ
		
	}
	
	// Shape: calS
	// Rectangle, Triangle, Square extends Shape
	// --> override calS
	
	// Shape: calS
	// Rectangle, Triangle, Square extends Shape
	
	// Rectangle --> tinhDienTichHinhChuNhat
	// Triangle --> calSTriangle
	// Square --> tinhS
	
	// @Override
	public String stringTo() {
		return "-- Custom ToString from Ex02 --";
	}
	
	@Override
	public String toString() {
		return "-- Custom ToString from Ex02 --";
	}
	
	
	
}
