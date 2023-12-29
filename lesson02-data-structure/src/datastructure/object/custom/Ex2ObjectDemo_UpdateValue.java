package datastructure.object.custom;

public class Ex2ObjectDemo_UpdateValue {
public static void main(String[] args) {
	//toán tử = là toán tử gán, gán giá trị ở STACK
	int a = 5;
	
	Item item = new Item();
	//cập nhật giá trị a = ...item1
	//   a = new Item();
	// --> cập nhật địa chỉ của biến a ở STACK
	// cập nhật giá trị a.x=?
	//                  a.y=?
	// --> cập nhật giá trị của các thuộc tính ở ô nhớ mà biến a đang trỏ đến ở HEAP
	
	Item itA = new Item(1, 'A', 111);
	Item itB = new Item(2, 'B', 222);
	Item itC = new Item(3, 'C', 333);
	
	System.out.println("itA address -->" + System.identityHashCode(itA));
	System.out.println("itB address -->" + System.identityHashCode(itB));
	System.out.println("itC address -->" + System.identityHashCode(itC));
	//itA: H2
	//itB: H2
	//itC: H3
	
	itB.salesPrice = 444;
	itC.id = 6;
	itA = itB;
	itA.salesPrice = 777;
	
	System.out.println("itA address after-->" + System.identityHashCode(itA));
	System.out.println("itB address after-->" + System.identityHashCode(itB));
	System.out.println("itC address after-->" + System.identityHashCode(itC));
	
	System.out.println("itA --> " + itA);
	System.out.println("itB --> " + itB);
	System.out.println("itC --> " + itC);
}
}
