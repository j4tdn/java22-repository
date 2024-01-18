package encapsulation.packkage_b;

import encapsulation.package_a.TestA1;

public class TestB2A1 extends TestA1 {
	
	public static void main(String[] args) {
		System.out.println("hello parent var --> " + TestA1.varTestA1Protected);
		
		// thừa kế ==> trong TestB2A1 đã thừa kế có thể 
		// gọi,dùng protected attribute/method từ class cha TestA1
		
		System.out.println(TestB2A1.varTestA1Protected);
		
	}
	
}
