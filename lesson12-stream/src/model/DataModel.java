package model;

import java.util.List;

import bean.Apple;
import bean.Dish;
import common.Kind;

public class DataModel {
	private DataModel() {
		
	}
	
	public static List<Dish> getDishes(){
		return List.of(
				new Dish("1", "D1", 413d,Kind.EGG, false),
				new Dish("2", "D2", 400d, Kind.OTHER, true),
				new Dish("3", "D3", 150d,Kind.FISH, false),
				new Dish("4", "D4", 342d,Kind.FISH, false),
				new Dish("5", "D5", 66d,Kind.FISH, false),
				new Dish("6", "D6", 1003d,Kind.FISH, false),
				new Dish("7", "D7", 87d,Kind.FISH, false),
				new Dish("8", "D8", 109d,Kind.FISH, false)
				);
				
	}

	public static List<Apple> getApples(){
		
		return List.of(
				new Apple(1, "Red", 22d, "Da Nang"),
				new Apple(1, "Red", 18d, "Da Nang"),
				new Apple(1, "Green", 42d, "Quang Nam"),
				new Apple(1, "Red", 342d, "America"),
				new Apple(1, "Red", 66d, "Quang Tri"),
				new Apple(1, "Green", 33d, "Da Nang"),
				new Apple(1, "Red", 87d, "Bac Ninh"),
				new Apple(1, "Yellow", 10d, "Da Nang")
				
				);
				
		
	}
}
