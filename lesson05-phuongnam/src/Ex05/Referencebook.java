package Ex05;

import java.math.BigDecimal;

public class Referencebook extends Book {

	private BigDecimal tax;
	
	public Referencebook() {
		
	}

	public Referencebook(String id, BigDecimal salesPrice, String publisher, BigDecimal tax) {
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
//		return "Referencebook [tax=" + tax + ", getId()=" + getId() + ", getSalesPrice()=" + getSalesPrice()
//				+ ", getPublisher()=" + getPublisher() + "]";
		
		return super.toString() + " --> tax = " + tax;
	}
	
	
}
