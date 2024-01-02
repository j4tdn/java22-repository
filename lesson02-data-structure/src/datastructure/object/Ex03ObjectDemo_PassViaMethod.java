package datastructure.object;

public class Ex03ObjectDemo_PassViaMethod {
	public static void main(String[] agrs) {
		Item itA = new Item(1, 'A', 111);
		//Item itB = new Item(2, 'B', 222);
		
		modify(itA);
		
		System.out.println("itA --> " + itA);
		//System.out.println("itB --> " + itB);
		
	}
	
	// Item item = itA; 
	
	// JAVA pass by value at STACK -- Toan tu =
	private static void modify(Item item) {
		item.id = 999;
		item.name = 'Z';
		item = new Item(7, 'K', 777);
		item.salesPrice = 888;
		
	}

}
