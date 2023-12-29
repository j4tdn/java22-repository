package datastructure.object.custom;

public class Ex03ObjectDemo_PassViaMethod {
public static void main(String[] args) {
	Item itA = new Item(1, 'a', 111);
	Item itB = new Item(2, 'b', 222);
	
	modify(itA, itB);
	
	System.out.println("itA --> " + itA);
	System.out.println("itB --> " + itB);
	
}
  //JAVA pass by value at STACK --> Toán tử =
   private static void modify(Item first, Item second) {
	   first.id=999;
	   first = second;
	   second.name = 'Z';
	   second = first;
	   first.id=9;
	   first = new Item();
	   first.salesPrice = 777;
   }
}
