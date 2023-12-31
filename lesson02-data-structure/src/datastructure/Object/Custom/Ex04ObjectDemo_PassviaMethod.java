package datastructure.Object.Custom;

public class Ex04ObjectDemo_PassviaMethod {
	
	public static void main(String[] args) {
		Item itA = new Item(1, 'A', 111);
		Item itB = new Item(2, 'B', 222);
		
		modify(itA, itB);
		
		System.out.println("itA --> " + itA); // 9, Z, 111    9 Z 222
		System.out.println("itB --> " + itB); // 9, Z, 111    9 Z 222
		
		int a = 5;
		change(a);
		System.out.println("a --> " + a);
		
		change(itA);
		System.out.println("itA --> " + itA);
	}
	
	private static void change(int input) {
		input = 999;
	}
	
	// Item item = itA --> cùng trỏ đến ô nhớ ở HEAP
	private static void change(Item item) {
		item.id = 88;
	}
	
	// JAVA pass by value at STACK --> Toán tử =
	// Muốn cập nhật được giá trị của một biến khi truyền qua hàm
	// Thì chỉ có thể biến KDL đối tượng
	
	// Item item = itA;
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