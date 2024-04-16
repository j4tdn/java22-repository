package p1_strategy_bean;

import java.math.BigDecimal;

public class ReferenceBook extends Book {
	
	private BigDecimal tax;
	
	public ReferenceBook() {
	}

	public ReferenceBook(String id, BigDecimal salesPrice, String publisher, BigDecimal tax) {
		super(id, salesPrice, publisher);
		this.tax = tax;
	}
	
	public BigDecimal getTax() {
		return tax;
	}
	
	public void setTax(BigDecimal tax) {
		this.tax = tax;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", " + getTax();
	}
}
