package src.bai5;

public abstract class Book {
    public String Code;

    public double Price;

    public String Publisher;

    public Book(String code, double price, String publisher)
    {
        this.Code = code;
        this.Price = price;
        this.Publisher = publisher;
    }

    public abstract double getPrice();
}
