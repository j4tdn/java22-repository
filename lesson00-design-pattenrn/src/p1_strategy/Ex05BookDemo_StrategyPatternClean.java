package p1_strategy;
import java.math.BigDecimal;
import java.util.Arrays;

import p1_strategy_bean.Book;
import p1_strategy_bean.Order;
import p1_strategy_bean.ReferenceBook;
import p1_strategy_bean.TextBook;
public class Ex05BookDemo_StrategyPatternClean {

	public static void main(String[] args) {

		Book[] books = initData();
		
		/*
		 Với một lambda, có thể rút gọn như sau
		 
		 1. Tham số
		    + không cần khai báo KDL của tham số
		    + tên tham số bất kỳ
		    + nếu số lượng tham số = 1 --> bỏ luôn ()
		 
		 2. Phần body(override) - hàm thực thi(trả về void, trả về kdl nào đó(return))
		    - nếu body chỉ có 1 dòng duy nhất --> bỏ luôn {}
		      + hàm trả về void: ko bị ảnh hượng
		      + hàm trả về kdl nào đó
		         . TH1: giữ {} --> yêu cầu phải có chữ return
		         . TH2: xóa {} --> xóa luôn chữ return, ghi giá trị trả về, tự biết trả về giá trị đó 
		 
		 */

		//Condition ndCondition = book -> "Nhi Đồng".equals(book.getPublisher());
		;
		
		Book[] result = findBooks(books, book -> "Nhi Đồng".equals(book.getPublisher()));
		generate("1. Sách thuộc NXB 'Nhi Đồng'", result);


		Condition ltPricecondition = (Book book) -> {
			return book.getSalesPrice().doubleValue() < 40;
		};
		result = findBooks(books, ltPricecondition);
		generate("2. Sách có đơn giá nhỏ hơn 40", result);


		Condition rangePricecondition = (Book book) -> {
			double price = book.getSalesPrice().doubleValue();
			return price >= 40 && price <=80 ;
		};
		result = findBooks(books, rangePricecondition);
		generate("3. Sách có đơn giá từ 40 đến 80", result);
	}

	private static Book[] findBooks(Book[] books, Condition condition) {
		Book[] result = new Book[books.length];
		int count = 0;
		for (Book book : books) {
			if (condition.test(book)) {
				result[count++] = book;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}

	// ===============================================

	
	private static void generate(String prefix, Book[] books) {
		System.out.println(prefix + " ---> {");
		for (Book book : books) {
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

	private static Book[] initData() {
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
		Book[] books = { tb1, rb1, rb2, tb2, tb3, tb4, rb4, rb5, tb5, rb3, };
		return books;
	}

}
