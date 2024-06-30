package generic.method;

import java.util.List;

public class Ex02GenericMethodWithList {
	public static void main(String[] args) {
		List<Integer> ints = List.of(1,2,3,4,5);
		List<Double> dobs = List.of(1d,2d,3d,4d,5d);
		List<String> strs = List.of("a","b","c","d","e");
		List<Object> objs = List.of("a", 2, "c", 3d);
		
		printfUsingGeneric("ints",ints);
		printfUsingGeneric("dobs",dobs);
		printfUsingGeneric("strs",strs);
		
		System.out.println("===============");
//		printf("ints",ints);
//		printf("dobs",dobs);
//		printf("strs",strs);
		printf("objs",objs);
	}
	private static<T> void printf(String prefix, List<Object> elements) {
		System.out.print(prefix +" -->");
		for(Object e: elements) {
			System.out.print(e + "  ");
		}
		System.out.println(" ");
	}
	
	//link <Integer> khoong p con cuar Link<Object> --> khoong the truyen vao
	private static<T> void printfUsingGeneric(String prefix, List<T> elements) {
		System.out.print(prefix +" -->");
		for(T e: elements) {
			System.out.print(e + "  ");
		}
		System.out.println(" ");
	}
}
