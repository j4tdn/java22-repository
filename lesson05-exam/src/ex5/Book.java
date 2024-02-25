package ex5;

public class Book {
	private String bookCode;
	private double prices;
	private String publisher;
	
	public Book() {
	}

	public String getBookCode() {
		return bookCode;
	}

	public void setBookCode(String bookCode) {
		this.bookCode = bookCode;
	}

	public double getPrices() {
		return prices;
	}

	public void setPrices(double prices) {
		this.prices = prices;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	@Override
	public String toString() {
		return "Book [bookCode=" + bookCode + ", prices=" + prices + ", publisher=" + publisher + "]";
	}
	
	
}
