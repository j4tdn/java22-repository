package Ex05;

import java.math.BigDecimal;

public class TextBook extends Book{
    private String textBookId;
    private String status;
	public TextBook() {
	}
	public TextBook(String textBookId, BigDecimal price, String publisher, String status) {
		super(price, publisher);
		this.textBookId=textBookId;
		this.status=status;
	}
	public String getTextBookId() {
		return textBookId;
	}
	public void setTextBookId(String textBookId) {
		this.textBookId = textBookId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return super.toString()+ ", " + "textBookId=" + textBookId + ", status=" + status + "]";
	}
    
}
