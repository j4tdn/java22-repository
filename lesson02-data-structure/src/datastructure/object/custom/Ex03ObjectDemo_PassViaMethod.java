package datastructure.object.custom;

public class Ex03ObjectDemo_PassViaMethod {
	public static void main (String [] args) {
		Item itA = new Item(1,'A', 111d);
		Item itB = new Item(2,'B', 222d);
		
		System.out.println("itA -->" + itA);
		System.out.println("itB -->" + itB);
	}
	
	//Java pass by value at STACK --> Toán tử=
	//Muốn cập nhật được giá trị của một biến khi truyền qua hàm thì chỉ có thể biến KDL đối tượng
	private static void modify (Item item) {
		item.id = 999;
		item.name = 'z';
		item = new Item(7,'k',777d);
		item.salesPrice =888; 
	}
}
