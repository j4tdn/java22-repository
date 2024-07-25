package view.stream.working;

import java.util.TreeSet;
import java.util.stream.Collectors;

import bean.Dish;
import bean.Tuple;
import model.DataModel;

import static utils.PrintUtils.*;

public class Ex03Mapping {
	public static void main(String[] args) {
		
		//
		
		var dishes = DataModel.getDishes();
		
		generate("1. Liet ke ca danh sach khong trung nhau ",
			dishes.stream()
				.map(Dish::getName)
				.collect(Collectors.toSet()) );
		
		generate(
			"2. Liet ke ten, calo cua cac dish",
			dishes.stream()
				.map(d -> new Tuple<>(d.getName(), d.getCalories()))
				.toList()
				);
		
	}
}
