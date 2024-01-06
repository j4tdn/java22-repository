package Ex01_Shopping;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Arrays;

public class Order {
	private Customer customer;
	private ItemDetail[] itemDetails;
	private LocalDateTime orderDate;

	public Order() {
		// TODO Auto-generated constructor stub
	}



	@Override
	public String toString() {
		return "Order [customer=" + customer + ", itemDetails=" + Arrays.toString(itemDetails) + ", orderDate="
				+ orderDate + "]";
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public ItemDetail[] getItemDetails() {
		return itemDetails;
	}

	public void setItemDetails(ItemDetail[] itemDetails) {
		this.itemDetails = itemDetails;
	}



	public Order(Customer customer, ItemDetail[] itemDetails, LocalDateTime orderDate) {
		this.customer = customer;
		this.itemDetails = itemDetails;
		this.orderDate = orderDate;
	}



	public LocalDateTime getOrderDate() {
		return orderDate;
	}



	public void setOrderDate(LocalDateTime orderDate) {
		this.orderDate = orderDate;
	}

    public double export() {
    	double totalOfMoney = 0;
    	ItemDetail[] ids = getItemDetails();
    	
    	for (ItemDetail id: ids) {
    		Item item = id.getItem();
    		int quantity = id.getQuantity();
    		double idCost = item.getCost()*quantity;
    		if (item.getCost()>590 && LocalDate.of(2024, Month.JANUARY, 6).isEqual(getOrderDate().toLocalDate())) {
    			idCost*=0.9;
    		}
    		totalOfMoney += idCost;
    	}
    	
    	return totalOfMoney;
    	
    }
    public void print(int a) {
    	System.out.println("a: " + a);
    }

}
