package Ex05;

import java.math.BigDecimal;

public class Book {
    private BigDecimal price;
    private String publisher;
    public Book() {
    	
    }
	public Book(BigDecimal price, String publisher) {
		this.price = price;
		this.publisher = publisher;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	@Override
	public String toString() {
		return "Book [price=" + price + ", publisher=" + publisher;
	}
    
}
