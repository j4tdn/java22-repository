package bean;

import java.math.BigDecimal;

public class Book {
	private String idbook;
	private BigDecimal price;
	private String publisher;
	public Book() {
	}
	public Book(String idbook, BigDecimal price, String publisher) {
		this.idbook = idbook;
		this.price = price;
		this.publisher = publisher;
	}
	public String getIdbook() {
		return idbook;
	}
	public void setIdbook(String idbook) {
		this.idbook = idbook;
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
		return "Book [idbook=" + idbook + ", price=" + price + ", publisher=" + publisher + "]";
	}
	
	

}
