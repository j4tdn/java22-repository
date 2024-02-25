package Ex05;

public class TextBook extends Books {

    private String Status;

    public TextBook() {
       
    }

    public TextBook(String id, double price, String publishingCompany, String status) {
        super(id, price, publishingCompany);
        Status = status;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    @Override
    public String toString() {
        return "TextBook [Id=" + getId() + ", Price=" + getPrice() + ", PublishingCompany=" + getPublishingCompany() +
                ", Status=" + Status + "]";
    }
}
