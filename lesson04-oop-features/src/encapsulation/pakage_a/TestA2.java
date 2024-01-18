package encapsulation.pakage_a;

public class TestA2 {
	
	public static void main(String[] args) {
		
		// sử dungj các class trong cùng 1 pakage  thì khoong cần phải import
		
		// khác pakage thì phải import 
		
		TestA1.methodTestA1Public();
		TestA1.methodTestA1Protected();
		TestA1.methodTestA1NoDeclare();
	}

}
