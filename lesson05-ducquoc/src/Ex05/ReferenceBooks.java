package Ex05;

public class ReferenceBooks extends Books {

    private double Tax;

    public ReferenceBooks() {
   
    }

    public ReferenceBooks(String id, double price, String publishingCompany, double tax) {
        super(id, price, publishingCompany);
        Tax = tax;
    }

    public double getTax() {
        return Tax;
    }

    public void setTax(double tax) {
        Tax = tax;
    }

    @Override
    public String toString() {
        return "ReferenceBooks [Id=" + getId() + ", Price=" + getPrice() + ", PublishingCompany=" +
                getPublishingCompany() + ", Tax=" + Tax + "]";
    }
}
