package bean;

import java.math.BigDecimal;

public class Book {
	private String id;
	private  BigDecimal salsPrice;
	private  String publisher;
	public Book() {
	}
	public Book(String id, BigDecimal salsPrice, String publisher) {
		super();
		this.id = id;
		this.salsPrice = salsPrice;
		this.publisher = publisher;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public BigDecimal getSalsPrice() {
		return salsPrice;
	}
	public void setSalsPrice(BigDecimal salsPrice) {
		this.salsPrice = salsPrice;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	@Override
	public String toString() {
		return getId() + ","+ getSalsPrice() + "," + getPublisher() ;
	}
	
	
}
