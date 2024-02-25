package ex05;

import java.math.BigDecimal;
import java.util.Arrays;

public class Main05 {
	public static void main(String[] args) {
		TextBook tb1 = new TextBook("SGK1", new BigDecimal("40"), "Nhi Đồng", false);
		TextBook tb2 = new TextBook("SGK2", new BigDecimal("122"), "Nhi Đồng", true);
		TextBook tb3 = new TextBook("SGK3", new BigDecimal("36"), "BGD", false);
		
		ReferenceBook rb1 = new ReferenceBook("STK1", new BigDecimal("128"), "Nhi Đồng", new BigDecimal("10"));
		ReferenceBook rb2 = new ReferenceBook("STK2", new BigDecimal("90"), "BGD", new BigDecimal("8"));
		
		Book[] books = {tb1, tb2, tb3, rb1, rb2};
		
		Book[] booksByPublisher = getBooksByPublisher(books);
		printf("Liệt kê các cuốn sách thuộc nhà xuất bản Nhi Đồng", booksByPublisher);
		
		Book[] booksPrice50 = getBooksPrice50(books,new BigDecimal("50"));
		printf("Liệt kê các cuốn sách có giá nhỏ hơn 50", booksPrice50);
		
		Book[] textBookPrice = getTextBooksPrice(books,new BigDecimal("100"),new BigDecimal("200"));
		printf("Liệt kê các sách giáo khoa có giá lớn hơn 100 và nhỏ hơn 200", textBookPrice);
		
	}
	private static Book[] getBooksByPublisher(Book[] books) {
		Book[] result = new Book[books.length];
		int counter = 0;
		for (Book book:books) {
			if (book.getPublisher().equals("Nhi Đồng")) {
				result[counter] = book;
				counter++;
			}
		}
		return Arrays.copyOfRange(result, 0, counter);
	}
	private static Book[] getBooksPrice50(Book[] books, BigDecimal maxPrice) {
		Book[] result = new Book[books.length];
		int counter = 0;
		for (Book book:books) {
			if (book.getSalesPrice().compareTo(maxPrice) == -1) {
				result[counter] = book;
				counter++;
			}
		}
		return Arrays.copyOfRange(result, 0, counter);
	}
	private static Book[] getTextBooksPrice(Book[] books, BigDecimal minPrice, BigDecimal maxPrice) {
		Book[] result = new Book[books.length];
		int counter = 0;
		for (Book book:books) {
			if (book instanceof TextBook && book.getSalesPrice().compareTo(minPrice) == 1 && book.getSalesPrice().compareTo(maxPrice) == -1) {
				result[counter] = book;
				counter++;
			}
		}
		return Arrays.copyOfRange(result, 0, counter);
	}
	private static BigDecimal calcTotalOfMoney(Book[] selectedBooks) {
		BigDecimal totalOfMoney = BigDecimal.ZERO;
	
		for (Book book: selectedBooks) {
			BigDecimal price = book.getSalesPrice();
			if (book instanceof TextBook) {
			
			
			} else if (book instanceof ReferenceBook) {
				BigDecimal tax = ((ReferenceBook)book).getTax();
				price = price.multiply(new BigDecimal("100").add(tax)).divide(new BigDecimal("100"));
			}
			System.out.println(".. Giá của sách " + book.getId() + " = " + price);
			totalOfMoney = totalOfMoney.add(price);
		}
		return totalOfMoney;
	}

	private static void printf(String prefix, Book[] books) {
		System.out.println(prefix + " {");
		for (Book book: books) {
			System.out.println(" + " + book);
		}
		System.out.println("}\n");
	}

}
