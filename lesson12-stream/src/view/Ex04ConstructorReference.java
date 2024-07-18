package view;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

import bean.Apple;
import functional.QuadFunction;

public class Ex04ConstructorReference {

	public static void main(String[] args) {
		
		//Empty constructor

	Supplier<Apple> supplier = 	() -> new Apple();
	
	supplier = 	() -> new Apple();
	
	supplier = Apple::new;
	
	supplier.get();
	
	// One attribute constructor
	Function<Integer, Apple> function = id -> new Apple(id);
    	
	function = Apple::new;
	Apple apple = function.apply(22);
	System.out.println("Apple ->" + apple);
	
	// Two attibutes constructor
	
	BiFunction<Integer, String, Apple> biFunction = (id, color) -> {
		return new Apple(id, color);
	};
	
	biFunction = (id,color) -> new Apple(id,color);
	
	biFunction = Apple::new;
	
	// 
	
	
	QuadFunction<Integer, String, Double, String, Apple> quadFunction = new QuadFunction<>() {
		@Override
		public Apple apply(Integer id, String color, Double weight, String origin) {
			return new Apple(id, color, weight, origin);
		}
	};
	quadFunction = Apple::new;
	
	}
}
