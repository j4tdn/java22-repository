package encapsulation.package_b;

import encapsulation.package_a.TestA1;

public class TestB1 {
	public static void main(String[] args) {
		// sử dụng các class trong cùng package , ko cần phải import		
		// khác package --> phải import
		
		// ctrl shift F
		
		TestA1.methodTestA1();
		System.out.println();
		
		
		
		//TestA1.methodTestA1Noclare();
		//TestA1.methodTestA1Protected();
	}

}
