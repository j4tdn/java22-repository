package encapsulation.package_a;

public class TestA2 {
	public static void main(String[] args) {
		
		// Su dung cac class trong cung package, ko can phai import
		
		// khac package --> phai import 
		TestA1.methodTestA1Public();
		TestA1.methodTestA1Protected();
		TestA1.methodTestA1NoDeclare();
	}

}
