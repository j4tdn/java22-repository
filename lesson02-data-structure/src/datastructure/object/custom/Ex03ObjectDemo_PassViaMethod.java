package datastructure.object.custom;

public class Ex03ObjectDemo_PassViaMethod {

	public static void main(String[] args) {
		Item itA = new Item(1, 'A', 111);
		Item itB = new Item(2, 'B', 222);
		
		modify(itA, itB);
		
		
		System.out.println("itA --> " + itA);
		System.out.println("itB --> " + itB);
		
		int a = 5;
		change(a);
		System.out.println("a --> " + a);
		
		change(itA);
		
	}
	
	private static void change (int input) {
		input = 999;
	}
	
	private static void change (Item item) {
		item.id = 88;
	}
	
	//Java pass by value at STACK --> toán tử =
	//Muốn cập nhật đc giá trị của 1 biến khi truyền qua hàm
	//Thì chỉ có thể biến KDL đối tượng 
	
//	private static void modify(Item item) {
//		item.id = 999;
//		item.name = 'Z';
//		item = new Item(7, 'K', 777);
//		item.salesPrice = 888;
//	}
	
	private static void modify(Item first, Item second) {
		first.id = 999;
		first = second;
		second.name = 'Z';
		second = first;
		first.id = 9;
		first = new Item();
		first.salesPrice = 777;
	}
}
