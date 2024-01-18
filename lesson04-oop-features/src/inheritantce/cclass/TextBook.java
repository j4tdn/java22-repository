package inheritantce.cclass;

import java.math.BigDecimal;

public class TextBook extends Book{
	
	private boolean isNew;
	private BigDecimal discount;
	
	public TextBook() {
	}
	
	public TextBook(String id, String name, String publisher, BigDecimal salsePrice, boolean isNew, BigDecimal discount) {
//		this.setId(id);
//		this.setName(name);
//		this.setPublisher(publisher);
//		this.setSalsePrice(salsePrice);
		// this: đại diện đối tượng hiện tại gọi thuộc tín /hàm trong class hiện tại
		// 		gọi hàm khởi tạo của class hiện tại

		// super:đại diện đối tượng hiện tại gọi thuộc tín/hàm trong class cha 
		// 		gọi hàm khởi tạo của cha
		
		super(id, name, publisher, salsePrice) ;
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
		return "TextBook [isNew=" + isNew + ", discount=" + discount + ", id=" + getId() + ", name="
				+ getName() + ", publisher=" + getPublisher() + ", salsePrice=" + getSalsePrice() + "]";
	}

	
	
}
