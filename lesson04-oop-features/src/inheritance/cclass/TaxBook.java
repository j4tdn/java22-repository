package inheritance.cclass;

import java.math.BigDecimal;

public class TaxBook extends Book{
	private BigDecimal tax;
	public TaxBook() {
		// TODO Auto-generated constructor stub
	}
	public TaxBook(String id, String name, BigDecimal salesPrice, String publisher, BigDecimal tax) {
		super(id, name, salesPrice, publisher);
		this.tax = tax;
	}
	public BigDecimal getTax() {
		return tax;
	}
	public void setTax (BigDecimal tax) {
		this.tax = tax;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " -->tax = " + tax;
	}

}
