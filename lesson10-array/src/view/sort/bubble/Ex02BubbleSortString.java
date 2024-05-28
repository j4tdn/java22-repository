package view.sort.bubble;

import java.util.Arrays;

import functional.CompareString;

public class Ex02BubbleSortString {
	public static void main(String[] args) {
		// Khi sắp xếp mảng các đối tượng
		// Nếu tồn tại phần tử NULL sẽ xử lý thế nào
		String[] elements = {null, "a", "f", "t",null, "b", "k", "d", null};
		
		bubbleSort(elements, (s1,s2) -> {
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
		System.out.println("bubble sort asc --> " + Arrays.toString(elements));
		bubbleSort(elements, (s1,s2) -> {
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
		System.out.println("bubble sort desc --> " + Arrays.toString(elements));
	}
	private static void bubbleSort(String[] elements, CompareString cpString) {
		int length = elements.length;
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length - i - 1; j++) {
				if (cpString.compare(elements[j], elements[j+1]) > 0) {
					String temp = elements[j];
					elements[j] = elements[j+1];
					elements[j+1] = temp;
				}
			}
		}
	}

}
