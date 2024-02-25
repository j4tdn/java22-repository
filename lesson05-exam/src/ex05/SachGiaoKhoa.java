package ex05;

import java.math.BigDecimal;

public class SachGiaoKhoa {
	private String id;
	private BigDecimal salesPrice;
	private String publisher;
	private boolean isNew;
	
	public SachGiaoKhoa() {
		// TODO Auto-generated constructor stub
	}

	public SachGiaoKhoa(String id, BigDecimal salesPrices, String publisher, boolean isNew) {
		super();
		this.id = id;
		this.salesPrice = salesPrices;
		this.publisher = publisher;
		this.isNew = isNew;
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

	public boolean isNew() {
		return isNew;
	}

	public void setNew(boolean isNew) {
		this.isNew = isNew;
	}

	@Override
	public String toString() {
		return "stk [id=" + id + ", salesPrice=" + salesPrice + ", publisher=" + publisher + ", isNew=" + isNew + "]";
	}
	
}
