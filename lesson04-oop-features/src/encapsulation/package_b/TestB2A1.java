package encapsulation.package_b;

import encapsulation.package_a.TestA1;


// class testb1A2 khác package với testA1 
// là class con của testa1  --> thừa kế sử dụng các phương thức protetcd
public class TestB2A1 extends TestA1{
	public static void main(String[] args) {
		TestA1.methodTestA1protected();
		TestA1.methodTestA1();
	}
}
