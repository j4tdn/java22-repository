package datastructure.object.custom;

public class Ex02OjectDemo_Updatevalue {
	public static void main(String[] args) {
		
		Item itA = new Item(1, 'A', 111);
		Item itB = new Item(2, 'b', 222);
		Item itC = new Item(3, 'c', 333);
		
		itB.salesPrice = 444;
		itC.setId(6);
		itA = itB;
		itA.salesPrice = 777;
		
		System.out.println("itA--> " + itA);//2,b,777
		System.out.println("itB--> " + itB);//2,b,777
		System.out.println("itC--> " + itC);//6,c,333

	}

}
