package encapsulation.package_b;

import encapsulation.package_a.TestA1;

public class TestB2A1 extends TestA1 {
	public static void main(String[] args) {
		
		System.out.println("hello parentvar --> " + TestA1.varTestA1Protected );
//		Thừa kế --> trong TestB2A1 đã thừa kế có thể 
//		Gọi, dùng protected attribute/method từ class cha TestA1
				
		System.out.println(TestB2A1.varTestA1Protected);
	}
}
