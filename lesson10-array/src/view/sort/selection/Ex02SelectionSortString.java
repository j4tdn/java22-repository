package view.sort.selection;

import java.util.Arrays;

import functional.CompareString;

public class Ex02SelectionSortString {

	public static void main(String[] args) {
		String[] elements = {null, "a", "f", null, "t", "b",null, "z", "k", "d"};
		
		selectionSort(elements, (s1, s2) -> {
			if(s1 == null) {
				return -1;
			}
			
			if(s2 == null) {
				return 1;
			}
			
			return s2.compareTo(s1); // = s1.compareTo(s2) * -1
		});
		
		System.out.println("selectionSort(null first, asc)-->" + Arrays.toString(elements) );
		
		selectionSort(elements, (s1, s2) -> {
			if(s1 == null && s2 != null) {
				return 1;
			}
			if(s2 == null) {
				return -1; //ko hoán vị
			}
			
			if (s1.compareTo(s2) < 0) {
				return 1;
			}
			return -1;
		});
		System.out.println("selectionSort(null last, desc)-->" + Arrays.toString(elements) );
	}
	private static void selectionSort(String[] elements, CompareString cpString) {
		int length = elements.length;
		for(int i = length - 1 ; i > 0; i--) {
			for(int j = 0; j < i ; j++) { 		///////
				if (cpString.compare(elements[j], elements[i]) > 0) { 
					String temp = elements[j];
					elements[j] = elements[i];
					elements[i]=temp;
				}
			}
		}
	}
}
