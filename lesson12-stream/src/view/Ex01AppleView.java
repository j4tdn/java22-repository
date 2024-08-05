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
		var greenApple = filter(inventory, new ApplePredicate() {
			
			@Override
			public boolean test(Apple apple) {
				return "green".equals(apple.getColor());
			}
		});
		
		// using lambda
		var weightApple = filter(inventory, apple -> apple.getWeight() > 30);
		
		generate("1st : find all green apples in his inventory", greenApple);
		
		generate("3nd : find all weight apples heavies 30 g", weightApple);
	}
	
	private static List<Apple> filter(List<Apple> inventory, ApplePredicate predicate){
		List<Apple> result = new ArrayList<>();
		for(Apple apple: inventory) {
			if(predicate.test(apple)) {
				result.add(apple);
			}
		}
		return result;
	}
	
}
