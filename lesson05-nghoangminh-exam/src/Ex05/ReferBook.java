package Ex05;

public class ReferBook {
	
	private String bookID;
    private double price;
    private String publisher;
    private double taxRate;
    
	public ReferBook(String bookID, double price, String publisher, double taxRate) {
		super();
		this.bookID = bookID;
		this.price = price;
		this.publisher = publisher;
		this.taxRate = taxRate;
	}

	public String getBookID() {
		return bookID;
	}

	public void setBookID(String bookID) {
		this.bookID = bookID;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public double getTaxRate() {
		return taxRate;
	}

	public void setTaxRate(double taxRate) {
		this.taxRate = taxRate;
	}
    
    
}
