package Ex01BaiToanMuaHang;

import java.time.LocalDateTime;

public class App {
	public static void main(String[] args) {
		Customer c1 = new Customer("KH1", "Adam", "123", "NewYork");
		Customer c2 = new Customer("KH2", "Kate", "243", "California");
		
		
		Item i1 = new Item("SS10+","Android","Black","620");
		Item i2 = new Item("SS20U", "Android", "Green", "840");
		Item i3 = new Item("IP4", "IOS", "White", "280");
		Item i4 = new Item("IP12", "IOS", "Black", "880");
		Item i5 = new Item("WP8", "WIndowPhone", "Blue", "560");
		
		
		Order o1 = new Order(c1, new ItemDetail[] {
			new ItemDatail(i1,3),
			new ItemDatail(i4, 5),
			new ItemDatail(i2, 1),
		}, LocalDateTime.of(2021, 5, 8, 10, 10, 10 ));
		
		
		Order o2 = new Order(c2, new ItemDetail[] {
			new ItemDatail(i3,2),
			new ItemDatail(i5, 1),			
		}, LocalDateTime.of(2021, 5, 7, 20, 10, 12 ));
		
		Order o3 = new Order(c3, new ItemDetail[] {
			new ItemDatail(i4,1),
		}, LocalDateTime.of(2021, 5, 8, 9, 28, 32 ));
		
		System.out.println("Order 1: " + o1.export());
		System.out.println("Order 2: " + o2.export());
		System.out.println("Order 3: " + o3.export());
	}
}
