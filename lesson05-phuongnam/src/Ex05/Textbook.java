package Ex05;

import java.math.BigDecimal;

public class Textbook extends Book {

	private boolean isNew;
	
	public Textbook() {
		
	}

	public Textbook(String id, BigDecimal salesPrice, String publisher, boolean isNew) {
		super(id, salesPrice, publisher);
		this.isNew = isNew;
	}

	public boolean isNew() {
		return isNew;
	}

	public void setNew(boolean isNew) {
		this.isNew = isNew;
	}

	@Override
	public String toString() {
//		return "Textbook [isNew=" + isNew + ", getId()=" + getId() + ", getSalesPrice()=" + getSalesPrice()
//				+ ", getPublisher()=" + getPublisher() + "]";
		return super.toString() + " --> isNew = " + isNew;
	}
	
	
}
