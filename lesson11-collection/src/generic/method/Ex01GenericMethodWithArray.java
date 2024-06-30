package generic.method;

import java.util.Arrays;

public class Ex01GenericMethodWithArray {
	public static void main(String[] args) {
		Integer[] ints = {1, 2, 3, 4, 5};
		Double [] dobs = {1d, 2d, 3d, 4d, 5d};
		String [] strs = {"a", "b", "c", "d", "e"};
		Object [] objs = {"a", 3, "c", 5d, "e"};
		
		sort(ints);
		sort(dobs);
		sort(strs);
//		sort(objs);
		
		printfUsingGeneric("ints",ints);
		printfUsingGeneric("dobs",dobs);
		printfUsingGeneric("strs",strs);
		System.out.println("===============");
		printf("ints",ints);
		printf("dobs",dobs);
		printf("strs",strs);
		
	}
	/// <A extends B> A chi duoc phep la B hoac la con cua B
	// gioi han tren: upper bound generic
	private static <Element extends Comparable<Element>> void sort (Element[] elements) {
		Arrays.sort(elements);
	}
	
	private static<E> void printf(String prefix, Object[] elements) {
		System.out.print(prefix +" -->");
		for(Object e: elements) {
			System.out.print(e + "  ");
		}
		System.out.println(" ");
	}
	/*
	 * Trong hàm printf -> đang khai báo generic type E
	 * E -> nhận giá trị là 1 KDL đối tượng có phạm vi sd là hàm printf
	 */
	private static<E> void printfUsingGeneric(String prefix, E[] elements) {
		System.out.print(prefix +" -->");
		for(E e: elements) {
			System.out.print(e + "  ");
		}
		System.out.println(" ");
	}
}
