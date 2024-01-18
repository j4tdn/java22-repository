package inheritantce.cclass;

import java.math.BigDecimal;

public class Book {
	private String id, name, publisher;
	private BigDecimal salsePrice; // lưu giá trị số thực(hỗ trợ các hàm xữ lí)
	
	public Book() {
	}

	public Book(String id, String name, String publisher, BigDecimal salsePrice) {
		this.id = id;
		this.name = name;
		this.publisher = publisher;
		this.salsePrice = salsePrice;
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

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public BigDecimal getSalsePrice() {
		return salsePrice;
	}

	public void setSalsePrice(BigDecimal salsePrice) {
		this.salsePrice = salsePrice;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", publisher=" + publisher + ", salsePrice=" + salsePrice + "]";
	}
	
}
