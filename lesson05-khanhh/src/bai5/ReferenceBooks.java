package bai5;

public class ReferenceBooks extends Book{
	
	private double tax;
	
	public ReferenceBooks() {
	}

	public ReferenceBooks(String id, double price, String publisher, double tax) {
		super(id, price, publisher);
		this.tax = tax;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}
	
	

}
