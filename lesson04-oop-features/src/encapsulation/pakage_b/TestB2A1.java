package encapsulation.pakage_b;

import encapsulation.pakage_a.TestA1;

//class testB2A1 khacs pakage với testa1
//                 là class con của testa1
//sử dụng/ thừa kế các thuôcj tính/ phương thức "protected"từ testa1   

public class TestB2A1 extends TestA1 {

	public static void main(String[] args) {

		//sử dụng
		System.out.println("hello parent var --> " + varTestA1Protected);
		
		System.out.println(TestB2A1.varTestA1Protected);
		//thừa kế --> trong testb2a1 đã thừa kế cso thêr gọi dùng protected attribite/method tuừ class cha testa1
	}

}
