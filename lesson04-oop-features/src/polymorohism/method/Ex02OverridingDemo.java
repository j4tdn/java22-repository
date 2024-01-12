package polymorohism.method;

// Tất cả mọi class trong java mặc định đều kế thưà từ class Object

public class Ex02OverridingDemo {
	public static void main(String[] args) {
		//before
		Ex02OverridingDemo o2 = new Ex02OverridingDemo();
		System.out.println("toString --> " + o2.toString());
		
		System.out.println("========");
		PolyMethodChild pc = new PolyMethodChild();
		pc.log();
// cos thể override thuộc tính (	static/non-static) được không
		// có thể override hàm static được không
		//--> cho ví dụ
	}

	@Override
	public String toString() {
		return "-- Custom ToString from Ex02 --";
	

}
}
