package encapsulation.package_a;

public class TestA2 {
	public static void main(String[] args) {
		//Sử dụng các class trong cùng package, ko cần phải import
		//khác package --> Phải import
		TestA1.methodTestA1();
		TestA1.methodTestA1NoDeclare();
		TestA1.methodTestA1Protected();
	}

}
