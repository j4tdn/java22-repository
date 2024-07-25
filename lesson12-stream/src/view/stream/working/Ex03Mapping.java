package view.stream.working;

import model.DataModel;
import static utils.PrintUtils.*;

import java.util.stream.Collectors;

import bean.Dish;
import bean.Tuple;

public class Ex03Mapping {
	
	//Cho danh sach cac dishes
	//1. Lay ra ten cua cac dish --> ko trung nhau
	//2. Lay ra cặp tên và calories của các dish 

	public static void main(String[] args) {
		
		var dishes = DataModel.getDishes();
		
		generate("1. Liet ke ten cac dish ko trung nhau ",
				dishes.stream()
				.map(Dish::getName)
			
				.collect(Collectors.toSet()));
		
		generate("1. Liet ke ten cac dish va calo  ",
				dishes.stream()
				//.map(d -> new Tuple<>(d.getName(), d.getCalories()))
				.collect(Collectors.toList()));
			

	}

}
