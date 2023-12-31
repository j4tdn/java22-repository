package datastructure.object.custom;

public class Ex02ObjectDemo_UpdateValue {
	public static void main(String[] args) {
		int a =  5;
		// cập nhật giá trị a = ?
		
		Item item = new Item();
		// cập nhật giá trị item = .. item1
		// 					item = new Item()
		
		
		
		
		// Toán từ = là toán từ gán
		// Gán giá trị ở STACK
		Item itA = new Item(1,'A',111);
		Item itB = new Item(2,'B',222);
		Item itC = new Item(3,'C',333);
		
		itB.salesPrice = 444;
		itC.id = 3;
		itA = itB;
		itA.salesPrice = 777;
		
		System.out.println("itA -->"+itA);
		System.out.println("itB -->"+itB);
		System.out.println("itC -->"+itC);


	}
}
