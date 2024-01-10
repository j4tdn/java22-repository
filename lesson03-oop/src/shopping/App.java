package shopping;

import java.time.LocalDateTime;

public class App {
	public static void main(String[] args) {
		
		
		Customer c1 = new Customer("KH01","Adam","123","NewYork");
		Customer c2 = new Customer("KH02","Kate","223","Ohio");
		
		Item i1 = new Item("SS10+","Android","Black",620);
		Item i2 = new Item("IP14+","IOS","White",540);
		Item i3 = new Item("SS20 Ultra","Android","Green",1220);
		Item i4 = new Item("IP15","IOS","Pink",940);
		
		Order o1 = new Order(c1, new ItemDetail[] {
				new ItemDetail(i1,3),
				new ItemDetail(i4,5),
				new ItemDetail(i2,1)

		}, LocalDateTime.of(2024, 1, 9, 10, 10, 10));
			
		Order o2 = new Order(c2, new ItemDetail[] {
				new ItemDetail(i3,3),
				new ItemDetail(i4,1)

		}, LocalDateTime.of(2024, 1, 8, 13, 12, 10));
		Order o3 = new Order(c2, new ItemDetail[] {
				new ItemDetail(i4,2)

		}, LocalDateTime.of(2024, 1, 9, 21, 20, 50));
		
		System.out.println("Order 1: " + OrderUtils.export(o1));
		System.out.println("Order 2: " + OrderUtils.export(o2));
		System.out.println("Order 3: " + OrderUtils.export(o3));
	}
}
