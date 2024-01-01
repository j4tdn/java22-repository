package datastructure.object.custom;

public class Ex01ObjectDemo {
	public static void main(String[] args) {
		char x = ' ';
		Item itA = new Item();
		itA.id = 11;
		itA.name = 'a';
		itA.salePrice = 19d;
		System.out.println(itA);

		System.out.println("\n==========================\n");

		Item itB = new Item();
		itB.id = 12;
		itB.name = 'b';
		itB.salePrice = 128d;
		System.out.println(itB);

		System.out.println("\n==========================\n");
		Item itC = new Item(12,'c',13);
	}
}
