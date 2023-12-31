package datastructure.Object.Custom;

public class Ex02ObjectDemo_UpdateValue {
	
	public static void main(String[] args) {
		int a = 5;
		int b = a;
		// cập nhật giá trị a = ?
		
		Item item = new Item();
		// cập nhật giá trị item = .. item1
		//                  item = new Item()
		// --> cập nhật địa chỉ của biến a ở STACK
		
		// cập nhật giá trị a.x = ?
		//                  a.y = ?
		// --> cập nhật giá trị của các thuộc tính ở ô nhớ mà biến a đang trỏ đến ở HEAP
		
		
		// Toán tử = là toán tử gán
		// Gán giá trị ở STACK
		
		Item itA = new Item(1, 'A', 111); // H1 1 A 111
		Item itB = new Item(2, 'B', 222); // H2 2 B 777
		Item itC = new Item(3, 'C', 333); // H3 6 C 333
		
		System.out.println("itA address --> " + itA.hashCode());
		System.out.println("itB address --> " + itB.hashCode());
		System.out.println("itC address --> " + itC.hashCode());
		
		// itA --> H2
		// itB --> H2
		// itC --> H3
		
		itB.salesPrice = 444;
		itC.id = 6;
		itA = itB;
		itA.salesPrice = 777;
		
		System.out.println("itA address after --> " + itA.hashCode());
		System.out.println("itB address after --> " + itB.hashCode());
		System.out.println("itC address after --> " + itC.hashCode());
		
		
		System.out.println("itA --> " + itA); // 1, A, 111 --- 2, B, 777 - 1, A, 777 - 2, B, 444
		System.out.println("itB --> " + itB); // 2, B, 222 --- 2, B, 444 - 2, B, 777
		System.out.println("itC --> " + itC); // 6, C, 333 --- 
		
	}
	
}