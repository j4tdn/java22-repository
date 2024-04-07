package p1_strategy;

import java.math.BigDecimal;
import java.util.Arrays;

import p1_strategy_bean.Book;
import p1_strategy_bean.Order;
import p1_strategy_bean.ReferenceBook;
import p1_strategy_bean.TextBook;

public class Ex05BookDemoStrategyPatternClean {

	public static void main(String[] args) {

		Book[] books = initData();

		/*
		 * Với một lambda, có thể rút gọn như sau
		 * 
		 * 1. Tham số + không cần khai báo KDL của tham số + tên tham số bất kỳ + nếu số
		 * lượng tham số = 1 --> bỏ luôn ()
		 * 
		 * 2. Phần body(override) - hàm thực thi(trả về void, trả về kdl nào đó(return))
		 * - nếu body chỉ có 1 dòng duy nhất --> bỏ luôn {} + hàm trả về void: ko bị ảnh
		 * hượng + hàm trả về kdl nào đó . TH1: giữ {} --> yêu cầu phải có chữ return .
		 * TH2: xóa {} --> xóa luôn chữ return, ghi giá trị trả về, tự biết trả về giá
		 * trị đó
		 * 
		 */

		// Tìm sách thuộc nhà xuất bản nhi đồng
		// anonymous class

//		Condition ndCondition = (Book book) -> {
//			return "Nhi Đồng".equals(book.getPublisher());
//		};

		Book[] result = findBooks(books, book -> "Nhi Đồng".equals(book.getPublisher()));
		generate("1. Sách thuộc nhà xuất bản 'Nhi Đồng'", result);

		// Sách có đơn giá nhỏ hơn 100
//		Condition ltPriceCondition = book -> book.getSalesPrice().doubleValue() < 100;

		result = findBooks(books, book -> book.getSalesPrice().doubleValue() < 100);
		generate("2.Sách có đơn giá nhỏ hơn 100", result);

		// Sách có đơn giá từ 40 - 80
		Condition rangePriceCondition = book -> {
			double price = book.getSalesPrice().doubleValue();
			return price >= 40 && price <= 80;
		};
		result = findBooks(books, rangePriceCondition);
		generate("3. Sách có đơn giá từ 40 đến 80", result);

		// Tìm toàn bộ các sách giáo khoa
		// result = findBooks(books, book -> book instanceof ReferenceBook);
		result = findBooks(books, book -> book.getId().startsWith("SGK-"));
		generate("4. Sách giáo khoa", result);

		Order[] orders = { new Order(books[0], 2), new Order(books[1], 1), new Order(books[9], 2) };
		exportBill(orders);

	}

	// condition = ndCondition(H1)
	// condition = ltPriceCondition(H2)
	// condition = rangePriceCondition(H3)

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
//=======================================================================================================

	private static void exportBill(Order[] orders) {
		/*
		 * Thực hiện giải lập. Khách hàng mua 3 cuốn sách giáo khoa, 2 cuốn sách tham
		 * khảo - Sách giáo khoa - TextBook: Giảm 30% với sách cũ - Sách tham khảo -
		 * ReferBook: Thành tiền = đơn giá * (1 + %thuế/100)
		 * 
		 */

//		Order[] orders = { new Order(tb1, 2), new Order(tb2, 1), new Order(rb3, 2) };

		BigDecimal totalOfMoney = bd("0");

		System.out.println("=== Xuất hóa đơn ===");
		for (Order order : orders) {
			Book book = order.getBook();
			BigDecimal price = order.getBook().getSalesPrice();

			if (book instanceof TextBook) {
				TextBook tb = (TextBook) book;
				// TextBook: Giảm 30% với sách cũ
				if (!tb.isNew()) {
					price = price.multiply(bd("0.7"));
				}
			} else {
				// ReferBook: Thành tiền = đơn giá * (1 + %thuế/100)
				ReferenceBook rb = (ReferenceBook) book;
				price = price.multiply(bd("1").add(rb.getTax().divide(bd("100"))));
			}

			totalOfMoney = totalOfMoney.add(price.multiply(bd(order.getAmount())));

			System.out.println("    " + order.getBook());
			System.out.println("    + " + "Số lượng(" + order.getAmount() + ")");
			System.out.println("    + " + "Giá mới(" + price + ")\n");
		}
		System.out.println("Tổng tiền = " + totalOfMoney);
	}

	private static Book[] initData() {
		TextBook tb1 = new TextBook("SGK-T1", bd("15"), "Hà Nội", false);
		TextBook tb2 = new TextBook("SGK-T2", bd("25"), "KHTN", true);
		TextBook tb3 = new TextBook("SGK-T3", bd("35"), "Nhi Đồng", false);
		TextBook tb4 = new TextBook("SGK-T4", bd("45"), "KHTN", true);
		TextBook tb5 = new TextBook("SGK-T5", bd("55"), "Nhi Đồng", false);

		ReferenceBook rb1 = new ReferenceBook("STK-V1", bd("16"), "Nhi Đồng", bd("5"));
		ReferenceBook rb2 = new ReferenceBook("STK-V2", bd("80"), "KHTN", bd("7"));
		ReferenceBook rb3 = new ReferenceBook("STK-V3", bd("70"), "Nhi Đồng", bd("5"));
		ReferenceBook rb4 = new ReferenceBook("STK-V4", bd("60"), "Nhi Đồng", bd("8"));
		ReferenceBook rb5 = new ReferenceBook("STK-V5", bd("90"), "Hà Nội", bd("5"));

		Book[] books = { tb1, rb1, rb2, tb2, tb3, tb4, rb4, rb5, tb5, rb3 };

		return books;
	}

	private static void generate(String prefix, Book[] books) {
		System.out.println(prefix + "-->{");
		for (Book book : books) {
			System.out.println("\t" + book);
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
