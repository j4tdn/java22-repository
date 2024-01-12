package encapsulation.package_a;

public class TestA2 {
	public static void main(String[] args) {
		// sử dụng các class trong cùng package , ko cần phải import
		
		// khác package --> phải import
		
		TestA1.methodTestA1();
		TestA1.methodTestA1Noclare();
		TestA1.methodTestA1Protected();
	}

}
