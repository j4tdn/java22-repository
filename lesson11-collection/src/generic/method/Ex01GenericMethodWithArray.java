package generic.method;

import java.util.Arrays;

public class Ex01GenericMethodWithArray {

	public static void main(String[] args) {
		Integer[] ints = { 1, 2, 3, 4, 5 };
		Double[] dobs = { 1d, 2d, 3d, 4d, 5d };
		String[] strs = { "a", "b", "c", "d", "e" };
		Object[] objs = { "a", 4, "c", 4d, "e" };
		
		sort(ints);
		sort(dobs);
		sort(strs);
		// sort(objs);
		
		printf("ints", ints);
		printf("dobs", dobs);
		printf("strs", strs);
		printf("objs", objs);
		
		System.out.println("\n================\n");
		
		printfUsingGeneric("ints", ints);
		printfUsingGeneric("dobs", dobs);
		printfUsingGeneric("strs", strs);
	}
	
	// <A extends B> A chỉ được phép là B hoặc là con của B
	// Giới hạn trên: upper bound generic
	private static <Element extends Comparable<Element>> void sort(Element[] elements) {
		Arrays.sort(elements);
	}
	
	// Arrays.sort(Object[] elements) --> Object lúc runtime phải là con của Comparable
	// Arrays.sort(T[] elements, Comparator<T> comparator)
	
	private static void printf(String prefix, Object[] elements) {
		System.out.print(prefix + " --> ");
		for (Object element: elements) {
			System.out.print(element + " ");
		}
		System.out.println();
	}
	
	/**
	 * Trong hàm printf -> đang khai báo generic type E
	 * E -> nhận giá trị là KDL đối tượng, phạm vi sử dụng trong hàm printf
	 */
	private static <E> void printfUsingGeneric(String prefix, E[] elements) {
		System.out.print(prefix + " --> ");
		for (E element: elements) {
			System.out.print(element + " ");
		}
		System.out.println();
	}

}