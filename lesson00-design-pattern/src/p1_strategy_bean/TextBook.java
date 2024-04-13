package p1_strategy_bean;

import java.math.BigDecimal;

public class TextBook  extends Book{
	private boolean status;
	public TextBook() {
		
	}
	public TextBook(String id, BigDecimal salsPrice, String publisher, boolean status) {
		super(id, salsPrice, publisher);
		this.status = status;
	}
	public boolean isNew() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return super.toString() +", "+ isNew();
	}
}
