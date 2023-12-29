package datastructure.object.custom;

public class Ex01ObjectDemo {
	public static void main(String[] args) {
		char x = '^'; //bien x dang tro den o nho co gia tri la '^' o Stack
		
		int a=5;
		//bien itA thuoc kdl Item(id,name,salePrice)
		//khi khoi tao gia tri cho 1 bien kdl Item, bien do phai chua 3 thong tin id,name, salePrice
		Item itA = new Item(); 
		itA.id = 11;
		itA.name='A';
		itA.salePrice=78d;
		
		System.out.println("a-->"+a);
		
		//trong java tat ca moi class deu mặc định kế thừa từ class Object
		//class Object co hàm toString(thông tin cua biến đối tượng)
		System.out.println("itA-->"+itA); 
		System.out.println("itA.toString-->"+itA.toString());
		
		Item itB=new Item();  //H2
		itB.id=22;
		itB.name='B';
		itB.salePrice=45;
		System.out.println("itB-->"+itB);
		
		//Vừa tạo vừa gán giá trị
		Item itC=new Item(33,'C',67);
		System.out.println("itC-->"+itC);
		
	}
}
