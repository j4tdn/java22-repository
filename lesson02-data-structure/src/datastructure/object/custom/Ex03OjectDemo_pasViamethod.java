package datastructure.object.custom;

public class Ex03OjectDemo_pasViamethod {
	public static void main(String[] args) {
		Item itA = new Item(1, 'a', 111);
		Item itB = new Item(2, 'b', 222);
		
		modify(itA, itB);
		
		System.out.println("itA--> " + itA);
		System.out.println("itB--> " + itB);
		
		int a = 5;
		change(a);
		System.out.println("a--> " + a);
		
	}
	
	private static void change(int input) {
		input = 999;
	}
	
	private static void modify(Item first, Item second) {
		first.setId(999);
		first = second;
		second.name = 'z';
		second = first;
		first.setId(9);
		first = new Item();
		first.salesPrice = 777;
	}

}

//để gán giá trị cho biến kdt :
//c1:dùng hàm khỏi taoj rỗng r xét các giá trị vô
//c2: gọi hàm khỏi tạo có nhìu tham số sau dó lấy biến cần cập nhật .thông tin bên trong hắn
