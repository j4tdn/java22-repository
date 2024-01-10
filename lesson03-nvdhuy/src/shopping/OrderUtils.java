package shopping;

import java.time.LocalDate;
import java.time.Month;

public class OrderUtils {
	public double export(Order order) {
		double totalOfMoney = 0;
		
		ItemDetail[] ids = order.getItemDetails();
		for (ItemDetail id: ids) {
			Item item = id.getItem ();
			int quantity = id.getQuantity();
			double idCost = item.getCost()* quantity;
			if(item.getCost()> 590 && LocalDate.of(2021, Month.MAY, 8).isEqual(getOrderDate().toLocalDate())) {
					idCost *=0.9;
			}
			
			
			totalOfMoney += item.getCost() * quantity;
		}
		
		return totalOfMoney;
	
		
	}

	private Object getOrderDate() {
		// TODO Auto-generated method stub
		return null;
	}

}
