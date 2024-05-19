package view.sort.selection;

import java.util.Arrays;

import functional.CompareInt;
import functional.CompareString;

public class Ex02SelectionSortString {
	
	public static void main(String[] args) {
		String[] elements = {null, "a", "f",null, "t", "b", "j",null, "k", "d"};
		
		selectionSort(elements, (s1,s2)->{
			
			//p1: xử lý cho những phần tử null
			if (s1==null) return -1;
			if (s2==null) return 1;
			
			//p2: xử lý cho những phần tử non-null
			return s1.compareTo(s2);
		});
		
		System.out.println("selection Sort -->"+ Arrays.toString(elements));
		
		selectionSort(elements, (s1,s2)->{
			
			//p1: xử lý cho những phần tử null
			if (s1==null&& s2!=null) return 1;
			if (s2==null) return -1;
			
			//p2: xử lý cho những phần tử non-null
			return s1.compareTo(s2)*-1;
		});
		
		System.out.println("selection Sort(asc) -->"+ Arrays.toString(elements));
		
	}
	private static void selectionSort(String[] elements, CompareString compareString) {
		
		int length = elements.length;
		for(int i = length - 1; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				if(compareString.compare(elements[j], elements[i]) >0 ) {
					String temp = elements[j];
					elements[j] = elements[i];
					elements[i] = temp;
				}
			}
		}
	}
}
