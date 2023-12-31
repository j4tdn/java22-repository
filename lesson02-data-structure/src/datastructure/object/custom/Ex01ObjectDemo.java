package datastructure.object.custom;

public class Ex01ObjectDemo {
	
	public static void main(String[] args) {
		char x = '^';
		int a =5;
		
		//bien itA thuoc kieu du lieu ite(id, name, salePrice)
		//khi khoi tao phair chua 3 thoong tin
		Item itA = new Item();//H1
		
		System.out.println("a--> "+a);
		
		// in 1 biến kiểu đối tượng --> tự động gọi hàm ToString() trong class Object (Item được kế thừa từ class Object)
		System.out.println("itA--> "+itA);
//		System.out.println("itA toString--> "+itA.toString());
		
		itA.id = 11;
		itA.name = 'A';
		itA.salesPrice = 78d; 
		
		System.out.println("itA--> "+itA);

		Item itB = new Item();//H2
		itB.id = 22;
		itB.name = 'B';
		itB.salesPrice = 45d; 
		System.out.println("itB--> "+itB);
		
		Item itC = new Item(33,'C',67);
		System.out.println("itC--> "+itC);
	}
}
