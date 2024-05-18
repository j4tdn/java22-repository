package utils;

import bean.Item;
import functional.CompareInt;
import functional.CompareItem;
import functional.CompareString;

public class SortUtils {
	private SortUtils() {
		
	}
	public static void bubbleSort(int[] elements, CompareInt cpInt) {
		int length = elements.length;
		for(int i = 0; i <length; i++) {
			for(int j = 0; j < length - i - 1; j++) {
				if (cpInt.compare(elements[j], elements[j+1]) > 0) { /////
					int temp = elements[j];
					elements[j] = elements[j+1];
					elements[j+1]=temp;
				}
			}
		}
	}
	
	public static void bubbleSort(String[] elements, CompareString cpString) {
		int length = elements.length;
		for(int i = 0; i<length; i++) {
			for(int j = 0; j < length - i - 1; j++) {
				if (cpString.compare(elements[j], elements[j+1]) > 0) { /////
					String temp = elements[j];
					elements[j] = elements[j+1];
					elements[j+1]=temp;
				}
			}
		}
	}
	
	public static void bubbleSort(Item[] elements, CompareItem cpItem) {
		int length = elements.length;
		for(int i = 0; i<length; i++) {
			for(int j = 0; j < length - i - 1; j++) {
				if (cpItem.compareItem(elements[j], elements[j+1]) > 0) { /////
					Item temp = elements[j];
					elements[j] = elements[j+1];
					elements[j+1]=temp;
				}
			}
		}
	}
	
	public static void printf(String sortDesc, Item[] items) {
		System.out.println(sortDesc + " --> {");
		for(Item item: items) {
			System.out.println("  " + item);
		}
		System.out.println("}\n");
	}
}