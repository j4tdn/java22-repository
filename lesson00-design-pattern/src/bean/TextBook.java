package bean;

import java.math.BigDecimal;

public class TextBook extends Book{
	
	private boolean isNew;

	public TextBook(String id, BigDecimal salesPrice, String publisher, boolean status) {
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
		return super.toString() + ", " +isNew();
	}
	
	
}
