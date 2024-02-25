package ex05;

public class ReferBook extends Book{
	
	private double taxPercentage;

	public ReferBook(String id, double price, String publisher, double taxPercentage) {
		super(id, price, publisher);
		this.taxPercentage = taxPercentage;
	}
	
	// tính tiền sách tham khảo
	public double caculatePrice() {
		return getPrice() * (1 + taxPercentage / 100);
	}
	

}
