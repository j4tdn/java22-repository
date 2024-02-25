package bean;

import java.math.BigDecimal;

public class Textbook extends Book{
	private boolean status;
	public Textbook(){}

	public Textbook(String idbook, BigDecimal price, String publisher, boolean status) {
		super(idbook, price, publisher);
		this.status = status;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return super.toString() + " status " + status ;

	}
	

	
	

}
