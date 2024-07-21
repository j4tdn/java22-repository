package view.stream.working;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.stream.Collectors;

import static utils.PrintUtils.*;

public class Ex01Filtering {

	//Distinct
	public static void main(String[] args) {
		
		List<String> elements = List.of("a1","b2","c3","b2","d4","c3");
		
		
		
		//distint --> a1, b2,c3,d4
		// Cach 1: Set.copyOf(elements);
		
		
		var r1 =  elements.stream().distinct().collect(Collectors.toList());
		
		
		generate("Distinct R1",r1);
		
		var r2 = elements.stream().collect(Collectors.toSet());
		
		generate("Distinct R2", r2);
		
		

		//unique  -->a1,d4
		
		//Cach 1 
		// K: giá trị của phần tử trong elements 
		// V: số lần xuất hiện của phân tử đó trong elements 
		
		Map<String, Integer> r3 = new HashMap<>();
		elements.forEach(element -> {
			if( !r3.containsKey(element)) {
				r3.put(element, 1);
			} else {
				r3.put(element, r3.get(element) + 1);
			}
		});
		
		var r4 = r3.entrySet().stream()
		.filter(e -> e.getValue() == 1)
		.map(Entry::getKey)
		.collect(Collectors.toList());
		
		generate("Unique R4", r4);
		
		
		var r5 = elements.stream()
				.collect(Collectors.groupingBy(Function.identity() , Collectors.counting()))
				.entrySet().stream()
				.filter(e -> e.getValue() == 1)
				.map(Entry::getKey)
				.collect(Collectors.toCollection(TreeSet::new));
		
		generate("R5 unique", r5);
	}
	

}
