package datastructure.array;

import java.util.Arrays;

import datastructure.object.custom.Item;

public class Ex03ArrayItemDemo {
public static void main(String[] args) {
	// tim kiem nhanh 1 class trong esclips --> crt shift t(type)
    Item[] items=fetchItems();
    
    // Viet chung trinh tim nhung mat hang co gia tri >300
    // input: items
    //--> dieu kien: item price >300
    //output: Item[] --> price >300
    Item[] filterItems =filter(items);
    System.out.println("items---> "+ Arrays.toString(filterItems));
}

  private static Item[] filter(Item[] item) {
	  // khi ko biet mang luu chinh xac may phan tu
	  //--> nghi den so phan tu toi da co the luu
	  Item[] result = new Item[item.length];
	  int running =0;
	  
	  for (int i = 0; i < item.length; i++) {
		  Item currentItem =item[i];
		if(currentItem.price > 300) {
			result[running++] =currentItem;
		}
	}
	  
	  return result;
  }
  private static Item[] fetchItems() {
	  return new Item[] {
			  new Item(1,'A',253f),
			  new Item(2,'B',123f),
			  new Item(3,'C',353f),
			  new Item(4,'D',453f),
			  new Item(5,'E',653f),
			  new Item(6,'F',153f),
			  new Item(7,'G',453f),
	  };
  }
}
