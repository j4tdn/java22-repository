package view.sort.selection;

import java.util.Arrays;

import functional.CompareInt;

public class Ex01SelectionSortInt {

	public static void main(String[] args) {
		int[] elements = {1,5,11,9,4,6};
		
		selectionSortDesc(elements);
		System.out.println("Selection Sort - Int Descending -->"+Arrays.toString(elements));
		
		selectionSortAsc(elements, (e1, e2) -> e1 - e2);
		System.out.println("Selection Sort - Int Ascending -->"+Arrays.toString(elements));
		
	}
	

	private static void selectionSortDesc(int[] elements) {
		int length = elements.length;
		for(int i = 0; i < length; i++) {
			for(int j = length - 1; j > i; j--) {
				if(elements[j] > elements[i] ) {
					int temp = elements[j];
					elements[j] = elements[i];
					elements[i] = temp;
				}
			}
		}
	}
	private static void selectionSortAsc(int[] elements, CompareInt compareInt) {
		int length = elements.length;
		for(int i = length - 1; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				if(compareInt.compare(elements[j], elements[i]) > 0) {
					int temp = elements[j];
					elements[j] = elements[i];
					elements[i] = temp;
				}
			}
		}
	}
}
