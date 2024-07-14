package model;

import java.util.List;

import bean.Apple;

public class DataModel {
	private DataModel() {
		
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
