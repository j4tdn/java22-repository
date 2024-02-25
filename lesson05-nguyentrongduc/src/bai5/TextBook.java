package src.bai5;

public class TextBook extends Book {
    public Status Status;

    public TextBook(String code, double price, String publisher, Status status) {
        super(code, price, publisher);
        this.Status = status;
    }

    @Override
    public double getPrice() {
        if (this.Status == Status.Old)
            return this.Price * 0.7;
        return this.Price;
    }
}