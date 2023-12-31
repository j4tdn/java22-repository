package datastructure.object;

public class Ex02ObjectDemoUpdateValue {
	
	public static void main(String[] args) {
		//Toán tử "=" là toán tử gán
		//Gán giá trị ở STACK
		
		Item  itA = new Item(1, 'A', 111);
		Item  itB = new Item(2, 'B', 222);
		Item  itC = new Item(3, 'C', 333);
		
		
		itB.salePrice = 444;
		itC.id = 6;
		itA = itB;
		itA.salePrice = 777;
		
		System.out.println("itA --> " + itA); // 2, B, 777
		System.out.println("itB --> " + itB); // 2, B, 444
		System.out.println("itC --> " + itC); // 6, C, 333
		
	}

}
