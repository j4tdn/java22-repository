package datastructure.object.custom;

public class Ex01ObjectDemo {
	
	public static void main(String[] args) {
		
		char X = '^';
		int a = 5;
		
		System.out.println("a --> " + a);
		
		Item itA = new Item(); //H1
		itA.id = 11;
		itA.name = 'A';
		itA.salesPrice = 78d;
		
		System.out.println("itA --> " + itA);
		//System.out.println("itA toString --> " + itA.toString());
		
		Item itB = new Item(); //H2
		itB.id = 22;
		itB.name = 'B';
		itB.salesPrice = 45;
		System.out.println("itB --> " + itB);
		
		Item itC = new Item(33, 'C', 67); //H3
		System.out.println("itC --> " + itC);
	}
	
	public String toString() {
		return getClass().getName() + "@" + Integer.toString(hashCode());
	}

}
