package exam5;

import java.math.BigDecimal;

public class TextBook extends Book {
	private boolean isNew;
	
	public TextBook() {
	}


	public TextBook(int id, BigDecimal salePrice, String publisher, boolean isNew) {
		super(id, salePrice, publisher);
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
		return super.toString() + " isNew = " + isNew;
	}
	
	

}
