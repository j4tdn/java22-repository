package shopping;

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


}