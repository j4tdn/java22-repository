package view.sort;

import java.util.Arrays;

import functional.CompareInt;
import functional.CompareString;

public class Ex02BubbleSortString {
	
	public static void main(String[] args) {
		String[] elements = {"a", "f", "t", "b", "j", "k", "d"};
		bubbleSort(elements, (e1,e2)->{
			return e1.compareTo(e2)<0 ? 1:-1;
		});
		System.out.println("bubble sort -->"+ Arrays.toString(elements));
		
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
