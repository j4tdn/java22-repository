package view.stream.working;

import java.util.List;

public class Ex02LimitSkip {
	
	// n = 10
	// skip  --> offset		: lấy từ phần tử thứ mấy
	// limit --> row count	: lấy bao nhiêu phần tử
	
	public static void main(String[] args) {
	
		var elements = List.of("A1", "B2", "C3", "D4", "E5", "F6", "G7");
		
		elements.stream()
			.skip(1)
			.limit(2)
			.forEach(System.out::println);
	
	}
	
}
