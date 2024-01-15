package encapsulation.package_a;

public class TestA2 {
	
	public static void main(String[] args) {
		
		// Sử dụng các class trong cùng package, không cần phải import
		
		// Khác package, phải import
		
		TestA1.methodTestA1Public();
		TestA1.methodTestA1Protected();
		TestA1.methodTestA1NoDeclare();
		
	}

}
