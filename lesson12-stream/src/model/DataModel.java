package model;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import bean.Apple;
import bean.Dish;
import common.Kind;


public class DataModel {
	
	private DataModel() {
		
	}
	
	public static List<Dish> getDishes(){
		return List.of(
				new Dish("1", "D1", 305d, Kind.EGG, false),
				new Dish("2", "D2", 220d, Kind.OTHER, true),
				new Dish("3", "D3", 880d, Kind.EGG, false),
				new Dish("4", "D4", 86d, Kind.FISH, false),
				new Dish("5", "D5", 22d, Kind.MEAT, false),
				new Dish("6", "D6", 707d, Kind.MEAT, false),
				new Dish("7", "D7", 101d, Kind.EGG, false),
				new Dish("8", "D8", 292d, Kind.OTHER, true)
					);
	}
	
	public static Map<String, Integer> getModels() {
		Map<String, Integer> models = new HashMap<>();
		
		models.put("Quảng Nam", 92);
		models.put("Đà Nẵng", 43);
		models.put("Thừa Thiên Huế", 75);
		models.put("Quảng Trị", 74);
		models.put("Quảng Bình", 73);
		return models;
	}
	
	public static List<Apple> getApples(){
		return List.of(
			new Apple(1, "Red", 22d, "Da Nang"),
			new Apple(2, "Red", 18d, "Da Nang"),
			new Apple(3, "Green", 40d, "Quang Nam"),
			new Apple(4, "Red", 22d, "Da Nang"),
			new Apple(5, "Red", 66d, "Da Nang"),
			new Apple(6, "Green", 22d, "Quang Tri"),
			new Apple(7, "Red", 44d, "Da Nang"),
			new Apple(8, "Yellow", 22d, "Bac Ninh")
				);
	}
}
