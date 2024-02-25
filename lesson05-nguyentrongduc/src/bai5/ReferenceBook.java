package src.bai5;

public class ReferenceBook extends Book {
    public double Tax;

    public ReferenceBook(String code, double price, String publisher, double tax) {
        super(code, price, publisher);
        this.Tax = tax;
    }

    @Override
    public double getPrice() {
        return this.Price * (1 + (100 + this.Tax) / 100.0);
    }
}
