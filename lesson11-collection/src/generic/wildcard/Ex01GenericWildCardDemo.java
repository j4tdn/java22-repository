package generic.wildcard;

import java.util.List;

public class Ex01GenericWildCardDemo {
	
	public static void main(String[] args) {
		// generic type --> T, E    ==> khai báo và sử dụng trong generic class, interface, method
		
		// generic wild card --> ?  ==> sử dụng để truyền vào 1 generic class/interface có sẵn
		
		// tham số là generic type trong class/interface chưa biết truyền vào gì --> ? lúc compile
		// còn runtime sẽ biết được chính xác kiểu gì
		
		List<Integer> ints = List.of(1, 2, 3, 4, 5);
		List<Double> dobs = List.of(1d, 2d, 3d, 4d, 5d);
		List<String> strs = List.of("a", "b", "c", "d", "e");
		List<Object> objs = List.of("a", 4, "c", 7d, "e");
		
		printList(ints);
		// printList(dobs);
		// printList(strs);
		printList(objs);
	}
	
	private static <T> void printData(T data) {
		System.out.println(data);
	}
	
	// List<?> = List<T> --> ? nhận vào 1 KDL đối tượng bất kỳ
	
	// List<? extends Number> --> ? nhận vào là Number hoặc con của Number
	
	// List<? super Integer>  --> ? nhận vào là Integer hoặc cha của Integer
	
	private static void printList(List<? super Integer> list) {
		
	}

}
