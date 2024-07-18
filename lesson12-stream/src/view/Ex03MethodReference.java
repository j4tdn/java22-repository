package view;

import static utils.PrintUtils.generate;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

import bean.Apple;
import functional.ApplePredicate;
import model.DataModel;

public class Ex03MethodReference {
	
	/*
	 Method Reference là cách viết nngắn gọn để thay thế cho Lambda Expression 
	 trong 1 vài trường  
	 Có 2 cách để tạo ra method reference từ lambda :
	    + Sử dụng static method reference :  khi phần thực thi lambda dài 
	    
	    + Sử dụng non static method reference 
	 
	 
	 */

public static void main(String[] args) {
		
		List<Apple> inventory = DataModel.getApples();
		
		//var greenApples = filter(inventory, apple -> "green".equalsIgnoreCase(apple.getColor()));
			
		var greenApples = filter(inventory, Ex03MethodReference::isGreen);
		generate("1st : find all green apples in his inventory", greenApples);
		
		//Using lambda
		
		var weightApples = filter(inventory, Apple::heavierThan30);

		generate("3st : find all green apples heavier than 30g", weightApples);

		//weightApples.sort((a1,a2) -> a1.getWeight().compareTo(a2.getWeight()));

		//weightApples.sort(Comparator.comparing(a -> a.getWeight()));
		weightApples.sort(Comparator.comparing(Apple::getWeight, Comparator.reverseOrder()));
		generate("3st : find all green apples heavier than 30g(sorted", weightApples);
		
		System.out.println("====");
		greenApples.forEach(System.out::println);
		
		Predicate<Apple> predicate = t -> t.getColor().equals("green");


	}
	private static List<Apple> filter(List<Apple> inventory, Predicate<Apple> predicate){
		
		List<Apple> result = new ArrayList<>();
		
		for( Apple apple: inventory) {
			if( predicate.test(apple)) {
				result.add(apple);
			}
		}
		return result;
	}
	private static boolean isGreen(Apple apple) {
		return "green".equalsIgnoreCase(apple.getColor());
		
	}

}
