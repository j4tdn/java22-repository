package ex5;

public class Referencebooks extends Book{
	double tax;

	public Referencebooks(String bookCode, double prices, String publisher,double tax) {
		super(bookCode, prices, publisher);
		this.tax = tax;
	}

	
}
