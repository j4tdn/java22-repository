package encapsulation.package_b;

import encapsulation.package_a.TestA1;

//class TestB2A1 khác package khác với TestA1
//                     là class con của TesA1
//--> sử dụng , thừa kế các thuộc tính / phương thức protected từ TestA1

public class TestB2A1  extends TestA1{
	public static void main(String[] args) {
		
		
		//
		System.out.println("hello parent vảr -->" + TestA1.varTestA1Protected);
		
		// thừa kế--> trong TestB2A1 đã thừa kế , có thể 
		//gọi , dùng protected attribute/method từ class cha TestA1
		
		System.out.println(TestB2A1.varTestA1Protected);
		
		
	
	}
	


}
