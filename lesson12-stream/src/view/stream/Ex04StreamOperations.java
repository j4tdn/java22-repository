package view.stream;

import java.util.stream.Collectors;

import model.DataModel;

public class Ex04StreamOperations {
	
	public static void main(String[] args) {
		/*
		 Sau khi từ source -> stream
		 	--> gọi các hàm trong stream vẫn trả về stream --> intermediate operation
		 	--> gọi các hàm trong steam trả về KDL khác --> terminal operations
		 	--> terminal operations sẽ không thực thi cho đến khi gọi hàm terminal
		 */
		
		var dishes = DataModel.getDishes();
		
		String names = dishes.stream()
			.filter(d ->{
				System.out.println("filter -> " +d);
				return d.getCalories() > 200;
			})
			.map(d -> {
				System.out.println("map -> " + d);
				return d.getName();
			})
			.limit(3)
			.collect(Collectors.joining(",  "));
		
		System.out.println("======= Finished =======" + names);
	}
	
}
