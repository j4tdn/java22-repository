package datastructure.object.custom;

public class Ex01ObjectDemo {
	public static void main(String[] args) {
		char x = '^';
		int a = 5;
		
		//biến itA thuộc KDL Item(Id, name, salesPrice)
		//khi khởi tạo giá trị cho biến KDL Item, biến đó phải chứa 3 thông tin Id, name, salesPrice
		
		Item itA = new Item();
		itA.id = 11;
		itA.name = 'A';
		itA.salesPrice = 78d;
		
		System.out.println("a --> " + a);
		System.out.println("itA --> " + itA);
		
		//khi in biến KDL đối tượng thì tự động lấy biến đó gọi hàm to String để in ra
		//Trong java tất cả mọi class đều mặc định kế thừa từ class 'Object'
		//class Object có hàm tótring(thông tin của biến đối tượng)
		//Thay vì khi in biến itA nó in ra tên package, class @ địa chỉ thông qua hàm toString thì in ra
		
		//System.out.println("itA toString --> " + itA.toString());
		
		Item itB = new Item();
		itB.id = 22;
		itB.name = 'B';
		itB.salesPrice = 45d;
		System.out.println("itB --> " + itB);
		
		//VD class Item --> có n thuộc tính
		//--> phải tốn 1 dòng để tạo ô nhớ trên HEAP
		//--> tốn n dòng để set giá trị cho từng thuộc tính
		//--> vừa khởi tạo ô nhớ vừa gán giá trị cho các thuộc tính của class
		
		Item itC = new Item(33, 'C', 67);
		System.out.println("itC --> " + itC);
		
	}

}
