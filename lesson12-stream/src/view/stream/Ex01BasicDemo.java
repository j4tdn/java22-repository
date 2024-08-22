package view.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import bean.Dish;
import common.Kind;
import model.DataModel;

import static utils.PrintUtils.*;

public class Ex01BasicDemo {
	
	public static void main(String[] args) {
		
		List<Dish> dishes = DataModel.getDishes();
		
		generate(
			"1. Get dishes which have calories > 250", 
			finding(dishes, d -> d.getCalories() > 250)
		);
		
		// Thay vì tự viết ra hàm xử lý, làm quen các functions hỗ trợ sẵn trong stream
		
		// -> Từ KDL(danh sách(array, list, set, map, collection, file)) 
		// -> chuyển sang stream
		// -> gọi các hàm trong stream để xử lý
		// -> trả kết quả ra 1 KDL khác(ko lưu lại trong stream ???)
		
		List<Dish> dishesWithHightCalories = dishes.stream() // Stream<Dish>
			.filter(d -> d.getCalories() > 250) // Stream<Dish>
			.collect(Collectors.toList()); // List<Dish>
		
		generate(
			"1. Get dishes which have calories > 250(using stream)", 
			dishesWithHightCalories
		);
		
		List<Dish> veggieDishes = dishes.stream() // Stream<Dish>
			.filter(Dish::getIsVeggie) // Stream<Dish>
			.collect(Collectors.toList()); // List<Dish>
		
		generate(
			"1. Get veggie dishes(using stream)", 
			veggieDishes
		);
		
		generate(
			"2. Get kind of dishes", 
			getFieldOfObjects(dishes, Dish::getKind)
		);
		
		Set<Kind> kinds = dishes.stream()
			.map(d -> d.getKind())
			.collect(Collectors.toSet());
		
		generate(
			"2. Get kind of dishes(unique, using stream)", 
			kinds
		);
		
		generate(
			"3. Get name of dishes which have calories > 350", 
			findingAndGet(dishes, d -> d.getCalories() > 350, d -> d.getName())
		);
		
		generate(
			"3. Get name of dishes which have calories > 350(using stream)", 
			dishes.stream()
				.filter(d -> d.getCalories() > 350) // Stream<Dish>
				.map(d -> d.getName())        // Stream<String>
				.collect(Collectors.toList()) // List<E>
		);
		
		Map<String, Integer> models = DataModel.getModels();
		generate("4. Data of models", models);
		
		// Stream<E> 1,A 1,B 2,C
		
		// map -> set -> list -> sort -> map
		// map -> set -> stream -> sort -> map
		Map<String, Integer> sortedModels = models.entrySet() // Set<Entry<K, V>>
			.stream()    // Stream<Entry<K, V>>
			//.sorted((e1, e2) -> e1.getValue().compareTo(e2.getValue())) // Stream<Entry<K, V>>
			.sorted(Comparator.comparing(Entry::getValue, Comparator.reverseOrder()))
			.collect(Collectors.toMap(Entry::getKey, Entry::getValue, (v1, v2) -> v2, LinkedHashMap::new)); // Map<K, V>
		generate("4. Sorted data of models", sortedModels);
		
		// List<E>    --> Stream<E>
		// Set<E>     --> Stream<E>
		// Map<K, V>  --> Set<Entry<K, V>> --> Stream<Entry<K, V>
		
		// use stream methods --> filter, map, sorted
		
		// collect(Collectors.toList())
		// collect(Collectors.toSet())
		// collect(Collectors.toMap(....))
		
	}
	
	private static <E, R> List<R> findingAndGet(
			List<E> elements, Predicate<E> predicate, Function<E, R> function) {
		List<R> result = new ArrayList<>();
		for (E e: elements) {
			if (predicate.test(e)) {
				result.add(function.apply(e));
			}
		}
		return result;
	}
	
	// T, R
	// dish -> name
	// dish -> id
	// dish -> kind
	// item -> salesPrice
	// manually
	private static <T, R> List<R> getFieldOfObjects(List<T> data, Function<T, R> function) {
		List<R> result = new ArrayList<>();
		for (T t: data) {
			result.add(function.apply(t));
		}
		return result;
	}
	
	// dish -> boolean
	// manually
	private static <E> List<E> finding(List<E> elements, Predicate<E> predicate) {
		List<E> result = new ArrayList<>();
		for (E e: elements) {
			if (predicate.test(e)) {
				result.add(e);
			}
		}
		return result;
	}
	
}