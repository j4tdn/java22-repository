package view;

import java.util.ArrayList;
import java.util.List;

import bean.Apple;
import functional.ApplePredicate;
import model.DataModel;

import static 

public class Ex01AppleView {
	public static void main(String[] args) {
		List<Apple> inventory = DataModel.getApples();
		
		// using anonymous class
		var greenApples = filter(inventory, new ApplePredicate() {
			
			@Override
			public boolean test(Apple apple) {				
				return "green".equalsIgnoreCase(apple.getColor());
			}
		});
		
		// using lambda
		var weightApples = filter(inventory, apple -> apple.getWeight() > 150);
		
	}
	private static List<Apple> filter(List<Apple> inventory, ApplePredicate predicate){
		List<Apple> result = new ArrayList<>();
		for (Apple apple: inventory) {
			if (predicate.test(apple)) {
				result.add(apple);
			}
		}
		return result;
	}

}
