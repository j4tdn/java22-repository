package datastructure.object.custom;

public class Ex03ObjectDemo_PassViaMethod {
     public static void main(String[] args) {
		Item itA = new Item(1, 'A', 111);
		Item itB = new Item(2, 'B', 222);
		
		modify(itA, itB);
		System.out.println("itA---->" +itA);
		System.out.println("itB---->" +itB);
	}
     
     private static void modify(Item first, Item second) {
//    	 first.id =999;
//    	 first =second;
//    	 second.name='z';
    	 second =first;
    	 first.id=9;
    	 first =new Item();
    	 first.salesPrice=777;
     }
}
