package datastructure.object.custom;

public class Ex02ObjectDome_UpdateValue {
	
	public static void main(String[] args) {
		
		//toán tử =  là gán giá trị ở Stack
		
		Item itA = new Item(1, 'A', 111);	//H1
		Item itB = new Item(2, 'B', 222);	//H2
		Item itC = new Item(3, 'C', 333);	//H3
		
		System.out.println("itA address --> "+itA.hashCode());
		System.out.println("itB address --> "+itB.hashCode());
		System.out.println("itC address --> "+itC.hashCode());
		
		itB.salesPrice = 444;
		itC.id= 6;
		itA = itB;
		itA.salesPrice = 777;
		
		System.out.println("itA address after--> "+itA.hashCode());
		System.out.println("itB address after--> "+itB.hashCode());
		System.out.println("itC address after--> "+itC.hashCode());
		System.out.println("itA--> "+itA); //2,B,777
		System.out.println("itB--> "+itB); //2,B,777
		System.out.println("itC--> "+itC); //6,C,333
	}
}
