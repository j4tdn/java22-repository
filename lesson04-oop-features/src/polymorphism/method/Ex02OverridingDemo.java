package polymorphism.method;

public class Ex02OverridingDemo {
	public static void main(String[] args) {
		
		//Khi in ra 1 biến KDL đối tượng
		// Mặc định lấy biến đố gọi hàm tótring của class đó hoặc class Object
		Ex02OverridingDemo o2 = new Ex02OverridingDemo();
		System.out.println("toString --> " + o2.toString());
		
		PolyMethodChild pc = new PolyMethodChild();
		pc.log();
		
		//1. có thể override thuộc tính(static/non-static) được không
		
		//--> không thể được. Khi ghi đè phương thức chúng ghi đè bytecode của class tham chiếu (khi runtime sẽ
		// được thay thế bằng bytecode của instance). Nhưng đối với thuộc tính thì đó là ghi đè bytecode của kiểu tham chiếu
		// việc này sẽ khiến các phương thức mà class con thừa kế từ class cha bị Hỏng.
		
		//2.có thể override hàm static được không
		
		// Được.--> tạo ra một phương thức static mới trong lớp con
		
		// cho ví dụ
		/*
		 * class A { static void staticMethod() {
		 * System.out.println("A's static method"); } }
		 * 
		 * class B extends A { static void staticMethod() {
		 * System.out.println("B's static method"); } }
		 * 
		 * public class Main { public static void main(String[] args) {
		 * A.staticMethod(); // In ra: A's static method B.staticMethod(); // In ra: B's
		 * static method } }
		 */
	}
	
	@Override
	public String toString() {
		return "-- Custom ToString from Ex02 --";
	}
}
