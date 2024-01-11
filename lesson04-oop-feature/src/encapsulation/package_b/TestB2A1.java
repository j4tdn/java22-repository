package encapsulation.package_b;

import encapsulation.package_a.TestA1;
// class testB2A1 khacs package voi testA1
//                     la class con cua testA1
//--> sử dụng/ thừa kế các thuôc tính/ phương thức của protected/no-declare từ TestA1
public class TestB2A1 extends TestA1{

	public static void main(String[] args) {
		// sử dụng  
		System.out.println("hello parent var---> "+ varTestA1Protected);
	
	
	// thừa kế--> trong testB2A1 đã thừa kế có thể
		// gọi, dùng trong protected attribute/method từ class cha TestA1
	
	
	}
	
}
