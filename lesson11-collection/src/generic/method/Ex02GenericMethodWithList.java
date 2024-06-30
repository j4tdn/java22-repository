package generic.method;

import java.util.List;

public class Ex02GenericMethodWithList {
	public static void main(String[] args) {
		List<Integer> ints = List.of(1,2,3,4,5);
		List<Double> dobs = List.of(1d, 2d, 3d, 4d, 5d);
		List<String> strs = List.of("a", "b", "c","d","e");
		List<Object> objs = List.of("a", "b", "c","d","e");
		
		// printf("ints", ints);
		// printf("dobs", dobs);
		// printf("strs", strs);
		
        System.out.println("\n======================\n");
		
		printfUsingGeneric("ints", ints);
		printfUsingGeneric("dobs", dobs);
		printfUsingGeneric("strs", strs);
		
	}
	private static <T> void printfUsingGeneric(String prefix,List<T> elements){
		System.out.println(prefix + " --> ");
		for (T element: elements) {
			System.out.println(element + " ");
		}
		System.out.println("\n");
	}
	private static void printf(String prefix,List<Object> elements){
		System.out.println(prefix + " --> ");
		for (Object element: elements) {
			System.out.println(element + " ");
		}
		System.out.println("\n");
	}

}
