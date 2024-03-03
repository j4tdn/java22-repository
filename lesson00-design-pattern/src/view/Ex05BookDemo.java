package view;

import java.lang.ref.Reference;
import java.math.BigDecimal;
import java.util.Arrays;

import bean.Book;
import bean.ReferenceBook;
import bean.TextBook;

public class Ex05BookDemo {
	public static void main(String[] args) {
		// tạo  3 đối tượng sgk
		TextBook tb1 = new TextBook("SGK-T1",bd("15"),"Nhi đồng",false);
		TextBook tb2 = new TextBook("SGK-T2",bd("25"),"KHTN",true);
		TextBook tb3 = new TextBook("SGK-T3",bd("35"),"Nhi đồng",true);
		TextBook tb4 = new TextBook("SGK-T4",bd("45"),"KHTN",false);
		TextBook tb5 = new TextBook("SGK-T5",bd("55"),"Nhi đồng",false);
		
		
		//tạo 2 đối tượng sách tham khảo 
		ReferenceBook rb1 = new ReferenceBook("STK-V1", bd("60"), "Nhi đồng", bd("5"));
		ReferenceBook rb2 = new ReferenceBook("STK-V2", bd("70"), "Hà Nội", bd("7"));
		ReferenceBook rb3 = new ReferenceBook("STK-V3", bd("80"), "Nhi đồng", bd("5"));
		ReferenceBook rb4 = new ReferenceBook("STK-V4", bd("90"), "Nhi đồng", bd("5"));
		ReferenceBook rb5 = new ReferenceBook("STK-V5", bd("100"), "Nhi đồng", bd("5"));
		Book[] books = {tb1, tb2,tb3,tb4,tb5,rb1,rb2,rb3,rb4,rb5};
		
		generate("1. Sách thuộc nhà xuất bản nhi đồng",findBookPublisher(books,"Nhi đồng"));
		generate("2. Sách có giá bé hơn 50",findBookBySalesPrice(books));
		generate("2. Sách có giá từ 40->70",findBookBySalesPrice(books, 40, 70));
	}
	private static Book[] findBookPublisher(Book[] books, String publisher) {
		Book[] result = new Book[books.length];
		int count = 0;
		for(Book book: books) {
			if(book.getPublisher().equals(publisher)) {
				result[count++] = book;
				
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
	private static Book[] findBookBySalesPrice(Book[] books) {
		Book[] result = new Book[books.length];
		int count = 0;
		for(Book book: books) {
			if(book.getSalsPrice().doubleValue()<50) {
				result[count++] = book;
				
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
	private static Book[] findBookBySalesPrice(Book[] books, double from  , double to) {
		Book[] result = new Book[books.length];
		int count = 0;
		for(Book book: books) {
			if(book.getSalsPrice().doubleValue()<to && book.getSalsPrice().doubleValue()>from ) {
				result[count++] = book;
				
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
	private static void generate(String prefix, Book[] books) {
		System.out.println(prefix +" --> {");
		for(Book book: books) {
			System.out.println("   "+ book);
		}
		System.out.println("\n}");
	}
	
	private static BigDecimal bd(String val) {
		return new BigDecimal(val);
	}
}
