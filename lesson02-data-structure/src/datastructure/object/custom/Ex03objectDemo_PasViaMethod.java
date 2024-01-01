package datastructure.object.custom;

public class Ex03objectDemo_PasViaMethod {
	public static void main(String[] args) {
				Item itA = new Item(1, 'A', 111);
				Item itB = new Item(2, 'B', 222);
				Item itC = new Item(3, 'C', 333);
				System.out.println(itA.hashCode());
				System.out.println("old" + itA);
				System.out.println(itB);
				System.out.println(itC);
				modify(itA, itB);// khi truyền biến qua hàm chỉ truyền giá trị ở stack 
				System.out.println("new" + itA);
				System.out.println(itA.hashCode());
				System.out.println("new" + itB);
				System.out.println(itB.hashCode());
				
				// muốn cập nhật được giá tri của một biến khi truyền qua hàm 
				//thì chỉ có thể biến kdl đổi tượng
	}
	private static void modify(Item itemA , Item itemB) {
//		item.id = 999;
//		item.name = 'z';
//		item = new Item(7 ,'K',777);
//		item.salePrice = 888;
//		System.out.println(item);
		itemA.id = 999;
		itemA = itemB;
		itemB.name ='z';
		itemB = itemA;
		itemA.id =9;
		itemA = new Item();// cập nhật ở satck khi call hàm xong thì ko thay đổi giá trị ở stack
		itemA.salePrice=777;
	}
}
