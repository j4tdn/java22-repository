package Ex01;

import java.time.LocalDate;

public class OrderStatic {

	public static double export(Order on) {
		double totalOfMoney = 0;
		
		ItemDetail[] ids = on.getItemDetails();
		for (ItemDetail id : ids ) {
			Item item = id.getItem();
			int quantity = id.getQuantity();
			double idCost = item.getCost() * quantity;
			
			if(item.getCost() > 590 && LocalDate.of(2021, 5, 8).isEqual(on.getOrderDate().toLocalDate())) {
				idCost *= 0.9;
			}
			totalOfMoney += idCost;
			
		}
		return totalOfMoney;
		
		
		
	}

}
