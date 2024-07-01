package view.sort.bubble;

import java.util.Arrays;

import functional.CompareString;

public class Ex02BubbleSortString {

	public static void main(String[] args) {
		// Khi sắp xếp mảng các đối tượng
		// Nếu tồn tại phần tử NULL sẽ xử lý thế nào

		String[] elements = { null, "a", "f", null, "t", "", "b", "z", null, "k", "d", null };

		bubbleSort(elements, (s1, s2) -> {
			// s1 > s2

			// if s1(trước) > s2(sau) trả về 1, mà 1 > 0
			// thỏa mãn điều kiện bên trong hàm sort --> hoán vị s1 và s2
			// ngắn gọi --> if s1(trước) > s2(sau) -> hoán vị s1 và s2 --> tăng dần

			// phần 1: xử lý cho những phần tử null
			// --> null first(x) -> cứ s1 null còn s2 null/non --> ko hoán vị
			// --> null last
			if (s1 == null) {
				return -1;
			}
			// s1 != null
			if (s2 == null) {
				return 1;
			}

			// phần 2: xử lý so sánh cho những phần tử non-null
			// --> sắp xếp asc/desc theo giá trị của chính nó hay theo thuộc tính nào đó
			// if (s1.compareTo(s2) > 0) {
			// return 1;
			// }
			// return -1;
			return s1.compareTo(s2);
		});

		System.out.println("bubbleSort(asc, null first) --> " + Arrays.toString(elements));

		bubbleSort(elements, (s1, s2) -> {
			// null last --> nếu s1 null, s2 null --> do nothing
			// , s2 non null --> swap
			if (s1 == null && s2 != null) {
				return 1;
			}
			// s1 != null, s2 chưa biết
			// s1 = null, s2 = null --> ignore
			if (s2 == null) {
				return -1;
			}

			// s1 < s2
			// if (s1.compareTo(s2) < 0) {
			// return 1;
			// }
			// return -1;
			return s2.compareTo(s1); // = s1.compareTo(s2) * -1
		});

		System.out.println("bubbleSort(desc, null last) --> " + Arrays.toString(elements));
	}

	private static void bubbleSort(String[] elements, CompareString cpString) {
		int length = elements.length;
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length - i - 1; j++) {
				if (cpString.compare(elements[j], elements[j + 1]) > 0) {
					String temp = elements[j];
					elements[j] = elements[j + 1];
					elements[j + 1] = temp;
				}
			}
		}
	}
}
