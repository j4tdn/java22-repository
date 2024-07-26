package view;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

import bean.Apple;
import functional.QuadFunction;

public class Ex04ConsTructorReference {
	/*
	 Function Interface, tạo 1 đối tượng cho functional interface thì
	 --> Implementation Class -> Anonymous Class -> Anonymous Function(Lambda)
	 --> Method Reference
	 --> Constructor Reference
	 Lambda mà có body và return đang gọi đến hàm khởi tạo(0/N tham số) của class nào đó 
	 */
	public static void main(String[] args) {
		// empty constructor
		Supplier<Apple> supplier = () -> {
			return new Apple();
		};
		supplier = () -> new Apple();
		supplier = Apple::new;
		supplier.get();
		
		// one attributes constructor
		Function<Integer, Apple> function = new Function<Integer, Apple>() {
			
			public Apple apply(Integer id) {
				return new Apple(id);
			};
		};
		function = id -> new Apple(id);
		function = Apple::new;
		Apple apple = function.apply(22);
		System.out.println("apple -> " + apple);
		
		// two attributes constructor
		BiFunction<Integer, String, Apple> biFunction = (id, color) -> {
			return new Apple(id, color);
		};
				
		biFunction = (id, color) -> new Apple(id, color);
				
		biFunction = Apple::new;
		
		QuadFunction<Integer, String, Double, String, Apple> quadFunction = new QuadFunction<>() {
			@Override
			public Apple apply(Integer id, String color, Double weight, String origin) {
				return new Apple(id, color, weight, origin);
			}
		};
		
		quadFunction = Apple::new; 
	}

}
