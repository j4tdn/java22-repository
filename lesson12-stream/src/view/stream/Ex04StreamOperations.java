package view.stream;

import java.util.stream.Collectors;

import bean.Dish;
import model.DataModel;

public class Ex04StreamOperations {

	public static void main(String[] args) {

		
		var dishes = DataModel.getDishes();
		
		String names = dishes.stream()
		.filter(d -> {
			System.out.println("filter ->" + d);
			return d.getCalories() > 300;
		})
		.map(d -> {
			System.out.println("map ->" + d + " \n" );
			return d.getName();
		})
		.limit(3)
		.collect(Collectors.joining(", "));
		
		System.out.println("=== Finished ===" + names);
	}

}
