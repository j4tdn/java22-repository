package view.stream.working;

import static utils.PrintUtils.generate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.TreeSet;
import java.util.stream.Collectors;

import bean.Apple;
import bean.Dish;
import common.Kind;
import model.DataModel;

public class Ex01Filtering {
	
	// distinct --> từ danh sách -> những phần tử trùng nhau lấy 1 phần tử
	// unique   --> từ danh sách -> lấy ra những phần tử ko trùng nhau
	
	public static void main(String[] args) {
		
		List<String> elements = List.of("a1", "b2", "c3", "b2", "d4", "c3", "b2");
		
		// distinct --> a1, b2, c3, d4
		// Cách 1: Set.copyOf(elements);
		// Cách 2: 
		var r1 = elements.stream().distinct().toList();
		generate("Distinct R1", r1);
		
		var r2 = elements.stream().collect(Collectors.toSet());
		generate("Distinct R2", r2);
		
		// unique   --> a1, d4
		// Cách 1: Thủ công Map<String, Integer>
		// K: giá trị của phần tử trong elemennts
		// V: số lần xuất hiện của phần tử đó trong elements
		// [{a1, 1}, {b2, 3}, {c3, 2}, {d4, 1}]
		
		// [{a1, 1}, {b2, 3}, {c3, 2}, {d4, 1}]
		Map<String, Integer> r3 = new HashMap<>();
		elements.forEach(element -> {
			if (!r3.containsKey(element)) {
				r3.put(element, 1);
			} else {
				r3.put(element, r3.get(element) + 1);
			}
		});
		
		var r4 = r3.entrySet().stream()
				.filter(e -> e.getValue() == 1)
				.map(Entry::getKey)
				.collect(Collectors.toSet()); // HashSet
		System.out.println("r4 runtime --> " + r4.getClass());
		generate("Unique R4", r4);
		
		// element -> element
		// --> Ex01Filtering::self
		// --> Ex01Filtering.self() --> Function.identity()
		
		var r5 = elements.stream()
					.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
					.entrySet().stream()
					.filter(e -> e.getValue() == 1)
					.map(Entry::getKey)
					.collect(Collectors.toCollection(TreeSet::new));
		generate("Unique R5", r5);
		
		System.out.println("\n========== Distinct By Key/Prop ==========");
		// distinct dishes by Kind
		var dishes = DataModel.getDishes();
		
		generate("Distinct Dishes by Kind", distinctBy(dishes, Dish::getKind));
		
		var apples = DataModel.getApples();
		generate("Distinct Apples by Origin", distinctBy(apples, Apple::getOrigin));
		
	}
	
	public static <E, R> List<E> distinctBy(List<E> elements, Function<E, R> function) {
		var existing = new HashSet<R>();
		return elements.stream()
			.filter(dish -> existing.add(function.apply(dish)))
			.toList();
	}
	
	public static String self(String e) {
		return e;
	}
	
	public static Function<String, String> self() {
		return e -> e;
	}
	
}
