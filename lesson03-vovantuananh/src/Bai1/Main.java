package Bai1;

import java.time.LocalDateTime;

public class Main {
	public static void main (String[] args) {
		Customer c1 = new Customer("KH1", "Adam", "123", "DongHa");
		Customer c2 = new Customer("KH2", "Bdam", "456", "HaDa");
		
		Item i1 = new Item("SS1", "Android", "Black", 600d);
		Item i2 = new Item("SS2", "Android", "Blue", 800d);
		Item i3 = new Item("SS3", "IOS", "White", 900d);
		Item i4 = new Item("SS4", "IOS", "Black", 400d);
		Item i5 = new Item("SS5", "WindowPhone", "Green", 500d);
		
		Order o1 = new Order(c1,new ItemDetail[] {
				new ItemDetail(i1,3), 
				new ItemDetail(i4,5), 
				new ItemDetail(i2,1)
				}, LocalDateTime.of(2024, 7, 1, 11, 55, 37) );
		
		Order o2 = new Order(c1,new ItemDetail[] {
				new ItemDetail(i3,2), 
				new ItemDetail(i5,1)
		}, LocalDateTime.of(2024, 7, 1, 11, 55, 37) );
		
		Order o3 = new Order(c1,new ItemDetail[] {
				new ItemDetail(i2,1) 
		}, LocalDateTime.of(2024, 7, 1, 11, 55, 37) );
		
		System.out.println("Gia cua Order 1: " + o1.export());
		System.out.println("Gia cua Order 2: " + o2.export());
		System.out.println("Gia cua Order 3: " + o3.export());
	}
}
