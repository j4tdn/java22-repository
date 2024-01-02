package view;

import datastructure.object.custom.Item;

public class Ex01FinalDemo {
    public static void main(String[] args) {
		// final la final o Stack
    	// ko the cap nhat gia tri cua bien o STACK
    	// gia tri cua bien KNT---> STACK
    	// gia tri cua bien KDT---> HEAP
    	
    	
    	// final stack
    	//immutable object
    	
    	  final int a=5;
//    	  a=7;
    	  
    	  System.out.println("a---->"+a);
    	   final Item item =new Item(1,'A',11); 
//    	  item = new Item(2,'B',22);
    	   item.id=9;
    	  System.out.println("item---> "+item); 
    	  // C1 item = new Item(2,'B',22);
    	  // C2 item.id =?
    	
	}
}
