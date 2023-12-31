package datastructure.object.custom;

public class Ex01objectDemo {
	public static void main(String[] args) {
		// bien x dang trỏ đến ô nhó có giá trị là '^' ở stack
		char x = '^';
		int a = 5;
		
		Item itA = new Item();	
		itA.id = 11;
		itA.name = 'a';
		itA.salesPrice = 13d;
		// Khi in biến KDL đối tượng
		// Từ động lấy biến đó gọi hàm toString để in ra
		// Trong Java tất cả mọi class đêu mặc định kế thừa từ class 'Object'
		// class Object có hàm toString (Thông tin của biến đối tượng)
		System.out.println("itA" + itA);//atastructure.object.Item@65b54208
		// System.out.println("itA" + itA.toString());
		
		// Mong muốn 
		// Thay vì khi in biến itA nó in ra tên package. class @ địa chỉ thông tin qua hàm tótring
		// Muốn : in ra biên itA
		// -->in ra giá trị của các thuộc tính trên ô nhớ mà itA trỏ đến 
		Item itB = new Item();
		itB.id =22;
		itB.name='B';
		itB.salesPrice = 23f;
		System.out.println("itB -->" + itB);
		// ví dụ class Item --> có n thuộc tính
		// --> phải tốn 1 dòng để tạo ô nhớ trên Heap
		// --> tốn n dòng để set giá trị cho từng thuộc tính
		//--> vừa khởi tạo ô nhớ vừa gán giá trị cho các thuộc tính của class
		
		Item itC = new Item(33,'C', 67);
		System.out.println("itC -->" + itC);
		}
}
