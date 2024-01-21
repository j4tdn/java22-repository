package inheritance.cclass;

import java.math.BigDecimal;

public class TextBook extends Book {
	
	//Book:id, name, salesPrice, publisher
	
	private boolean isNew;
	private BigDecimal discount;
	
	public TextBook() {
		
	}

	public TextBook(boolean isNew, BigDecimal discount) {	
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
		return "TextBook [isNew=" + isNew + ", discount=" + discount + "]";
	}

	public TextBook(String id, String name, BigDecimal salesPrice, String publisher, boolean isNew,
			BigDecimal discount) {
		super(id, name, salesPrice, publisher);
		this.isNew = isNew;
		this.discount = discount;
	}
	

}
