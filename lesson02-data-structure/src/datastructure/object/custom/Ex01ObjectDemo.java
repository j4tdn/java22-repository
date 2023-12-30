package datastructure.object.custom;

public class Ex01ObjectDemo {
	
	public static void main(String[] args) {
		char x = '^';
		int a = 5;
		
		// biến itA thuộc KDL Item(id, name, salesPrice)
		//khi khởi tạo giá trị cho biến KDL Item, biến đó phải chứa
		Item itA = new Item(); //H1
		itA.id = 11;
		itA.name = 'A';
		itA.salesPrice = 78d;
		
		System.out.println("a ---> " + a);
		System.out.println("itA ---> " + itA); //itA ---> datastructure.object.Item@5577140b
//		System.out.println("itA toString--->" + itA.toString());
		
		//Mong muốn: in biến itA, in ra giá trị của các thuộc tính 
		
		Item itB = new Item(); //H2 
		itB.id = 22;
		itB.name = 'B';
		itB.salesPrice = 45;
		System.out.println("itB ---> " + itB);
		
		Item itC = new Item(33, 'C', 67);
		System.out.println("itC ---> " + itC);
		
		
	}
	
	public String toString() {
		return getClass().getName() + "@" + Integer.toHexString(hashCode());
	}
	
	
}
