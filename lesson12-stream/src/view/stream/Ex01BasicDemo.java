package view.stream;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import bean.Dish;
import common.Kind;
import model.DataModel;
import static utils.PrintUtils.*;

public class Ex01BasicDemo {

	public static void main(String[] args) {
		//Get dished which have calories > 250
		
		List<Dish> dishes = DataModel.getDishes();
		
		List<Dish> dishesWithHighCalories = dishes.stream().filter(d -> d.getCalories()> 350)
		.collect(Collectors.toList());
		
		generate( "1. Dishes which have calories > 350",dishesWithHighCalories);

		
		List<Dish> veggieDishes = dishes.stream().filter(Dish::getIsVeggie)
				.collect(Collectors.toList());
		generate( "1. Get veggie dishes",veggieDishes);
		
		//Get name of dishes
		
		Set<Kind> kinds = dishes.stream().map(d -> d.getKind())
		.collect(Collectors.toSet());
		
		generate("2. Get Kind of dishes",kinds);
		
		
		
		generate("3. get name of dishes which have calo > 350",
				dishes.stream()
				.filter(d -> d.getCalories()>350)
				.map(d -> d.getName())
				.collect(Collectors.toList())
	);
		
		Map<String, Integer> models = DataModel.getModel();
		generate("4. Data of models", models);
		
		//map -> set -> list -> sort -> map
		//map -> set -> stream -> sort -> map
		
		Map<String, Integer> sortedModels = models.entrySet()
		.stream()
		.sorted((e1,e2) -> e1.getKey().compareTo(e2.getKey()))
		.collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue(), (v1,v2) -> v2, LinkedHashMap::new));
		
		generate("4. Sorted data of models", sortedModels);
		
		
		
		
		
		
		
	}

}
