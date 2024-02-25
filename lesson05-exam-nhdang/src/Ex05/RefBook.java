package Ex05;

import java.math.BigDecimal;

public class RefBook extends Book{

	private String refBookId;
	private BigDecimal tax;
	public RefBook() {
	}
	public RefBook(String refBookId, BigDecimal price, String publisher, BigDecimal tax) {
		super(price, publisher);
		this.refBookId=refBookId;
		this.tax=tax;
	}
	public String getRefBookId() {
		return refBookId;
	}
	public void setRefBookId(String refBookId) {
		this.refBookId = refBookId;
	}
	public BigDecimal getTax() {
		return tax;
	}
	public void setTax(BigDecimal tax) {
		this.tax = tax;
	}
	@Override
	public String toString() {
		return super.toString()+ ", " + "refBookId=" + refBookId + ", tax=" + tax + "]";
	}



}
