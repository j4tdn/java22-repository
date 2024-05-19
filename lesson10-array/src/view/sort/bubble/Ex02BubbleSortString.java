package view.sort.bubble;

import java.util.Arrays;

import functional.CompareString;

public class Ex02BubbleSortString {
	//khi sắp xếp 1 mảng các đối tượng
	//nếu tồn tại phần tử null thì sẽ xử lý thế nào

	public static void main(String[] args) {
		String[] elements = {null, "a", "f", null, "t", "b",null, "z", "k", "d"};
		
		bubbleSort(elements, (s1, s2) -> {
			//phần 1: xử lý những phần tử null
			// => null first
			// => null last
			if(s1 == null) {
				return -1;
			}
			// s1 != null
			
			if(s2 == null) {
				return 1;
			}
			
//			if (s1.compareTo(s2) > 0) {
//				return 1;
//			}
//			return -1;
			return s2.compareTo(s1); // = s1.compareTo(s2) * -1
		});
		
		
		// phần 2 : xử lý so sánh những phần tử non - null
		// sắp xếp asc/desc
		System.out.println("bubbleSort(asc, null first)-->" + Arrays.toString(elements) );
		
		bubbleSort(elements, (s1, s2) -> {
			// null last --> nếu s1 null , s2 null --> do nothing
			// 							 , s2 non null --> swap	
			if(s1 == null && s2 != null) {
				return 1;
			}
			// s1 != null, s2 chưa biết
			// s1 = null, s2 = null
			if(s2 == null) {
				return -1; //ko hoán vị
			}
			
			if (s1.compareTo(s2) < 0) {
				return 1;
			}
			return -1;
		});
		System.out.println("bubbleSort(dsc, null last)-->" + Arrays.toString(elements) );
	}
	private static void bubbleSort(String[] elements, CompareString cpString) {
		int length = elements.length;
		for(int i = 0; i<length; i++) {
			for(int j = 0; j < length - i - 1; j++) {
				if (cpString.compare(elements[j], elements[j+1]) > 0) { /////
					String temp = elements[j];
					elements[j] = elements[j+1];
					elements[j+1]=temp;
				}
			}
		}
	}
}
