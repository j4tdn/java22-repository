package datastructure.object;

public class Ex01ObjectDemo {
	public static void main (String[] args) {
		char x = '^'; // bien x dang tro den o nho co gia tri la '^' o stack
		int a = 5;
		
		//bien itA thuoc KDL Item(id, name, salesPrice)
		//khi khoi tao gia tri cho bien KDL Item, bien do phai chua 3 thong tin id, name, salesPrice
		Item itA = new Item();
		itA.id = 11;
		itA.name = 'A';
		itA.salesPrice = 78d;
		
		
		//khi in bien KDL doi tuong
		// TU dong lay bien do goi toString de in ra
		// Trong JAVA tat ca moi class deu mac dinh ke thua tu class ten la 'object' 
		// class object co ham toString(thong tin cua bien doi tuong)
		
		//in itA mac dinh - in itA.toString()
		System.out.println("itA --> " + itA); // datastructure.object.Item@53333
		//System.out.println("itA --> " + itA.toString()); // datastructure.object.Item@53333
		
		//mong muon
		// thay vi khi in bien itA no in ra ten package, class @ dia chi thong qua ham toString()
		//Muon: in bien itA --> in ra gia tri cua cac thuoc tinh tren o nho ma itA dang tro den
		Item itB = new Item();
		itB.id = 22;
		itB.name = 'B';
		itB.salesPrice = 45;
		System.out.println("itB --> " + itB);
		
		// vi du class Item -->co n thuoc tinh
		// --> phai ton 1 dong de tao o nho tren HEAP
		// -- ton n dong de set gia tri cho tung thuoc tinh 
		
		// --> vua khoi tao o nho vua gan gia tri cho cac thuoc tinh trong class
		
		Item itC = new Item(33, 'C', 67);
		System.out.println("itC --> " + itC );
		
	}
	

}
