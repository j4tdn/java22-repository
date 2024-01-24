package inheritance.cclass;

import java.math.BigDecimal;

public class Book {

	private String id; 
	private String name;
	private BigDecimal salesPrice;  //lưu giá trị số thực(hỗ trợ các hàm xử lý) 
	private String publisher; 
	
	public Book() {
		
	}

	public Book(String id, String name, BigDecimal salesPrice, String publisher) {
		this.id = id;
		this.name = name;
		this.salesPrice = salesPrice;
		this.publisher = publisher;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
		return "Book [id=" + id + ", name=" + name + ", salesPrice=" + salesPrice + ", publisher=" + publisher + "]";
	}
	
	
	
    
}
