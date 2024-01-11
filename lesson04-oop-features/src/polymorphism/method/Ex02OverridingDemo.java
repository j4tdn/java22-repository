package polymorphism.method;

// Tất cả mọi class trong Java mặc định đều kế thừa từ class Object
public class Ex02OverridingDemo {
	
	public static void main(String[] args) {
		
		// khi in ra 1 biến KDL đối tượng 
		// Mặc định lấy biến đó gọi hàm toString của class đó hoặc class Object
		
		
		// before override --> toString --> polymorphism.method.Ex02OverridingDemo@15f550a
		// gọi toString của class cha Object
		
		// after override --> -- Custom ToString from Ex02 --

		Ex02OverridingDemo o2 = new Ex02OverridingDemo();
		System.out.println("toString --> " + o2.toString());
	
		System.out.println("\n===============\n");
		
		PolyMethodChild pc = new PolyMethodChild();
		pc.log();
		
		
		// 1. có thể override hàm static được không 
		
		// 2. Có thể override thuộc tính(static/non-static) được không
		
		// --> cho ví dụ
	}
	
	@Override
	public String toString() {
		return "-- Custom ToString from Ex02 --";
	}
	
}
