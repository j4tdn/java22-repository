package view;
import java.math.BigDecimal;
import java.util.Arrays;

import bean.Book;
import bean.Order;
import bean.ReferenceBook;
import bean.TextBook;
public class Ex05BookDemo_StrategyPattern {

	public static void main(String[] args) {
		// Tạo 3 đối tượng Sách Giáo Khoa
				TextBook tb1 = new TextBook("SGK-T1", bd("15"), "Nhi Đồng", false);
				TextBook tb2 = new TextBook("SGK-T2", bd("25"), "KHTN", true);
				TextBook tb3 = new TextBook("SGK-T3", bd("35"), "Nhi Đồng", true);
				TextBook tb4 = new TextBook("SGK-T4", bd("45"), "KHTN", false);
				TextBook tb5 = new TextBook("SGK-T5", bd("55"), "Nhi Đồng", false);
				
				// Tạo 2 đối tượng Sách Tham Khảo
				ReferenceBook rb1 = new ReferenceBook("STK-V1", bd("60"), "Nhi Đồng", bd("5"));
				ReferenceBook rb2 = new ReferenceBook("STK-V2", bd("80"), "Hà Nội", bd("7"));
				ReferenceBook rb3 = new ReferenceBook("STK-V3", bd("70"), "Nhi Đồng", bd("5"));
				ReferenceBook rb4 = new ReferenceBook("STK-V4", bd("90"), "Nhi Đồng", bd("8"));
				ReferenceBook rb5 = new ReferenceBook("STK-V5", bd("50"), "Nhi Đồng", bd("5"));
				
				// Lưu danh sách các đối tượng vào mảng một chiều duy nhất
				Book[] books = {tb1, rb1, rb2, tb2, tb3, tb4, rb4, rb5, tb5,  rb3,};
				
				// Tìm toàn bộ sách thuộc nhà xuất bản Nhi Đồng
				//Book[] result = findBooksByPublisher(books, "Nhi Đồng");
				
				Condition ndCondition = new Condition() {
					
					@Override
					public boolean test(Book book) {
						return "Nhi Đồng".equals(book.getPublisher());
					}
				};
				
				
				Book[] result = findBooks(books,ndCondition);
				generate("1. Sách thuộc NXB 'Nhi Đồng'", result);
				
				
				// Tìm toàn bộ sách có đơn giá nhỏ hơn 50
				//result = findBooksBySalesPrice(books);
				
				Condition ltPricecondition = new Condition() {
					@Override
					public boolean test(Book book) {
						return book.getSalesPrice().doubleValue()<40;
					}
				};
				result = findBooks(books, ltPricecondition);
				generate("2. Sách có đơn giá nhỏ hơn 40", result);
				
				// Tìm toàn bộ sách có đơn giá từ 40 đến 80
				result = findBooksBySalesPrice(books, 40, 80);
				generate("3. Sách có đơn giá từ 40 đến 80", result);
	}
	
	//3 ham co 3 dk nhu nhau => code ko toi uu
	
	//STRATEGY PATTERN
	// dựa vào điều kiện ở các hàm, tìm ra công thức chung của các điều kiện  
	/*
	 * 
	 */
	
	
	// condition.test(book)
		// lúc compile sẽ gọi hàm test ở interface Condition
		// lúc runtime sẽ gọi hàm test ở giá trị mà user truyền vào cho biến condition khi gọi
		// hàm findBooks
	private static Book[] findBooks(Book[] books, Condition condition) {
		Book[] result = new Book[books.length];
		int count = 0;
		for (Book book: books) {
			if (condition.test(book)) {
				result[count++] = book;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
	
	//===============================================
	
	
	private static Book[] findBooksByPublisher(Book[] books, String givenPubs) {
		Book[] result = new Book[books.length];
		int count = 0;
		for (Book book: books) {
			if (givenPubs.equals(book.getPublisher())) {
				result[count++] = book;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
	
	private static Book[] findBooksBySalesPrice(Book[] books) {
		Book[] result = new Book[books.length];
		int count = 0;
		for (Book book: books) {
			if (book.getSalesPrice().doubleValue() < 50) {
				result[count++] = book;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
	
	private static Book[] findBooksBySalesPrice(Book[] books, double from, double to) {
		Book[] result = new Book[books.length];
		int count = 0;
		for (Book book: books) {
			double price = book.getSalesPrice().doubleValue();
			if (price >= from && price <= to) {
				result[count++] = book;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
	private static void generate(String prefix, Book[] books) {
		System.out.println(prefix + " ---> {");
		for (Book book: books) {
			System.out.println("    " + book);
		}
		System.out.println("}\n");
	}
	private static BigDecimal bd(String val) {
		return new BigDecimal(val);
	}
	
	private static BigDecimal bd(double val) {
		return new BigDecimal(String.valueOf(val));
	}

}
