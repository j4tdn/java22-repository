package datastructure.object.custom;

public class Ex01ObjectDemo {
	
	public static void main(String[] args) {
		// biến x đang trỏ đến ô nhớ có giá trị là '^' ở stack
		char x = '^';
		int a = 5;
		
		System.out.println("a --> " + a); // 5
		
		// biến itA thuộc KDL Item(id, name, salesPrice)
		// khi khởi tạo giá trị cho biến KDL Item, biến đó phải chứa
		// 3 thông tin id, name, salesPrice
		Item itA = new Item(); // H1
		itA.id = 11;
		itA.name = 'A';
		itA.salesPrice = 78d;
		
		// Khi in biến KDL đối tượng
		// Tự động lấy biến đó gọi hàm toString để in ra
		// Trong JAVA tất cả mọi class đều mặc định kế thừa từ class 'Object'
		// class Object có hàm toString(thông tin của biến đối tượng)
		
		// in itA mặc định = in itA.toString()
		
		System.out.println("itA --> " + itA); // datastructure.object.Item@626b2d4a
		// System.out.println("itA toString --> " + itA.toString());
		
		// Mong muốn
		// Thay vì khi in biến itA nó in ra tên package, class @ địa chỉ thông qua hàm toString
		// Muốn: in biến itA 
		// --> in ra giá trị của các thuộc tính trên ô nhớ mà itA đang trỏ đến
		
		Item itB = new Item(); // H2
		itB.id = 22;
		itB.name = 'B';
		itB.salesPrice = 45;
		System.out.println("itB --> " + itB);
		
		// Ví dụ class Item --> có n thuộc tính
		// --> phải tốn 1 dòng để tạo ô nhớ trên HEAP
		// --> tốn n dòng để set giá trị cho từng thuộc tính
		
		// --> Vừa khởi tạo ô nhớ vừa gán giá trị cho các thuộc tính của class
		Item itC = new Item(33, 'C', 67); // H3
		System.out.println("itC --> " + itC);
		
	}
	
	public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
	
	
	
}
