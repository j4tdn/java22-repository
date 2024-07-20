package model;

import java.util.List;

import bean.Apple;
import bean.Dish;
import common.Kind;

public class DataModel {
	public DataModel() {
	}
	
	public static List<Dish> getDishes(){
		return List.of(
				new Dish("1", "D1", 202d, Kind.EGG, false),
				new Dish("2", "D1", 180d, Kind.OTHER, true),
				new Dish("3", "D3", 400d, Kind.EGG, false),
				new Dish("4", "D4", 220d, Kind.FISH, false),
				new Dish("5", "D5", 660d, Kind.MEAT, false),
				new Dish("6", "D6", 202d, Kind.MEAT, false),
				new Dish("7", "D7", 440d, Kind.OTHER, true),
				new Dish("8", "D8", 225d, Kind.EGG, false)
				);
	}
	
	public static List<Apple> getApples(){
		return List.of(
				new Apple(1, "Red", 22d, "Da Nang"),
				new Apple(2, "Red", 18d, "Da Nang"),
				new Apple(3, "Green", 40d, "Quang Nam"),
				new Apple(4, "Red", 22d, "Da Nang"),
				new Apple(5, "Red",66d, "Da Nang"),
				new Apple(6, "Green", 22d, "Quang Tri"),
				new Apple(7, "Red", 44d, "Da Nang"),
				new Apple(8, "Yellow", 22d, "Bac Ninh")
				);
	}
}
