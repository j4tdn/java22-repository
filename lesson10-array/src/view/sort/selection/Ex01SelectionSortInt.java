package view.sort.selection;

import java.util.Arrays;

public class Ex01SelectionSortInt {
	
	public static void main(String[] args) {
		int[] elements = { 1, 5, 11, 9, 4, 6 };
		
		selectionSort(elements);
		
		System.out.println("Selection Sort - Int Ascendng --> " + Arrays.toString(elements));
	}
	
	private static void selectionSort(int[] elements) {
		int length = elements.length;
		for (int i = 0; i < length; i++) { 
			for (int j = length - 1; j > i; j--) {
				if (elements[j] > elements[i]) {
					int temp = elements[j];
					elements[j] = elements[i];
					elements[i] = temp;
				}
			}
		}
	}
	
}
