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
		
		// using anonymuos class
		var greenApple = filterApples(inventory, new ApplePredicate() {
			
			@Override
			public boolean test(Apple a) {
				return "Green".equals(a.getColor());
			}
		});
		generate("1.",greenApple);
		// using lamda
		var wieghtApple = filterApples(inventory, a -> a.getWeight()<150);
		generate("2.",wieghtApple);
		
	}
	public static List<Apple> filterApples(List<Apple> inventory, ApplePredicate behavior){
		List<Apple> result = new ArrayList<>();
		for (Apple apple: inventory) {
			if(behavior.test(apple)) {
				result.add(apple);
			}
		}
		return result;
	}
	
}
