package Ex05;

public class TextBook {
	
	private String bookID;
    private double price;
    private String publisher;
    private boolean isNew;
    
	public TextBook(String bookID, double price, String publisher, boolean isNew) {
		super();
		this.bookID = bookID;
		this.price = price;
		this.publisher = publisher;
		this.isNew = isNew;
	}

	public String getBookID() {
		return bookID;
	}

	public double getPrice() {
		return price;
	}

	public String getPublisher() {
		return publisher;
	}

	public boolean isNew() {
		return isNew;
	}
    
    

}
