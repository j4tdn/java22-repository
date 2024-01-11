package encapsulation.package_b;

import encapsulation.package_a.TestA1;

public class TestB2A1 extends TestA1{
	public static void main(String[] args) {
		
		//sử dụng
		System.out.println("hello : "+ TestA1.varTestA1Protected);
		
		//thừa kế --> cps thể gọi, dùng protected atribute/method từ lớp cha TestA1
	}
}
