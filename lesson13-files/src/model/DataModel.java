package model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import bean.Item;

public class DataModel {
	
	private static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	private DataModel() {
		
	}
	
	public static List<Item> getItems(){
		return List.of(
			new Item(1, "Item A1", bd("100"), of("12/02/2024")),
			new Item(2, "Item A2", bd("200"), of("12/03/2024")),
			new Item(3, "Item A3", bd("300"), of("12/04/2024")),
			new Item(4, "Item A4", bd("400"), of("12/05/2024")),
			new Item(5, "Item A5", bd("500"), of("12/06/2024")),
			new Item(6, "Item A6", bd("600"), of("12/07/2024"))
		);
	}
	
	private static BigDecimal bd(String bdAsText) {
		return new BigDecimal(bdAsText);
	}
	
	private static LocalDate of(String dataAsText) {
		return LocalDate.parse(dataAsText, dtf);
	}
	
}
