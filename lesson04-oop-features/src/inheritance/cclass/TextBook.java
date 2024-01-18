package inheritance.cclass;

import java.math.BigDecimal;

public class TextBook extends Book{
	private boolean isNew;
	private BigDecimal discount;
	
	public TextBook() {
		
	}
	
	
	//super: đại diện cho đối tượng KDL cha
	// gọi đến các thuộc tính/hàm non-static trong class cha
	// gọi đến các hàm khởi tạo khác trong class cha
	
	//phân biệt this và super
	public TextBook(String id, String name, BigDecimal salesPrice, String publisher, boolean isNew, BigDecimal discount) {
		super(id, name,salesPrice, publisher);
		this.isNew = isNew;
		this.discount = discount;
	}

	public boolean isNew() {
		return isNew;
	}

	public void setNew(boolean isNew) {
		this.isNew = isNew;
	}

	public BigDecimal getDiscount() {
		return discount;
	}

	public void setDiscount(BigDecimal discount) {
		this.discount = discount;
	}

	@Override
	public String toString() {
		return "TextBook [isNew=" + isNew + ", discount=" + discount + ", getId()=" + getId() + ", getName()="
				+ getName() + ", getSalesPrice()=" + getSalesPrice() + ", getPublisher()=" + getPublisher() + "]";
	}

	


}
