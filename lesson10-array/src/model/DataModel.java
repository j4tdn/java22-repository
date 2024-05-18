package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import bean.Item;

public class DataModel {
	private DataModel() {
	}
	
	public static Item[] mockItems() {
		return new Item[] {
				new Item(1, "Item A1", 22D,of("11/02/2021") ),
				new Item(2, "Item Cs", 21D,of("11/02/2021") ),
				new Item(3, "Item F1", 12D,of("11/02/2021") ),
				new Item(4, "Item A4", 23D,of("11/02/2025") ),
				new Item(5, "Item D1", 33D,of("11/02/2021") ),
				new Item(7, "Item B2", 190D, of("15/05/2024")),
				new Item(9, "Item K4", 33D, of("18/05/2024")),
				new Item(10, "Item Z19", 77D, of("30/08/2024")),
				new Item(18, "Item T18", 22D, of("27/01/2024")),
				new Item(32, "Item A32", 33D, of("18/05/2024")),
				new Item(7, "Item Y7", 22D, of("18/05/2024"))
		};
	}
	public static Item[] mockItemsWithNullAtribute() {
		return new Item[] {
				new Item(1, "Item A1", 22D,of("11/02/2021") ),
				new Item(2, null, 21D,of("11/02/2021") ),
				new Item(3, "Item F1", null,of("11/02/2021") ),
				new Item(4, "Item A4", 23D,of("11/02/2025") ),
				new Item(5, "Item D1", 33D,of("11/02/2021") ),
				new Item(7, "Item B2", 190D, of("15/05/2024")),
				new Item(9, "Item K4", null, of("18/05/2024")),
				new Item(10, "Item Z19", 77D, of("30/08/2024")),
				new Item(null, "Item T18", 22D, of("27/01/2024")),
				new Item(32, "Item A32", 33D, of("18/05/2024")),
				new Item(7, "Item Y7", 22D, of("18/05/2024"))
		};
	}
	public static Item[] mockItemsWithNullObjects() {
		return new Item[] {
				new Item(1, "Item A1", 22D,of("11/02/2021") ),
				new Item(2, "Item Cs", 21D,of("11/02/2021") ),
				null,
				null,
				new Item(3, "Item F1", 12D,of("11/02/2021") ),
				new Item(4, "Item A4", 23D,of("11/02/2025") ),
				new Item(5, "Item D1", 33D,of("11/02/2021") ),
				null,
				null,
				null,
				new Item(7, "Item B2", 190D, of("15/05/2024")),
				new Item(9, "Item K4", 33D, of("18/05/2024")),
				new Item(10, "Item Z19", 77D, of("30/08/2024")),
				new Item(18, "Item T18", 22D, of("27/01/2024")),
				new Item(32, "Item A32", 33D, of("18/05/2024")),
				null,
				new Item(7, "Item Y7", 22D, of("18/05/2024"))
		};
	}
	
	
	public static LocalDate of(String dataAssString) {
		return LocalDate.parse(dataAssString, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
	}
}
