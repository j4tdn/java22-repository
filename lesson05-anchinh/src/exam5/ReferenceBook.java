package exam5;

import java.math.BigDecimal;

public class ReferenceBook extends Book{

	private BigDecimal tax;
	
	public ReferenceBook() {
	}

	public BigDecimal getTax() {
		return tax;
	}

	public void setTax(BigDecimal tax) {
		this.tax = tax;
	}

	public ReferenceBook(int id, BigDecimal salePrice, String publisher, BigDecimal tax) {
		super(id, salePrice, publisher);
		this.tax = tax;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
}
