package datastructure.object.custom;

public class Ex03ObjectDemo_PassViaMethod {
	
	public static void main(String[] args) {
		Item itA = new Item(1, 'A', 111);
		Item itB = new Item(2, 'B', 222);
		
		modify(itA, itB);
		
		System.out.println("itA --> " + itA);
		System.out.println("itB --> " + itB);
		
		int a = 5;
		change(a);
		System.out.println("a --> " + a);
		
		change(itA);
		System.out.println("itA --> " + itA);
	}
	
	private static void change(int input) {
		input = 999;
	}
	
	private static void change(Item item) {
		item.id = 88;
	}
	
	// Item item  itA;
	private static void modify(Item first, Item second) {
		first.id = 999;
		first = second;
		second.name = 'Z';
		first.id = 9;
		first = new Item();
		first.salesPrice = 777;
	}
}
