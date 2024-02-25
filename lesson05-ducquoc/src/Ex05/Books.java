package Ex05;



public class Books {
	
	private String Id;
	private double Price;
	private String PublishingCompany;
	public Books() {
		// TODO Auto-generated constructor stub
	}
	
    public Books(String id, double price, String publishingCompany) {
		super();
		Id = id;
		Price = price;
		PublishingCompany = publishingCompany;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public double getPrice() {
		return Price;
	}

	public void setPrice(double price) {
		Price = price;
	}

	public String getPublishingCompany() {
		return PublishingCompany;
	}

	public void setPublishingCompany(String publishingCompany) {
		PublishingCompany = publishingCompany;
	}

	@Override
	public String toString() {
		return "Books [Id=" + Id + ", Price=" + Price + ", PublishingCompany=" + PublishingCompany + "]";
	}

	public static void main(String[] args) {
        ReferenceBooks refBook1 = new ReferenceBooks("STK1", 50.0, "Kim Đồng", 0.1);
        ReferenceBooks refBook2 = new ReferenceBooks("STK2", 45.0, "Nhi Đồng", 0.08);
        ReferenceBooks refBook3 = new ReferenceBooks("STK3", 60.0, "Kim Đồng", 0.12);

        TextBook textBook1 = new TextBook("SGK1", 35.0, "Kim Đồng", "Mới");
        TextBook textBook2 = new TextBook("SGK2", 40.0, "Nhi Đồng", "Cũ");

        
        Books[] booksArray = new Books[]{refBook1, refBook2, refBook3, textBook1, textBook2};
        searchBook(booksArray);
        search50(booksArray);
        search100200(booksArray);
    }
	public static void searchBook( Books[] booksArray) {
        System.out.println("Sách thuộc nhà xuất bản nhi đồng" );
        for (Object book : booksArray) {
            if (book instanceof TextBook || book instanceof ReferenceBooks) {
                if (((Books) book).getPublishingCompany().equals("Nhi Đồng")) {
                    System.out.println(book);
                }
            }
        }
    }
    public static void search50(Books[] booksArray) {
        System.out.println("Sách có đơn giá nhỏ hơn 50 " );
        for (Object book : booksArray) {
            if (book instanceof TextBook || book instanceof ReferenceBooks) {
                if (((Books) book).getPrice() < 50) {
                    System.out.println(book);
                }
            }
        }
    }
    public static void search100200(Books[] booksArray) {
        System.out.println("Sách giáo khoa có đơn giá từ 100 đến 200 " );
        for (Object book : booksArray) {
            if (book instanceof TextBook && ((TextBook) book).getPrice() >= 100 && ((TextBook) book).getPrice() <= 200) {
                System.out.println(book);
            }
        }
    }

}
