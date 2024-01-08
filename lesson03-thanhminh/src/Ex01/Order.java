package Ex01;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Arrays;

public class Order {
	private Customer customer;
	private ItemDetail[] iteamDetails;
	private LocalDateTime orderDate;
	
	public Order() {
	
	}

	public Order(Customer customer, ItemDetail[] iteamDetails, LocalDateTime orderDate) {
		super();
		this.customer = customer;
		this.iteamDetails = iteamDetails;
		this.orderDate = orderDate;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public ItemDetail[] getIteamDetails() {
		return iteamDetails;
	}

	public void setIteamDetails(ItemDetail[] iteamDetails) {
		this.iteamDetails = iteamDetails;
	}

	public LocalDateTime getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDateTime orderDate) {
		this.orderDate = orderDate;
	}

	@Override
	public String toString() {
		return "Order [customer=" + customer + ", iteamDetails=" + Arrays.toString(iteamDetails) + ", orderDate="
				+ orderDate + "]";
	}

	public double export() {
		double totalOfMoney = 0;
		
		ItemDetail[] ids = getIteamDetails();
		 for(ItemDetail id : ids) {
			 Item item = id.getItem();
			 int quantity = id.getQuantity();
			 double idCost = item.getCost() * quantity;
			 if (item.getCost() > 590 && LocalDate.of(2021, Month.MAY, 8).isEqual(getOrderDate().toLocalDate())) {
				 idCost *= 0.9;
			 }
			 totalOfMoney += idCost;
		 }
		return totalOfMoney;
	}

}
