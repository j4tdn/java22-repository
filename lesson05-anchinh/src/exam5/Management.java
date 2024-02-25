package exam5;

import java.math.BigDecimal;
import java.util.Arrays;

public class Management {
	public static void main(String[] args) {
		
		TextBook tb1 = new TextBook(1, new BigDecimal("20"), "Nhi Đồng", false);
		TextBook tb2 = new TextBook(2, new BigDecimal("129"), "Lâm Đồng", true);
		TextBook tb3 = new TextBook(3, new BigDecimal("45"), "Nhi Đồng", false);
		
		ReferenceBook rb1=new ReferenceBook(1, new BigDecimal("268"), "Nhi Đồng", new BigDecimal("9"));
		ReferenceBook rb2=new ReferenceBook(1, new BigDecimal("20"), "Nhi Đồng", new BigDecimal("10"));
		
		Book[] books= {tb1, tb2, tb3, rb1, rb2};
		
		Book[] booksByPublisher = getBooksByPublisher(books);
		Book[] getBookPrice = getBookPrice(books);
		Book[] getBookByPrice = getBookByPrice(books);
		
		printf("Các cuốn sách thuộc nhà xuất bản Nhi Đồng", booksByPublisher);
		printf("Các cuốn sách có đơn giá nhỏ hơn 50", getBookPrice);
		printf("Các cuốn sách giáo khoa có đơn giá đơn giá từ 100 đến 200", getBookPrice);
	}

	private static Book[] getBooksByPublisher(Book[] books) {
		Book[] result = new Book[books.length];
		int counter = 0;
		
		for(Book book:books) {
			if(book.getPublisher().equals("Nhi Đồng")) {
				result[counter++] = book;
			}
		}
		
		return Arrays.copyOfRange(result, 0, counter);
	}
	
	private static Book[] getBookPrice(Book[] books) {
		Book[] result = new Book[books.length];
		int counter = 0;
		
		for(Book book:books) {
			if(book.getSalePrice().compareTo(new BigDecimal("50")) < 0){
				result[counter++] = book;
			}
		}
		return Arrays.copyOfRange(result, 0, counter);
	}
	private static Book[] getBookByPrice(Book[] books) {
		Book[] result = new Book[books.length];
	    int counter = 0;

	    for (Book book : books) {
	        if (book instanceof TextBook) {
	            TextBook textbook = (TextBook) book;
	            if (textbook.getSalePrice().compareTo(new BigDecimal("100")) >= 0 && textbook.getSalePrice().compareTo(new BigDecimal("200")) <= 0) {
	                result[counter++] = book;
	            }
	        }
	    }

	    return Arrays.copyOfRange(result, 0, counter);
	}
	
//	Sách giáo khoa - TextBook: Giảm 30% với sách cũ
//	private static BigDecimal calcTotalOfMoney(Book[] selectedBooks) {
//		BigDecimal totalofMoney=BigDecimal.ZERO;
//		for(Book book : selectedBooks) {
//			BigDecimal discount = BigDecimal.ZERO;
//			
//			if(book instanceof TextBook && !((TextBook) book).isNew()) {
//				discount  = book.getSalePrice().multiply(new BigDecimal("0.3"));
//		    }
//			else if(book instanceof ReferenceBook) {
//			}
//			
//		return totalofMoney;
//	}
	
	private static void printf(String prefix, Book[] books) {
		System.out.println(prefix + "{");
		for(Book book:books) {
			System.out.println(" + " + book);
		}
		System.out.println("}\n");
		
	}
}
