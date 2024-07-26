package view;

import java.util.ArrayList;
import java.util.List;

import bean.Apple;
import functional.ApplePredicate;
import model.DataModel;

import static utils.PrintUtils.*; 

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
		generate("1st: find all green apples in his inventory", greenApples);
		// using lambda
		var weightApples = filter(inventory, apple -> apple.getWeight() > 30);
		
		generate("3rd: find all apples heavier than 30g", weightApples);
		
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
