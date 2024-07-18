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
	 Method Reference là cách viết ngắn gọn để thay thế cho Lambda Expression trong 1 vài trường hợp
	 Có 2 cách để tạo ra method reference từ lambda
	 
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

		// var greenApples = filter(inventory, apple -> "green".equalsIgnoreCase(apple.getColor()));
		// var greenApples = filter(inventory, apple -> Ex03MethodReference.isGreen(apple));
		
		var greenApples = filter(inventory, Apple::isGreen);
		generate("1st : find all green apples in his inventory", greenApples);

		var weightApples = filter(inventory, Apple::heavierThan30);
		generate("3rd: find all apples heavier than 30 g", weightApples);
		
		// weightApples.sort((a1, a2) -> a1.getWeight().compareTo(a2.getWeight()));
		// weightApples.sort(Comparator.comparing(a -> a.getWeight()));
		weightApples.sort(Comparator.comparing(Apple::getWeight, Comparator.reverseOrder()));
		generate("3rd: find all apples heavier than 30 g(sorted)", weightApples);
		
		System.out.println("====");
		greenApples.forEach(System.out::println);
	}
	
	private static List<Apple> filter(List<Apple> inventory, Predicate<Apple> predicate) {
		List<Apple> result = new ArrayList<>();
		for (Apple apple: inventory) {
			if (predicate.test(apple)) {
				result.add(apple);
			}
		}
		return result;
	}
	
	
	
}
