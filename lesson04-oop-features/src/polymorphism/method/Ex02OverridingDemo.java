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
		//2.có thể override hàm static được không
		// cho ví dụ
	}
	
	@Override
	public String toString() {
		return "-- Custom ToString from Ex02 --";
	}
}