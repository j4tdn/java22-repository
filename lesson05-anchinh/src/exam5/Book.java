package exam5;

import java.math.BigDecimal;

public class Book {
	private int id;
	private BigDecimal salePrice;
	private String publisher;
	
	public Book() {
	}
	
	public Book(int id, BigDecimal salePrice, String publisher) {
		this.id = id;
		this.salePrice = salePrice;
		this.publisher = publisher;
	}

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public BigDecimal getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(BigDecimal salePrice) {
		this.salePrice = salePrice;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", salePrice=" + salePrice + ", publisher=" + publisher + "]";
	}
	
	
	
	
}
