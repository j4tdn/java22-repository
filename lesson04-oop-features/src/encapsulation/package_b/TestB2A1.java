package encapsulation.package_b;

import encapsulation.package_a.TestA1;


// class TestB2A1 khác package với TestA1
// 				  là class con của TestA1
// --> sử dụng/ thừa kế  các thuộc tín/ Phương thức protected từ TestA1
public class TestB2A1 extends TestA1{
	
	public static void main(String[] args) {
		
		// sử dụng
		System.out.println("Hello parent vả --> "+ varTestA1Protected);
		
		// thừa kế --> trong TestB2A1 đã thừa kế có thể 
		//gọi , dùng protected attribute/method từ class cha TestA1
		
		System.out.println(TestB2A1.varTestA1Protected);
	}
	
}
