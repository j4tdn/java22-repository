package view;

import bean.Book;
import bean.ReferenceBook;
import bean.Status;
import bean.TextBook;

public class Ex05TestShop {

	public static void main(String[] args) {
		Book[] books = mockData();
		findBookPublisher(books);
		findPrice(books);
		findTextBookPriceRange100From200(books);

	}

	private static Book[] mockData() {
		TextBook t1 = new TextBook("SGK01", 300, "Giáo dục", Status.NEW);
		TextBook t2 = new TextBook("SGK02", 35, "Nhi Đồng", Status.NEW);
		TextBook t3 = new TextBook("SGK03", 60, "Giáo dục", Status.OLD);
		ReferenceBook r1 = new ReferenceBook("STK01", 30, "Giáo dục", 10);
		ReferenceBook r2 = new ReferenceBook("STK02", 50, "Nhi Đồng", 10);
		return new Book[] { t1, t2, t3, r1, r2 };
	}

	private static void findBookPublisher(Book[] books) {
		System.out.println("Các sách thuộc nhà xuất bản Nhi Đồng:");
		for (Book book : books) {
			if (book.getPublisher().equals("Nhi Đồng")) {
				System.out.println(book);
			}
		}
	}

	private static void findPrice(Book[] books) {
		System.out.println("Các sách có đơn giá nhỏ hơn 50:");
		for (Book book : books) {
			if (book.getPrice() < 50) {
				System.out.println(book);
			}
		}
	}

	private static void findTextBookPriceRange100From200(Book[] books) {
		System.out.println("Các sách giáo khoa có đơn giá từ 100 đến 200:");
		for (Book book : books) {
			if (book instanceof TextBook) {
				TextBook textbook = (TextBook) book;
				if (textbook.getPrice() >= 100 && textbook.getPrice() <= 200) {
					System.out.println(textbook);
				}
			}
		}
	}

}
