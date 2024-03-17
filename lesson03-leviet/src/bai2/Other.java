package bai2;

public class Other {
   private Customer customer;
   private Item item;
   
   public Other() {
	   
   }

public Other(Customer customer, Item item) {
	super();
	this.customer = customer;
	this.item = item;
}

public Customer getCustomer() {
	return customer;
}

public void setCustomer(Customer customer) {
	this.customer = customer;
}

public Item getItem() {
	return item;
}

public void setItem(Item item) {
	this.item = item;
}

@Override
public String toString() {
	return "Other [customer=" + customer + ", item=" + item + "]";
}
   public double export() {
	   double a = 0;
	   double b = 0;
	   double c = 0;
	   b = item.getXylanh();
	   c = item.getValue();
	   
	   if (b < 100 ) {
		   a = c * 0.01;
	   }else if (b >= 100 && b <= 200) {
		   a = c * 0.03;
	   }else {
		   a = c * 0.05;
	   }
	   return a;
   }
}
