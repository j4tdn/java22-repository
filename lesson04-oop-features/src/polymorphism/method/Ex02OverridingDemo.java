package polymorphism.method;

//Tất cả mọi class trong Java mặc định đều kế thừa từ class Object
public class Ex02OverridingDemo {

	public static void main(String[] args) {
		
		//Khi in ra 1 bien KDL doi tuong
		// Mac dinh lay bien do goi ham toString cua class do hoac class Object
		
		//before override --> polymorphism.method
		
		Ex02OverridingDemo o2 = new Ex02OverridingDemo();
		System.out.println("toString ---> " + o2.toString());
		
		System.out.println("\n=================\n");
		
		PolyMethodChild pc = new PolyMethodChild();
		
		pc.log();
		
		//1. Có thể override thuộc tính(static/non-static) được ko
		
		//2. Có thể override hàm static được ko
		
		// ->> cho ví dụ 
	}
	
	//@Override
	public String stringTo() {
		return "-- Custom ToString from Ex02 --";
	}
	
	@Override
	public String toString() {
		return "-- Custom ToString from Ex02 --";
	}
}
