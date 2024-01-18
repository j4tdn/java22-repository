package encapsulation.package_b;

import encapsulation.package_a.TestA1;

/*
  Class này khác package với test A1: là class con của TestA1
  --> sử dụng các thuộc tính/phương thức protected từ TestA1
 */

public class TestB2A1 extends TestA1{
    public static void main(String[] args) {
		System.out.println("Hello parent var " + TestA1.varTestA1Protected);
        //thừa kế -> trong class này đã thừa kế có thể
		//gọi, dùng protected attribute/method từ class cha TestA1
		System.out.println(TestB2A1.varTestA1Protected);
    }
}
