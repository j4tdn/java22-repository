package encapsulation.package_b;

import encapsulation.package_a.TestA1;

public class TestB1 {
	public static void main(String[] args) {
		//Sử dụng các class trong cùng package, ko cần phải import
		//khác package --> Phải import
		
		TestA1.methodTestA1();
		TestA1.methodTestA1NoDeclare();
		TestA1.methodTestA1Protected();
		
		//System.out.println(TestB2A1.varTestA1Protected);
	}

}
