package bai5;

public class Textbook extends Book {
	
	private boolean isNew;
	
	public Textbook() {
	}

	public Textbook(String id, double price, String publisher, boolean isNew) {
		super(id, price, publisher);
		this.isNew = isNew;
	}

	public boolean isNew() {
		return isNew;
	}

	public void setNew(boolean isNew) {
		this.isNew = isNew;
	}
	
	
	
}
