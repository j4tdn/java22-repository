package view.stream.working;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import utils.PrintUtils;

public class Ex04FlatMap {
	
	public static void main(String[] args) {
		
		var combinedList = mockList()
				.stream()
				.flatMap(set -> set.stream())
				.toList();
		PrintUtils.generate("combinedLsit",combinedList );
		
		var combinedArray = Arrays.stream(mockArray())
				.flatMap(array -> Arrays.stream(array))
				.toArray(String[]::new);
		PrintUtils.generate("combinedLsit",combinedArray );
	}
	
	private static String[][] mockArray(){
		return new String[][] {
			{"X1", "X2"},
			{"X3", "X4" , "X5"}
		};
	}
	
	private static List<Set<String>> mockList(){
		return List.of(
				Set.of("A1" , "A2", "A3"),
				Set.of("B1" , "B2", "B3"),
				Set.of("C1" , "C2", "C3")
				);
	}
}
