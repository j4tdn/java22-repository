package polymorphism.method;
// tất cả mọi calss trong java mặc định kế thừa từ class Object
public class Ex02OverridingDemo {

	
	public static void main(String[] args) {
		 
		
	// khi in ra 1 biến KDL đối tượng
		// mặc định lấy biến đó gọi hàm tooString của class đó hoặc class Object
		//before override--> polymorphism.method.Ex02OverridingDemo
		
		//after override --> -- Custom ToString from Ex02--
		Ex02OverridingDemo o2 = new Ex02OverridingDemo();
		System.out.println("toString-->"+ o2.toString());
		
		
		System.out.println("=====================");
		PolyMethodChild pc = new PolyMethodChild();
		pc.log();
	}
	// Shape: calS
	//Rectangle, Triangle, Square extends Shape
	//--> override calS
	@Override
	public String toString() {
		
		return "-- Custom ToString from Ex02--";
	}
}
