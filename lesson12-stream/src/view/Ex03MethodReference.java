package view;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

import bean.Apple;
import model.DataModel;

import static utils.PrintUtils.*;

public class Ex03MethodReference {

	/*
	  Method reference là cách viết ngắn gọn để thay thế cho Lambda Expression
	  trong 1 vài trường hợp Có 2 cách để tạo ra method reference từ Lambda
	 
	  + sử dụng static method reference 
	  	--> khi phần thực thi của lambda dài
	  + sử dụng non static method reference
	  	--> có 1 số dạng cần học thuộc
	  	
	  Functional Interface, tạo 1 đối tượng cho functional interface thì 
	  --> Implementation Class -> Anonymous Class -> Anonymous Function(Lambda)
	  --> Method Reference	
	 */

	public static void main(String[] args) {

		List<Apple> inventory = DataModel.getApples();

		//var greenApple = filter(inventory, apple -> "green".equals(apple.getColor()));
		//var greenApple = filter(inventory, apple -> Ex03MethodReference.isGreen(apple));
		var greenApple = filter(inventory, Apple::isGreen);
		generate("1st : find all green apples in his inventory", greenApple);
		
		var weightApple = filter(inventory, Apple::heavierThan30);
		generate("3nd : find all weight apples heavies 30 g", weightApple);
		
		//weightApple.sort((a1, a2) -> a1.getWeight().compareTo(a2.getWeight()));
		weightApple.sort(Comparator.comparing(a -> a.getWeight()));
		weightApple.sort(Comparator.comparing(Apple::getWeight, Comparator.reverseOrder()));
		generate("3nd : find all weight apples heavies 30 g(sorted)", weightApple);
		
		System.out.println("=====");
		greenApple.forEach(System.out::println);
	}

	private static List<Apple> filter(List<Apple> inventory, Predicate<Apple> predicate) {
		List<Apple> result = new ArrayList<>();
		for (Apple apple : inventory) {
			if (predicate.test(apple)) {
				result.add(apple);
			}
		}
		return result;
	}
	
	
}
