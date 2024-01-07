package bt1_shopping;

import java.time.LocalDate;
import java.time.Month;

public class OrderUtils {
	private OrderUtils() {
		// TODO Auto-generated constructor stub
	}
	public static double export(Order order) {
		double totolOfMoney = 0;
		
		ItemDetail[] ids = order.getItemDetails();
		
		// for index
//		for(int i = 0; i< ids.length; i++) {
//			ItemDetail id = ids[i];
//		}
		
		// for each
		for (ItemDetail id: ids) {
			Item item = id.getItem();
			int quantity = id.getQuantity();
			
			double idCost = item.getCost() * quantity;
			if (item.getCost()>590 && LocalDate.of(2023, Month.MAY, 8).isEqual(order.getOrderDate().toLocalDate())) {
				idCost *= 0.9;
			}else {
				idCost += idCost;
			}
			
			totolOfMoney += item.getCost() * quantity;
		}
		return totolOfMoney;
	}

}
