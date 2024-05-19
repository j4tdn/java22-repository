package view.sort.insertion;

import java.util.Arrays;

import functional.CompareInt;

public class Ex01InsertionSortInt {

		public static void main(String[] args) {
			int[] elements = {1,5,11,9,4,6};
			
			insertSort(elements, (e1,e2)->e1-e2);
			
			System.out.println("Insertion Sort - Int Acd -->" + Arrays.toString(elements));
		}
		
		private static void insertSort(int[] elements, CompareInt compareInt) {
			
			int length = elements.length;
			for(int i = 0; i < length; i++) {
				for(int j = 0; j < i; j++) {
					if(compareInt.compare(elements[j], elements[i]) >0 ) {
						int temp = elements[j];
						elements[j] = elements[i];
						elements[i] = temp;
					}
				}
			}
		}
	}

