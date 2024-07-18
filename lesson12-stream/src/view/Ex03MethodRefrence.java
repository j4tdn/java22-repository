package view;

import static utils.PrintUtils.generate;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

import bean.Apple;
import model.DataModel;

public class Ex03MethodRefrence {
	/*
	 *Method Refrence là cách viết ngắn gọn để thay thế cho lambda Expression trong  1 vài trường hợp
	 *có 2 cách để tạo từ lambda
	 *+ sử dụng  static method refrence
	 *--> khi phần thực thi của lamda dài
	 *+ sử dụng non static method refrence
	 */
	public static void main(String[] args) {
		List<Apple> inventory = DataModel.getApples();
		
		// using anonymuos class
		//var greenApple = filterApples(inventory,a->"Green".equals(a.getColor()) );
		var greenApple = filterApples(inventory, Apple::isGreen );
		generate("1.",greenApple);
		// using lamda
		//var wieghtApple = filterApples(inventory, a -> a.getWeight()>30);
		var wieghtApple = filterApples(inventory, Apple::heavierThan30);
		generate("2.",wieghtApple);
		
		//wieghtApple.sort((a1, a2)-> a1.getWeight().compareTo(a2.getWeight()));
		//wieghtApple.sort(Comparator.comparing(a->a.getWeight()));
		wieghtApple.sort(Comparator.comparing(a->a.getWeight(), Comparator.reverseOrder()));
		generate("2.2", wieghtApple);
		
		System.out.println("");
		//greenApple.forEach(a->System.out.println(a));
		greenApple.forEach(System.out::println);
	}
	
	public static List<Apple> filterApples(List<Apple> inventory, Predicate<Apple> behavior){
		List<Apple> result = new ArrayList<>();
		for (Apple apple: inventory) {
			if(behavior.test(apple)) {
				result.add(apple);
			}
		}
		return result;
	}
	
}
