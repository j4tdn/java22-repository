package ex05;

import java.math.BigDecimal;

public class Book {
	private String id;
	private BigDecimal salesPrice;
	private String publisher;
	
    public Book() {
		
	}

	public Book(String id, BigDecimal salesPrice, String publisher) {
		super();
		this.id = id;
		this.salesPrice = salesPrice;
		this.publisher = publisher;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public BigDecimal getSalesPrice() {
		return salesPrice;
	}

	public void setSalesPrice(BigDecimal salesPrice) {
		this.salesPrice = salesPrice;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", salesPrice=" + salesPrice + ", publisher=" + publisher + "]";
	}
    

}
