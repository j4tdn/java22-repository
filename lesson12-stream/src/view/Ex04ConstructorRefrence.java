package view;

import java.awt.geom.QuadCurve2D;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

import bean.Apple;
import functional.QuadFuntion;

public class Ex04ConstructorRefrence {
	
	public static void main(String[] args) {
		
		Supplier<Apple> supplier = new Supplier<Apple>() {
			
			@Override
			public Apple get() {
				// TODO Auto-generated method stub
				return null;
			}
		};
//		Supplier<Apple> supplier = ()->{
//			return new Apple();
//		};
//		 supplier = () ->  new Apple();
//		 supplier = Apple::new;
		 supplier.get();
		 
		 
//		 Function<Integer, Apple>  function = new Function<Integer, Apple>() {
//			 
//			 @Override
//			 public Apple apply(Integer t) {
//				 return new Apple(t);
//			 }
//		 };
//		 Function<Integer, Apple>  function = (id)-> {
//				 return new Apple(id);
//		 };
		 Function<Integer, Apple>  function = Apple::new;
		 Apple apple = function.apply(22);
		 System.out.println(apple);
		  
		 BiFunction<Integer, String, Apple> bifunction = Apple::new;
		 apple = bifunction.apply(22, "red");
		 System.out.println(apple);
		 
		 QuadFuntion<Integer, String, Double, String, Apple> quadfunction = Apple::new;
		 apple = quadfunction.apply(22, "red", 22d, "Quang Tri");
		 System.out.println(apple);
	}
	
}