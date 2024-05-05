package bean;

import java.time.LocalDate;

public class Item {

	private Integer id;
	private String name;
	private Double salesPrice;
	private LocalDate salesDate;
	
	public Item() {
		// TODO Auto-generated constructor stub
	}

	public Item(Integer id, String name, Double salesPrice, LocalDate salesDate) {
		this.id = id;
		this.name = name;
		this.salesPrice = salesPrice;
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

	public Double getSalesPrice() {
		return salesPrice;
	}

	public void setSalesPrice(Double salesPrice) {
		this.salesPrice = salesPrice;
	}

	public LocalDate getSalesDate() {
		return salesDate;
	}

	public void setSalesDate(LocalDate salesDate) {
		this.salesDate = salesDate;
	}

	@Override
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		
		if (!(o instanceof Item)) {
			return false;
		}
		Item that = (Item)o;
		return getId() == that.getId();
	}
	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", salesPrice=" + salesPrice + ", salesDate=" + salesDate + "]";
	}
	
	
}
