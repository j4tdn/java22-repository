package view.stream.working;

import java.util.List;

import bean.Dish;
import model.DataModel;

public class Ex06Reducing {

	public static void main(String[] args) {

		var numbers = List.of(1,7,2,8,4,13,432,6);
		
		int sum = numbers.stream().reduce(0, Integer::sum);
		
		
		int max = numbers.stream().reduce(Integer.MIN_VALUE, Integer::max);
		System.out.println("max -->" + max);
		
		
		int min = numbers.stream().reduce(Integer.MAX_VALUE, Integer::min);
		System.out.println("min -->" + min);
				
		var dishes = DataModel.getDishes();
		
		double maxCalories = dishes.stream()
				.map(Dish::getCalories)
				.reduce(Double.MIN_VALUE, Double::max);
		System.out.println("max dish calories -->" + maxCalories);
	}

}
