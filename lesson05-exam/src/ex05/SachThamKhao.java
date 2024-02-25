package ex05;

import java.math.BigDecimal;

public class SachThamKhao extends SachGiaoKhoa  {
	private BigDecimal tax;
	
	public SachThamKhao() {
	
	}

	public SachThamKhao(String id, BigDecimal salesPrice, String publisher, boolean isNew, BigDecimal tax) {
		super(id, salesPrice, publisher, isNew);
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
		return "SachThamKhao [tax=" + tax + ", getTax()=" + getTax() + ", getId()=" + getId() + ", getSalesPrice()="
				+ getSalesPrice() + ", getPublisher()=" + getPublisher() + ", isNew()=" + isNew() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
}
	
	

	