package shopping;

import java.time.LocalDate;
import java.time.Month;

public class OrderUtils {
	private OrderUtils() {
	}
	
	public static double export(Order order) {
		double totolOfMoney = 0;
		
		ItemDetail[] ids = order.getItemDetails();
		
		for (ItemDetail id : ids) {
			Item item = id.getItem();
			int quantity = id.getQuantity();
			
			double idCost = item.getCost();
			if(item.getCost() > 590 && LocalDate.of(2023, Month.APRIL, 10).isEqual(order.getOrderDate().toLocalDate())) {
				idCost *= 0.9;
			}else {
			    totolOfMoney += idCost;
			}
		}
		return totolOfMoney;
	}
}
