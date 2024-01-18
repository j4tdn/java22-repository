package encapsulation_package_b;

import encapsulation_package_a.TestA1;

// Class TestB2A1 khác package với TestA1 
//            là class con của TestA1 
// --> sử dụng/ thừa kế các thuộc tính phương thức 'protected' từ TestA1 

public class TestB2A1 extends TestA1 {

	public static void main(String[] args) {
		//sử dụng 
		System.out.println("hello parent var --> " + TestA1.varTestA1Protected);

		System.out.println(TestB2A1.varTestA1Protected);
	}

}
