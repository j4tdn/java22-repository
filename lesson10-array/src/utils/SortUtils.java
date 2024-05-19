package utils;

import java.util.Arrays;

import bean.Item;
import common.SortOrder;
import functional.CompareInt;
import functional.CompareItem;
import functional.CompareString;

public class SortUtils {
	
	private SortUtils() {
	}
	
	public static void sort(int[] elements, SortOrder order) {
		Arrays.sort(elements);
		if(SortOrder.DESC == order ) {
			reverse(elements);
		}
	}
	
	public static void sort(int[] elements) {
		Arrays.sort(elements);
	}
	
	public static void reverse(int[] elements) {
		int length = elements.length;
		for(int i = 0; i < elements.length / 2; i++) {
			int tmp = elements[i];
			elements[i] = elements[length - i - 1];
			elements[length - i - 1] = tmp;
			
		}
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
				if (cpItem.compare(elements[j], elements[j+1]) > 0) { /////
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
