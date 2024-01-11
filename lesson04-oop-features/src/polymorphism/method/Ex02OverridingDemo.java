package polymorphism.method;

//Tất cả class trong java mặc định đều kế thừa từ class Object
public class Ex02OverridingDemo {
	
	public static void main(String[] args) {
		
		//Khi in ra 1 biến KDL đối tượng
		// Mặc định lấy biến đó gọi hàm toString của class đó hoặc class Object
			
		Ex02OverridingDemo o2 = new Ex02OverridingDemo();
		System.out.println("toString--> "+ o2.toString());
		
		System.out.println("======================");
		
		PolyMethodChild pc = new PolyMethodChild();
		pc.log();
		
		//1. có thể override thuộc tính đc ko
		
		//2. có thể override hàm static đc ko 
		
		//--> cho ví dụ
	}
	
	
	@Override
	public String toString() {
		return "Custom ToString from Ex02 --";
	}	

}
