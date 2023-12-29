package datastructure.object.custom;

public class Ex02ObjectDemo_UpDateValue {
	public static void main(String[] args) {
		Item itA = new Item(1, 'A', 111);
		Item itB = new Item(2, 'B', 222);
		Item itC = new Item(3, 'C', 333);
		//toan tu = la toan tu gan
		//gan gia tri o stack
		itB.salesPrime=444;
		itC.id = 6;
		itA = itB;
		itA.salesPrime = 777;
		System.out.println("itA--> " + itA);
		System.out.println("itB--> " + itB);
		System.out.println("itC--> " + itC);
		
	}

}
