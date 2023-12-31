package datastructure.object;

public class Ex01ObjectDemo {
	public static void main(String[] args) {
		// biến x đang trỏ đến ô nhớ có giá trị là '^' ở STACK
		char x = '^';
		int a = 5;
		
		System.out.println("a --> " + a);
		System.out.println("x --> " + x);
		

		Item itA = new Item();
		itA.id = 11;
		itA.name = 'A';
		itA.salePrice = 78d;
		//Khi in biến KDL đối tượng
		//Tự động lấy biến đó gọi hàm toString để in ra
		//Trong JAVA tất cả mọi class đều mặc định kế thừa từ class 'Object'
		
		System.out.println("itA --> " + itA);
		//System.out.println("itA toString --> " + itA.toString());
		
		Item itB = new Item();
		itA.id = 22;
		itA.name = 'B';
		itA.salePrice = 745d;
		System.out.println("itB --> " + itB);
		
		// Ví dụ 
		Item itC = new Item(33,'C', 67);
		System.err.println("itC --> " + itC);
	}

}
