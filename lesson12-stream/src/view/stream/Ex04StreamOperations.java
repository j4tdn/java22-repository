package view.stream;

import java.util.stream.Collectors;

import bean.Dish;
import model.DataModel;

public class Ex04StreamOperations {
	/*
	 Sau khi từ source -> stream
	 --> gọi các hàm trong stream vẫn trả về stream --> intermediate operation
	 --> gọi các hàm trong steam trả về KDL khác --> terminal operations
	 --> terminal operations sẽ không thực thi cho đến khi gọi hàm terminal
	 */
	public static void main(String[] args) {
		var dishes = DataModel.getDishes();
		String names = dishes.stream()
		     .filter(d -> {
		    	 System.out.println("filter -> " + d);
		    	 return d.getCalories() > 300;		     
		     })
		     .map(d -> {
					System.out.println("map -> " + d);
					return d.getName();
				})// Stream<String>
		     .limit(3)// Stream<String>
		     .collect(Collectors.joining(",  "));// String
		
		System.out.println("======= Finished =======" + names);
	}

}
