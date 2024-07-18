package model;

import java.util.List;

import bean.Apple;

public class DataModel {
	public DataModel() {
		// TODO Auto-generated constructor stub
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
