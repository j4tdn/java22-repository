package datastructure.object.custom;

public class Ex01ObjectDemo {
	
	public static void main(String[] args) {
		// biến x đang trỏ đến ô nhớ có giá trị '^' ở stack
		char x = '^';
		int a = 5;
		
		System.out.println("a -> "+a); //5
		Item itA = new Item(); //H1
		itA.id = 11;
		itA.name = 'A';
		itA.salesPrice = 78d;
		
		// Khi in biến KDL đối tượng
		// Tự động lấy biến đó gọi hàm toString để in ra
		// Trong JAVA tất cả mọi class đều mặc định kế thừa từ class Object
		// class Object có hàm toString(thông tin của biến đối tượng)
		
		// in itA mặc định = in itA.toString()
		
		System.out.println("itA -> " +itA); //datastructure.object.Item@1c6b6478
		//System.out.println("itA toString -> "+itA.toString());
	
		Item itB = new Item(); //H2
		itB.id = 22;
		itB.name = 'B';
		itB.salesPrice = 45;
		System.out.println("itB -> "+ itB);
		
		Item itC = new Item(33, 'C', 67);
		System.out.println("itC -> "+ itC);
		
		// Item i5 = null;
		// System.out.println("i5 id "+ i5.id);
	}
	
}
