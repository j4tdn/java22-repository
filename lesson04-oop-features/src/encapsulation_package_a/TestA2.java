package encapsulation_package_a;

public class TestA2 {

	public static void main(String[] args) {
		
		//Cung package --> ko can import
		
		//Khac package --> import 
	   TestA1.methodTestA1Public();
       TestA1.methodTestA1Protected();
       TestA1.methodTestA1NoDeclare();
	}

}
