package view.stream.working;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import utils.PrintUtils;

public class Ex04FlatMap {

	// FlatMap giúp gộp các phần tử trong Collection<Collection<T>> hoặc T[][] lại thành
	// Collection<T> hoặc T[] chứa đầy đủ tất cả các phần tử
	
	public static void main(String[] args) {
		
		var list = mockList();
		
		List<String> combinedList = mockList()
				.stream() // Stream<Set<String>>
				//.flatMap(set -> set.stream()) // Stream<String>
				.flatMap(Collection::stream)
				.toList();
		
		PrintUtils.generate("combinedList", combinedList);
		
		String[] combinedArray = Arrays.stream(mockArray()) // Stream<String[]>
				//.flatMap(array -> Arrays.stream(array)) // Stream<String>
				.flatMap(Arrays::stream)
				.toArray(String[]::new);
		
		PrintUtils.generate("combinedArray", combinedArray);
	}
	
	private static String[][] mockArray(){
		return new String[][] {
			{"X1", "X2"},
			{"X3", "X4", "X5"}
		};
	}
	
	
	private static List<Set<String>> mockList(){
		return List.of(
			Set.of("A1", "A2", "A3"),
			Set.of("B1", "B2", "B3"),
			Set.of("C1", "C2", "C3")
		);
	}
	
}
