package view.stream.working;

import model.DataModel;

import static utils.PrintUtils.*;

import java.util.stream.Collectors;

import bean.Dish;
import bean.Tuple;

public class Ex03Mapping {
	/*
	 Yêu cầu: Cho danh sách các dishes
	 1. Lấy ra tên của các dish --> ko trung nhau
	 2. Lấy ra cặp tên và calories của các dish
	 */
	public static void main(String[] args) {
		var dishes = DataModel.getDishes();
		generate("1. Liệt kê tên của các dish không trùng nhau", 
				dishes.stream()  // Stream<Dish>
				.map(Dish::getName) // Stream<Dish>
				.collect(Collectors.toSet())); // Set<String>
		generate("2. Liệt kê tên, calo của các dish ", 
				dishes.stream()  // Stream<Dish>
				.map(d -> new Tuple<>(d.getName(), d.getCalories())) // Stream<Tuple>
				.toList()); // List<Tuple>
	}

}
