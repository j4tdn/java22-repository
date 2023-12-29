package datastructure.object.custom;

public class Ex02ObjectDemo_UpdateValue {
	
	public static void main(String[] args) {
		int a = 5;
		int b = a;
		
		Item item = new Item();
		
		
		Item itA = new Item(1, 'A', 111);
		Item itB = new Item(1, 'B', 222);
		Item itC = new Item(1, 'C', 333);
		
		System.out.println("itA address --> " + itA.hashCode());
		System.out.println("itB address --> " + itB.hashCode());
		System.out.println("itC address --> " + itC.hashCode());
		
		itB.salesPrice = 444;
		itC.id = 6;
		itA = itB;
		itA.salesPrice = 777;
		
		System.out.println("itA address after --> " + itA.hashCode());
		System.out.println("itB address after --> " + itB.hashCode());
		System.out.println("itC address after --> " + itC.hashCode());
		
		System.out.println("itA --> " + itA);
		System.out.println("itB --> " + itB);
		System.out.println("itC --> " + itC);
	}
}
