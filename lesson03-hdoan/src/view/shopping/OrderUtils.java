package view.shopping;

import java.time.LocalDate;
import java.time.Month;

/*
  Utiliti of Order Class
  Nomarlly: Utility is place where contains utility method
  No cares created class's objects
 */

public class OrderUtils {
	
	private OrderUtils() {
		// TODO Auto-generated constructor stub
	}
	
	// o1, o2, o3
	// hàm ko quan tâm đến đối tượng đang gọi nên cho static
	// để hạn chế việc khởi tạo quá nhiều ô nhớ trên heap
	public static double export(Order order) {
		double totalOfMoney = 0;
		ItemDetail[] ids = order.getItemDetails();
		for(ItemDetail id : ids) {
			Item item = id.getItem();
			int quantity = id.getQuantity();
			double idCost = item.getCost() * quantity;
			if(item.getCost() > 590 && LocalDate.of(2021, Month.MAY, 8).isEqual(order.getOrderDate().toLocalDate())) {
				idCost *= 0.9;
			}
			totalOfMoney += idCost;
		}
		return totalOfMoney;
	}
}
