package datastructure.object.custom;

public class Ex01ObjectDemo {
   public static void main(String[] args) {
	char x = '^';
	int a = 5;
	//itA thuộc kdl Item (id, name, price)
	Item itA = new Item();
	itA.id = 11;
	itA.name = 'A';
	itA.salesPrice= 78d;
	// Khi in biến KDL đối tượng, tự động lấy biến đó gọi hàm toString để in ra
	//Trong Java mọi class đều mặc định kế thừa class "object"
	//Class object có hàm toString (thông tin của biến đối tượng)
	System.out.println(itA);
	Item itB = new Item();
	itB.id = 22;
	itB.name = 'B';
	itB.salesPrice= 739d;
	System.out.println(itB);
	Item itC = new Item(33, 'C', 67);
	System.out.println(itC);
}
}
