package datastructure.object.custom;

public class Ex01ObjectDemo {

	public static void main(String[] args) {
		
		
		Item itB = new Item();
		itB.id = 1;
		itB.name = 'c';
		itB.salesPrice = 23.4;
		System.out.println(itB.toString()); //datastructure.object.Item@626b2d4a

		Item itA = new Item(1,'w',23);
		System.out.println(itA); //datastructure.object.Item@626b2d4a
		System.out.println(itA.toString());
		
	}
  
}
