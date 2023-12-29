package view;

import datastructure.object.custom.Item;

public class Ex01FinalDemo {
	public static void main(String[] args) {
		final int a = 5;
		//a = 7;
		System.out.println("a --> " + a);
		
		final Item item = new Item(1, 'a', 11);
		//item = new Item(2, 'b', 22);
		item.setId(9); 
		System.out.println("item --> " + item);
	}

}
