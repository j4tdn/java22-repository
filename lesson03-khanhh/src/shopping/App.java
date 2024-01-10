package shopping;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class App {
	
	public static void main(String[] args) {
		Customer c1 = new Customer("kh1", "adam", "123", "newyork");
		Customer c2 = new Customer("kh2", "kata", "243", "california");
		
		Item i1 = new Item("ss10+", "android", "black", 620);
		Item i2 = new Item("ss20u", "android", "green", 840);
		Item i3 = new Item("ip4", "ios", "white", 280);
		Item i4 = new Item("ip12", "ioa", "black", 880);
		Item i5 = new Item("wp8", "windowPhone", "blue", 560);
		
		ItemDetail[] ids1 = new ItemDetail[] {
				new ItemDetail(i1,  3),
				new ItemDetail(i4,  5),
				new ItemDetail(i2,  1)
		};
		Order o1 = new Order(c1, ids1, LocalDateTime.of(2024, 1, 9, 10, 10, 10));
		
		ItemDetail[] ids2 = new ItemDetail[] {
				new ItemDetail(i3,  2),
				new ItemDetail(i5,  1),
		};
		Order o2 = new Order(c2, ids2, LocalDateTime.of(2024, 1, 9, 11, 11, 11));
		
		ItemDetail[] ids3 = new ItemDetail[] {
				new ItemDetail(i4,  1)
		};
		Order o3 = new Order(c2, ids3, LocalDateTime.of(2024, 1, 9, 22, 22, 22));
		
	    System.out.println("order 1: " + OrderUtils.export(o1)); 
	    System.out.println("order 2: " + OrderUtils.export(o2)); 
	    System.out.println("order 3: " + OrderUtils.export(o3)); 
	}

}
