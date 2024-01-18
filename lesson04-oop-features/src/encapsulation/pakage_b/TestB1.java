package encapsulation.pakage_b;

import encapsulation.pakage_a.TestA1;

public class TestB1 {
//	public static void main(String[] args) {
//		TestA1.methodTestA1Public();
//	}
	public static void main(String[] args) {

		// sử dungj các class trong cùng 1 pakage thì khoong cần phải import
		// khác pakage thì phải import

		TestA1.methodTestA1Public();
		
		//System.out.println(varTestA1);
		
//		TestA1.methodTestA1Protected();
//		TestA1.methodTestA1NoDeclare();
		
		
	}

}
