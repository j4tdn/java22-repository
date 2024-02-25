package inheritance.cclass;

import java.math.BigDecimal;

public class ReferenceBook extends Book{
	private boolean isNew;
	private BigDecimal discount;
	
	
	public ReferenceBook(String id, String name, BigDecimal salesPrice, String publisher, boolean isNew,
			BigDecimal discount) {
		super(id, name, salesPrice, publisher);
		this.isNew = isNew;
		this.discount = discount;
	}
	
	public ReferenceBook(boolean isNew, BigDecimal discount) {
	
		this.isNew = isNew;
		this.discount = discount;
	}
	// this: đại diện cho đối tượng hiện tại đang gọi hàm
	//     : gọi đến thuộc tính/hàm non-static trong class hiện tại
	//		: gọi đén hàm khởi tạo trong class hiện tại
	
	// super: đại diện cho đối tượng KDL cha
	//		: gọi đến các thuộc tính/ hàm non-static của cha
	// 		: gọi đến các hàm khởi tạo trong class của cha
	
	
	

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
		return "ReferenceBook [isNew=" + isNew + ", discount=" + discount + ", getId()=" + getId() + ", getName()="
				+ getName() + ", getSalesPrice()=" + getSalesPrice() + ", getPublisher()=" + getPublisher()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}


	

}
