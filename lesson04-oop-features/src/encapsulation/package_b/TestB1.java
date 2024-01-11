package encapsulation.package_b;

import encapsulation.package_a.TestA1;

public class TestB1 {

	public static void main(String[] args) {

		// Sử dụng các class trong cùng 1 package, ko cần phải import

		// Khác package --> phải import

		TestA1.methodTestA1Public();
		
		System.out.println();
//		TestA1.methodTestA1Protected();
//		TestA1.methodTestA1NoDeclare();

	}
}
