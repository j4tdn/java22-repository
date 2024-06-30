package generic.method;

import java.util.List;

public class Ex02GenericMethodWithList {
	
	public static void main(String[] args) {
		List<Integer> ints = List.of(1,2,3,4,5); // immutable list: ko cần update hay add
		List<Double> dobs = List.of(1d,2d,3d,4d,5d);
		List<String> strs = List.of("a", "b", "c", "d","e");
		List<Object> objs = List.of("a", 4, "c", 7d);
		
		// List<Integer> ko phải là con của List<Object> -> ko thể truyền vào
//		printf("ints",ints);
//		printf("dobs",dobs);
//		printf("strs",strs);
		printf("objs",objs);
		
		System.out.println("=========");
		
		printfUsingGeneric("ints",ints);
		printfUsingGeneric("dobs",dobs);
		printfUsingGeneric("strs",strs);

	}

	private static <T> void printf(String prefix, List<Object> elements) {
		System.out.print(prefix + "--> ");
		for(Object element: elements) {
			System.out.print(element + " ");
		}
		System.out.println();
	}
	
	private static <T> void printfUsingGeneric(String prefix, List<T> elements) {
		System.out.print(prefix + "--> ");
		for(T element: elements) {
			System.out.print(element + " ");
		}
		System.out.println();
	}
}
