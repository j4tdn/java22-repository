package datastructure.object.custom;

public class Ex03ObjectDemo_PassViaMethod {
	public static void main(String[] args) {
		Item itA = new Item(1, 'A', 111);	//H1
		Item itB = new Item(2, 'B', 222);	//H2
		
		modify(itA,itB);
		System.out.println("itA--> "+itA); //
		System.out.println("itB--> "+itB); //
		
		change(itA);
		System.out.println("itA--> "+itA); //
		
	}
	
	// muốn cập nhật dược giá trị của 1 biến khi mà truyền qua hàm thi chỉ có thể biến kiểu DL đối tượng
	private static void modify(Item  first, Item second) {
		first.id = 999;
		first =second;
		second.name = 'Z';
		second = first;
		first.id = 9;
		first = new Item();		
		first.salesPrice = 777;
	}
	
	private static void change(Item item) {
		item.id = 88;
	}
}
