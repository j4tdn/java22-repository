package view.sort.selection;

import java.util.Arrays;

import functional.CompareString;

public class Ex02SelectionSortString {
	public static void main(String[] args) {
		String[] elements = {null, "a", "f", "t",null, "b", "k", "d", null};
		
		selectionSort(elements, (s1,s2) -> {
			if (s1 == null) {
				return -1;
			}
			if (s2 == null) {
				return 1;
			}
			if (s1.compareTo(s2) > 0) {
				return 1;
			}
			return -1;
		});
		System.out.println("bubble sort asc, null first --> " + Arrays.toString(elements));
		selectionSort(elements, (s1,s2) -> {
			if(s1 == null && s2 != null) {
				return 1;
			}
			if (s2 == null) {
				return -1;
			}
			if (s1.compareTo(s2) < 0) {
				return 1;
			}
			return -1;
		});
		System.out.println("bubble sort desc, null last --> " + Arrays.toString(elements));
	}
	private static void selectionSort(String[] elements, CompareString cpString) {
		int length = elements.length;
		for (int i = length -1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (cpString.compare(elements[j], elements[i]) > 0) {
					String temp = elements[j];
					elements[j] = elements[i];
					elements[i] = temp;
				}
			}
		}
	}

}
