package encapsulation.packege_b;

import encapsulation.packege_a.TestA1;

//Class TestB2A1 khác package với TestA1 nhưng là class con của TestA1
//   --> sử dụng/thừa kế các thuộc tính/phương thức protected từ TestA1

public class TestB2A1 extends TestA1 {
	public static void main(String[] args) {
		//sử dụng
		System.out.println("--> " + varTestA1Protected);
		
		//thừa kế--> trong TestB2A1 đã thừa kế có thể 
		//gọi, dùng protected attribute/method từ class cha TestA1
		System.out.println(TestB2A1.varTestA1Protected);
	}

}