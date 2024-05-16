package bean;

import java.time.LocalDate;

public class Item {
	private Integer id;
	private String name;
	private Double price;
	private LocalDate salesDate;
	
	public Item() {
	}
	public Item(Integer id, String name, Double price, LocalDate salesDate) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.salesDate = salesDate;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public LocalDate getSalesDate() {
		return salesDate;
	}
	public void setSalesDate(LocalDate salesDate) {
		this.salesDate = salesDate;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Item)) {
			return false;
		}
		Item that = (Item)obj;
		
		return getId() == that.getId();
	}
	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", price=" + price + ", salesDate=" + salesDate + "]";
	}
	
}