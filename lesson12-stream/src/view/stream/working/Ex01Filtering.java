package view.stream.working;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

import static utils.PrintUtils.*;

public class Ex01Filtering {
	
	public static void main(String[] args) {
		List<String> elements = List.of("a1","b2","c3","b2","d4","c3");
		
		//distinct
		//Set.copyOf(elements);
		var r1 = elements.stream()
				.distinct()
				.toList();
		
		generate("Distinct R1 ", r1);
		
		Map<String, Integer > r3 = new HashMap<>();
		elements.forEach(element ->{
			if (!r3.containsKey(element)) {
				r3.put(element, 1);
			}else {
				r3.put(element, r3.get(element) +1);
			}
		});
		
		//generate("R3 data" , r3);
		
		var r4 = r3.entrySet().stream()
			.filter(e-> e.getValue() == 1)
			.map(Entry::getKey)
			.toList();
		
		//generate("R4 data" , r4);
		
		var r5 = elements.stream()
					.collect(Collectors.groupingBy(element -> element, Collectors.counting()))
					.entrySet().stream()
					.filter(e -> e.getValue() == 1)
					.map(Entry::getKey)
					.collect(Collectors.toCollection(TreeSet::new));
		generate("Unique R5", r5);
		
	}
}
