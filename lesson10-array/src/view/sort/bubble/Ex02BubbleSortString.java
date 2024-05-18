package view.sort.bubble;

import java.util.Arrays;

import functional.CompareInt;
import functional.CompareString;

public class Ex02BubbleSortString {
	
	public static void main(String[] args) {
		String[] elements = {null, "a", "f",null, "t", "b", "j",null, "k", "d"};
		
		bubbleSort(elements, (s1,s2)->{
			
			//p1: xử lý cho những phần tử null
			if (s1==null) return -1;
			if (s2==null) return 1;
			
			//p2: xử lý cho những phần tử non-null
			return s1.compareTo(s2);
		});
		
		System.out.println("bubble sort -->"+ Arrays.toString(elements));
		
		bubbleSort(elements, (s1,s2)->{
			
			//p1: xử lý cho những phần tử null
			if (s1==null&& s2!=null) return 1;
			if (s2==null) return -1;
			
			//p2: xử lý cho những phần tử non-null
			return s1.compareTo(s2)*-1;
		});
		
		System.out.println("bubble sort(asc) -->"+ Arrays.toString(elements));
		
	}
	private static void bubbleSort(String[] elements, CompareString cpString) {
		int length = elements.length;
		for(int i = 0; i< length; i++) {
			for (int j=0; j< length-i-1;j++ ) {
				if(cpString.compare(elements[j], elements[j+1])>0) { 
					String temp = elements[j];
					elements[j] = elements[j+1];
					elements[j+1] = temp;
				}
			}
		}
	}
}
