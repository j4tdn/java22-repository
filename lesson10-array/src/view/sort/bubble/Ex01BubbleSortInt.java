package view.sort.bubble;

import java.util.Arrays;

import functional.CompareInt;

public class Ex01BubbleSortInt {

	public static void main(String[] args) {

		int[] elements = { 1, 5, 11, 9, 4, 6 };

		// bubbleSortAsc(elements);
		bubbleSort(elements, (e1, e2) -> {
			// tăng dần, trước lớn hơn sau --> hoán vị
			if (e1 > e2) {
				return 1; // > 0
			}
			return -1;
		});

		System.out.println("bubble sort(asc) --> " + Arrays.toString(elements));

		// bubbleSortDesc(elements);
		bubbleSort(elements, (e1, e2) -> {
			// giảm dần, trước nhỏ hơn sau --> hoán vị
			if (e1 < e2) {
				return 1; // > 0
			}
			return -1;
		});

		System.out.println("bubble sort(desc) --> " + Arrays.toString(elements));

	}

	// Nếu kết quả của compare(elements[j], elements[j+1]) trả về thỏa mãn > 0
	// ==> hoán vị
	private static void bubbleSort(int[] elements, CompareInt cpInt) {
		int length = elements.length;
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length - i - 1; j++) {
				if (cpInt.compare(elements[j], elements[j + 1]) > 0) {
					int temp = elements[j];
					elements[j] = elements[j + 1];
					elements[j + 1] = temp;
				}
			}
		}
	}

	// elements[j] > elements[j+1]
	// elements[j] < elements[j+1]
	// --> boolean compare(int e1, int e2)

	// elements[j] - elements[j+1] > 0(chọn mặc định tăng dần)
	// elements[j] - elements[j+1] < 0
	// --> int compare(int e1, int e2)

	// sorting: ascending --> elements[j] > elements[j+1]
	private static void bubbleSortAsc(int[] elements) {
		int length = elements.length;
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length - i - 1; j++) {
				if (elements[j] > elements[j + 1]) {
					int temp = elements[j];
					elements[j] = elements[j + 1];
					elements[j + 1] = temp;
				}
			}
		}
	}

	// sorting: descending --> elements[j] < elements[j+1]
	private static void bubbleSortDesc(int[] elements) {
		int length = elements.length;
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length - i - 1; j++) {
				if (elements[j] < elements[j + 1]) {
					int temp = elements[j];
					elements[j] = elements[j + 1];
					elements[j + 1] = temp;
				}
			}
		}
	}
}
