package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import bean.Item;

public class DataModel {

	private DataModel() {
	}
	
	//non-null data
	public static Item[] mockItems() {
		return new Item[] {
				new Item(1, "Item A1", 222D, of("16/05/2024")),
				new Item(8, "Item C8", 18D, of("12/05/2024")),
				new Item(2, "Item B2", 222D, of("15/05/2024")),
				new Item(4, "Item K4", 222D, of("18/05/2024")),
				new Item(10, "Item Z19", 77D, of("30/08/2024")),
				new Item(18, "Item T18", 22D, of("27/01/2024")),
				new Item(32, "Item A32", 333D, of("22/02/2024")),
				new Item(7, "Item Y7", 432D, of("11/01/2023"))
				
		};
	}
	public static Item[] mockItemsWithNullObjects() {
		return new Item[] {
				null,
				null,
				new Item(1, "Item A1", 222D, of("16/05/2024")),
				new Item(8, "Item C8", 18D, of("12/05/2024")),
				new Item(2, "Item B2", 222D, of("15/05/2024")),
				null,
				new Item(4, "Item K4", 222D, of("18/05/2024")),
				new Item(10, "Item Z19", 77D, of("30/08/2024")),
				null,
				null,
				null,
				new Item(18, "Item T18", 22D, of("27/01/2024")),
				new Item(32, "Item A32", 333D, of("22/02/2024")),
				new Item(7, "Item Y7", 432D, of("11/01/2023"))
				
		};
	}
		public static Item[] mockItemsWithNullAttributes() {
			return new Item[] {
					new Item(1, "Item A1", null, of("16/05/2024")),
					null,
					new Item(8, "Item C8", 18D, null),
					new Item(2, "Item B2", 222D, of("15/05/2024")),
					new Item(4, "Item K4", 222D, of("18/05/2024")),
					null,
					new Item(10, "Item Z19", 77D, of("30/08/2024")),
					new Item(18, "Item T18", 22D, of("27/01/2024")),
					new Item(32, "Item A32", 333D, of("22/02/2024")),
					new Item(7, "Item Y7", 432D, of("11/01/2023"))
					
			};
		}
	
	
	public static LocalDate of(String dataAsString) {
		return LocalDate.parse(dataAsString, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
	}
}
