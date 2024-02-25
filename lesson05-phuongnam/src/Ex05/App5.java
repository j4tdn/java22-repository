package Ex05;

import java.math.BigDecimal;
import java.util.Arrays;

public class App5 {

	public static void main(String[] args) {

		Textbook tb1 = new Textbook("101", new BigDecimal("30"), "Nhi Đồng", false);
		Textbook tb2 = new Textbook("102", new BigDecimal("60"), "Giáo dục", false);
		Textbook tb3 = new Textbook("103", new BigDecimal("30"), "Giáo dục", false);

		Referencebook rb1 = new Referencebook("104", new BigDecimal("49"), "BGD", new BigDecimal("10"));
		Referencebook rb2 = new Referencebook("105", new BigDecimal("70"), "BGD", new BigDecimal("8"));

		Book[] books = { tb1, tb2, tb3, rb1, rb2 };
		
		Book[] booksByPublisher = getBooksByPublisher(books);
		printf("Câu 1: Liệt kê các cuốn sách thuộc nhà xuất bản Nhi Đồng", booksByPublisher);
		
		System.out.println("Câu 2: Liệt kê các cuốn sách giá thấp hơn 50");
		findSmallerThan50(books);
	}

	private static Book[] getBooksByPublisher(Book[] books) {

		Book[] result = new Book[books.length];
		int counter = 0;
		for (Book book : books) {

			if (book.getPublisher().equals("Nhi Đồng")) {
				result[counter] = book;
				counter++;
			}
		}

		return Arrays.copyOfRange(result, 0, counter);
	}

	private static void printf(String prefix, Book[] books) {
		System.out.println(prefix + " {");
		for (Book book : books) {
			System.out.println("  + " + book);
		}
		System.out.println("}\n");
	}

	private static void findSmallerThan50(Book[] books ) {
		
		System.out.println("Sách có đơn giá nhỏ hơn " + 50 + ":");
        for (Book book : books) {
        	BigDecimal b = new BigDecimal("50");
            if (book.getSalesPrice().compareTo(b) < 0) {
                System.out.println(book);
            }

        	
        }
        
	}
}
