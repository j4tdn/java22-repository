package ex05;

public class TextBook extends Book{
	
	private boolean isNew;

	public TextBook(String id, double price, String publisher, boolean isNew) {
		super(id, price, publisher);
		this.isNew = isNew;
	}
	
	// Tính tiền sgk
	public double caculatePrice() {
		if(isNew) {
			return getPrice();
		}else {
			return getPrice()*0.7;
		}
	}

	

}
