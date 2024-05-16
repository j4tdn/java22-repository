package view.sort;

import java.util.Arrays;

import functional.CompareInt;

public class Ex01BubbleSort {
	public static void main(String[] args) {
		int[] elements = { 1, 5, 11, 9, 4, 6 };
		bubbleSort(elements, (e1,e2)->{
			return e1<e2 ? 1:-1;
		});
		System.out.println("bubble sort -->"+ Arrays.toString(elements));
		
	}
	private static void bubbleSort(int[] elements, CompareInt cpInt) {
		int length = elements.length;
		for(int i = 0; i< length; i++) {
			for (int j=0; j< length-i-1;j++ ) {
				if(cpInt.compare(elements[j], elements[j+1])>0) { // tăng dần 
					int temp = elements[j];
					elements[j] = elements[j+1];
					elements[j+1] = temp;
				}
			}
		}
	}

}