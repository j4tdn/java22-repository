package datastructure.object.custom;

public class Ex01ObjectDemo {
	public static void main(String [] args) {
		char x ='^';
		int a= 5;
		
		//biến itA thuộc KDL Iteam (id,name,salesPrice)
		//khi khởi tạo giá trị cho biến KDL Item, biến đó phải chứa 
		//3 thông tin id, nam , salesPrice
		
		Item itA = new Item();
		itA.id = 11;
		itA.name ='a';
		itA.salesPrice=78d;
		
		//Khi in biến KDL đói tượng
		//tự động lấy biến đó gọi hà toString để in ra
		//Trong Java tất cả mọi class đều mặc định kế thừa từ class 'Object'
		//class Object có hàm toString (Thông tin biến đối tượng)
		System.out.println("itA -->" +itA);
		
		
		Item itB = new Item();
		itB.id=22;
		itB.name = 'B';
		itA.salesPrice=45d;
		System.out.println("itB->> " +itB);
		
		Item itC = new Item(10,'c',21d);
		System.out.println("itC ->>" + itC);
	}
	
}
