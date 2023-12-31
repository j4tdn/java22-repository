package datastructure.object.custom;

public class Ex03ObjectDemo_PassViaMethod {

	public static void main(String[] args) {
	
			Item itA = new Item (1, 'A', 111);
			Item itB = new Item (2, 'B', 222);

			int a = 5;
			change(a);
			System.out.println("itA --> " + itA);

			modify(itA);

			System.out.println("intA --> " + itA);
			System.out.println("intB --> " + itB);
			// Muốn cập nhập đơcj giá trị của một biến khi truyền qua hàm 
			// thì chỉ có thể biến KDL đối tượng
		}
		private static void change(int input) {
			input = 999;
		}


		private static void modify(Item item ) {
			item.id = 999;
			item.name = 'z';
			item = new Item(7, 'K', 777);
			
		
		
		
		
	}

}
