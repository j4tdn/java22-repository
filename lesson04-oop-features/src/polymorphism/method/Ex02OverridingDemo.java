package polymorphism.method;

//Tất cả mọi classtrong Java mặc định đều kế thừa từ class Object
public class Ex02OverridingDemo {
	public static void main(String[] args) {
		//khi in ra 1 biếnKDL đối tượng
		// mặc định lấy biến đố gọi hàm toString của class đó hoặc class Object
		
		// before override --> polymorphism.method.Ex02OverridingDemo@515f550a
		// gọi toString của class cha Object
				
		// after override --> -- Custom ToString from Ex02 --
		
		Ex02OverridingDemo o2 = new Ex02OverridingDemo();
		System.out.println("toString --> " +o2.toString());
		System.out.println("\n====================\n");
		PolyMethodChild pc = new PolyMethodChild();
		pc.log();
		
		//1. Có thể override hàm static được ko
		//2. Có thể override thuộc tính(static/non-static) được ko
		//--> cho VD
	}
	
	@Override
	public String toString() {
		return "-- Custom ToString from Ex02 --";
	}

}
