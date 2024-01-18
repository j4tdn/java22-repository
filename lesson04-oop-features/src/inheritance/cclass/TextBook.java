package inheritance.cclass;

import java.math.BigDecimal;

public class TextBook extends Book {

	private boolean isNew;
	private BigDecimal dícount;
	
	public TextBook() {
	}

//	public TextBook(boolean isNew, BigDecimal dícount) {
//		this.isNew = isNew;
//		this.dícount = dícount;
//	}
//	
	

	public TextBook(String id, String name, BigDecimal salesPrice, String publisher, boolean isNew,
			BigDecimal dícount) {
		super(id, name, salesPrice, publisher);
		this.isNew = isNew;
		this.dícount = dícount;
	}

	public boolean isNew() {
		return isNew;
	}

	public void setNew(boolean isNew) {
		this.isNew = isNew;
	}

	public BigDecimal getDícount() {
		return dícount;
	}

	public void setDícount(BigDecimal dícount) {
		this.dícount = dícount;
	}

	@Override
	public String toString() {
		return "TextBook [isNew=" + isNew + ", dícount=" + dícount + "]";
	}
	
	
}
