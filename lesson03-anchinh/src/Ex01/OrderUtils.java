package Ex01;

import java.time.LocalDate;
import java.time.Month;

public class OrderUtils {
	
	private OrderUtils() {
	}
	// o1, o2, o3
		public static double export(Order order) {
			double totalOfMoney = 0;			
			ItemDetail[] ids = order.getItemDetails();
			//for each
			for(ItemDetail id : ids) { //duyệt từng phần tử
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

//for index
//			for (int i = 0; i < ids.length; i++) { //quan tâm chỉ số của mảng
//				ItemDetail id = ids[i]; 
