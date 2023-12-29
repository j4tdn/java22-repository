package datastructure.object.custom;

public class Ex01ObjectDemo {
	public static void main(String[] args) {
		// bien x dang tro den o nho co gia tri la '^' o stack
		char x = '^';
		int a = 5;
		Item itA = new Item();
		itA.id = 11;
		itA.name = 'A';
		itA.salesPrime = 78d;
		System.out.println("a --> " + a);
		System.out.println("itA --> " + itA);
		//System.out.println("itA toString--> " + itA.toString());
		
		Item itB = new Item();// khoi tao o nho
		itB.id = 22;
		itB.name = 'B';
		itB.salesPrime = 45;
		System.out.println("itB -- > " + itB);
		
		Item itC = new Item(33, 'C', 67);
		System.out.println("itC --> " + itC);
	}

}
