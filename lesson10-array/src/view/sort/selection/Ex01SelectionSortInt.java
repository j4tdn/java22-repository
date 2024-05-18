package view.sort.selection;

import java.util.Arrays;

public class Ex01SelectionSortInt {

		public static void main(String[] args) {
			int[] elements = {1,5,11,9,4,6};
			
			selectionSort(elements);
			System.out.println("Selection Sort - Int Acd -->" + Arrays.toString(elements));
		}
		
		private static void selectionSort(int[] elements) {
			int length = elements.length;
			for(int i = length - 1; i > 0; i--) {
				for(int j = 0; j < i; j++) {
					if(elements[j] > elements[i] ) {
						int temp = elements[j];
						elements[j] = elements[i];
						elements[i] = temp;
					}
				}
			}
		}
	}

