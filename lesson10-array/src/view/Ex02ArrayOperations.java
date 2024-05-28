package view;

import java.util.Arrays;


public class Ex02ArrayOperations {
	public static void main(String[] args) {
		int[] elements = {11, 29, 44, 17, 36, 88, 29};// H1
		modify(elements);
		System.out.println("elements --> " + Arrays.toString(elements));// H1
		/*
		 Viết hàm xử lý cho từng yêu cầu dưới đây
		 + Thêm mới một phần tử vào vị trí thứ k trong mảng(0< k < length)
		 + Xóa một phần tử tại vị trí thứ k trong mảng(0< k < length)
		 */
		System.out.println("elements add(source, 456) -> " + Arrays.toString(add(elements, 456)));
		System.out.println("elements insert(source, 0, 259) -> " + Arrays.toString(add(elements, 0, 259)));
		System.out.println("elements delete(source, 4) -> " + Arrays.toString(delete(elements, 4)));
	}
	private static int[] delete(int[] source, int pos) {
		int[] target = new int[source.length];
		for (int i = 0; i < target.length; i++) {
			target[i] = source[i];
		}
		for (int i = pos; i < target.length -1; i++) {
			target[i] = target[i+1];
		}
		return Arrays.copyOfRange(target, 0, target.length-1);
	}
	// Thêm một phần tử cách 2
	private static int[] insert(int[] source, int pos, int newValue) {
		int sourceLength = source.length;
		if (pos < 0 || pos > sourceLength) {
			throw new ArrayIndexOutOfBoundsException("Pos to be added should be in range");
		}
		int[] target = new int[sourceLength + 1];
		for (int i = 0; i< pos; i++) {
			target[i] = source[i];			
		}
		
		target[pos] = newValue;
		for (int i = pos + 1; i < target.length; i++) {
			target[i] = source[i-1];
		}
		return target;
	}
	
	// Thêm một phần tử cách 1
	private static int[] add(int[] source, int pos, int newValue) {
		int sourceLength = source.length;
		if (pos < 0 || pos > sourceLength) {
			throw new ArrayIndexOutOfBoundsException("Pos to be added should be in range");
		}
		int[] target = new int[sourceLength + 1];
		for (int i = 0; i< sourceLength; i++) {
			target[i] = source[i];			
		}
		for (int i = target.length - 1; i > pos; i--) {
			target[i] = target[i-1];
		}
		target[pos] = newValue;
		return target;
	}
	private static int[] add(int[] source, int newValue) {
		return add(source, source.length, newValue);
	}
	private static void modify(int[] elements) {
		elements[3] = 555;
		elements = new int[5];// H2
	}

}
