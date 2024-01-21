package polymorphism.method;

public class Ex02OverridingDemo {
	
	public static void main(String[] args) {
		
		// Khi in ra 1 biến KDL đối tượng
		// Mặc định lấy biến đó gọi hàm toString của class đó hoặc class Object
		
		// before Override --> polymorphism.method.Ex02OverridingDemo@75a1cd57
		// gọi toString của class cha Object
		
		Ex02OverridingDemo o2 = new Ex02OverridingDemo();
		System.out.println("toString --> " + o2.toString());
		
		PolyMethodChild pc = new PolyMethodChild();
		pc.log();
		
		// 1. Có thể override thuộc tính được không
		// 2. Có thể override hàm static được không. cho ví dụ
	}
	
	@Override
	public String toString() {
		return "-- Custom ToString form Ex02--";
	}

}
