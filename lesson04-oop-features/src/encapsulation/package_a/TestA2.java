package encapsulation.package_a;

public class TestA2 {
	public static void main(String[] args) {
		
		//sử dụng các class trong cùng một package, không cần phải import
		
		TestA1.methodTestA1();
		TestA1.methodTestA1Protected();
		TestA1.methodTestA1NoDeclare();
	}
	
}
