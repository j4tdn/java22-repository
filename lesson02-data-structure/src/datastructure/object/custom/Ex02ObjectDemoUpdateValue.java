package datastructure.object.custom;

import java.security.Identity;

public class Ex02ObjectDemoUpdateValue {
	public static void main(String[] args) {

		// toán tử bằng gán giá trị ở stack
		Item itA = new Item(1, 'a', 111);
		Item itB = new Item(2, 'b', 222);
		Item itC = new Item(3, 'c', 333);
		System.out.println(itA.hashCode());
		System.out.println(itB.hashCode());
		System.out.println(itC.hashCode());
		itB.salePrice = 444;
		itC.id = 444;
		itA = itB;
		itA.salePrice = 777;

		System.out.println(itA);
		System.out.println(itB);
		System.out.println(itC);
		System.out.println(itA.hashCode());
		System.out.println(itB.hashCode());
		System.out.println(itC.hashCode());
	}
}
