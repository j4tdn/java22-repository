package bean;

import java.math.BigDecimal;

public class Referencebook extends Book {
	private BigDecimal tax;

	public Referencebook() {}
	
	public Referencebook(String idbook, BigDecimal price, String publisher, BigDecimal tax) {
		super(idbook, price, publisher);
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
		return super.toString() + " tax =" + tax;
	}
	
	
	
	

}
