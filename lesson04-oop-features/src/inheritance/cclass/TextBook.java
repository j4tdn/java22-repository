package inheritance.cclass;

import java.math.BigDecimal;

public class TextBook extends Book {
	
	// Book: id, name, salesPrice, publisher
	
	private boolean isNew;
	private BigDecimal discount;
	
	public TextBook() {
	}

	public TextBook(boolean isNew, BigDecimal discount) {
		this.isNew = isNew;
		this.discount = discount;
	}
	
	// this: đại diện cho đối tượng hiện tại đang gọi hàm
	//     : gọi đến thuộc tính/hàm non-static trong class hiện tại
	//     : gọi đến các hàm khởi tạo trong class hiện tại
	
	// super: đại diện cho đối tượng KDL cha
	//      : gọi đến các thuộc tính/hàm non-static của cha
	//      : gọi đến các hàm khởi tạo trong class cha
	
	// phân biệt this và super
	
	
	
	// tự gõ
	// new TextBook("Ts1", "Toán 1", new BigDecimal("20"), "Nhi Đồng", false, new BigDecimal("5"))
//	public TextBook(
//			String id, String name, 
//			BigDecimal salesPrice, String publisher,
//			boolean isNew, BigDecimal discount) {
//		// this = H1
//		// this.setId(id);
//		// this.setName(name);
//		// this.setSalesPrice(salesPrice);
//		// this.setPublisher(publisher);
//		super(id, name, salesPrice, publisher);
//		this.isNew = isNew;
//		this.discount = discount;
//	}
	
	public TextBook(String id, String name, BigDecimal salesPrice, String publisher, boolean isNew,
			BigDecimal discount) {
		super(id, name, salesPrice, publisher);
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

	// sout(tb1)
	// tb1.toString() --> this = tb1
	
	// tb1.getId()
	
	@Override
	public String toString() {
		return "TextBook [isNew=" + this.isNew + ", discount=" + this.discount + ", getId()=" + getId() + ", getName()="
				+ getName() + ", getSalesPrice()=" + getSalesPrice() + ", getPublisher()=" + getPublisher() + "]";
	}

	
	
}
