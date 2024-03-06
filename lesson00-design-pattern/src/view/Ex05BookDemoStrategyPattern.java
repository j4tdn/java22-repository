package view;

import java.math.BigDecimal;
import java.util.Arrays;

import bean.Book;
import bean.Order;
import bean.ReferenceBook;
import bean.TextBook;

public class Ex05BookDemoStrategyPattern {

	public static void main(String[] args) {
		TextBook tb1 = new TextBook("SGK-T1", bd("15"), "Hà Nội", false);
		TextBook tb2 = new TextBook("SGK-T2", bd("25"), "KHTN", true);
		TextBook tb3 = new TextBook("SGK-T3", bd("35"), "Nhi Đồng", false);
		TextBook tb4 = new TextBook("SGK-T3", bd("45"), "KHTN", true);
		TextBook tb5 = new TextBook("SGK-T3", bd("55"), "Nhi Đồng", false);

		ReferenceBook rb1 = new ReferenceBook("STK-V1", bd("16"), "Nhi Đồng", bd("5"));
		ReferenceBook rb2 = new ReferenceBook("STK-V2", bd("80"), "KHTN", bd("7"));
		ReferenceBook rb3 = new ReferenceBook("STK-V3", bd("70"), "Nhi Đồng", bd("5"));
		ReferenceBook rb4 = new ReferenceBook("STK-V4", bd("60"), "Nhi Đồng", bd("8"));
		ReferenceBook rb5 = new ReferenceBook("STK-V5", bd("90"), "Hà Nội", bd("5"));

		Book[] books = { tb1, rb1, rb2, tb2, tb3, tb4, rb4, rb5, tb5, rb3, };

		
		//Tìm sách thuộc nhà xuất bản nhi đồng
		// anonymous class
		Condition ndCondition = new Condition() {

			@Override
			public boolean test(Book book) {
				return "Nhi Đồng".equals(book.getPublisher());
			}
		};

		Book[] result = findBooks(books, ndCondition);
		generate("1. Sách thuộc nhà xuất bản 'Nhi Đồng'", result);

		// Sách có đơn giá nhỏ hơn 40
//		result = findBooksBySaleSPrice(books);
		Condition ltPriceCondition = new Condition() {
			
			@Override
			public boolean test(Book book) {
				return book.getSalesPrice().doubleValue() < 100;
			}
		};
		
		result = findBooks(books, ltPriceCondition);
		generate("2.Sách có đơn giá nhỏ hơn 100", result);

		// Sách có đơn giá từ 40 - 80
		result = findBooksBySaleSPrice(books, 40, 80);
		generate("3. Sách có đơn giá từ 40 đến 80", result);

		Order[] orders = { new Order(tb1, 2), new Order(tb2, 1), new Order(rb3, 2) };
		exportBill(orders);

	}
	// điều kiện(biểu thức) từ các hàm
	// givenPubs.equals(book.getPublisher())
	// book.getSalesPrice().doubleValue() < 50
	// book.getSalesPrice().doubleValue() >= from && book.getSalesPrice().doubleValue() <= to

	// ==> công thức chung là: boolean test(Book book)

	// strategy pattern

	// dựa vào điều kiện(biểu thức) ở các hàm, tìm ra công thức chung của các biểu
	// thức đó
	// công thức chung: --> hàm trừu tượng chỉ có tham số truyền vào, kdl trả về,
	// chưa có phần thực thi
	// + các hàm đó có input đầu vào là gì
	// + kiểu dữ liệu trả về là gì
	// + tên hàm bất kì(phụ thuộc vào chức năng đặt cho hợp lý)

	// phần thực thi của công thức chung như thế nào là do điều kiện mà người dùng
	// truyền vào

	// tạo ra 1 interface/abstract class chứa hàm trừu tượng(công thức chung)
	// Condition: boolean test(Book book)
	// Truyền interface thành tham số cho hàm

	// condition.test(book)
	// lúc compile sẽ gọi hàm test ở interface Condition
	// lúc runtime sẽ gọi hàm test ở giá trị mà user truyền vào cho biến condition
	// khi gọi
	// hàm findBooks

	// condition = ndCondition(H1)
	// condition = ltPriceCondition(H2)

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

	private static Book[] findBooksByPublisher(Book[] books, String givenPubs) {
		Book[] result = new Book[books.length];
		int count = 0;
		for (Book book : books) {
			if (book.getPublisher().equals(givenPubs)) {
				result[count++] = book;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}

//	private static Book[] findBooksByPublisher(Book[] books) {
//		Book[] result = new Book[books.length];
//		int count=0;
//		for(Book book : books) {
//			if("Nhi Đồng".equals(book.getPublisher())) {
//				result[count++] = book;
//			}
//		}
//		return Arrays.copyOfRange(result, 0, count);
//	}
	private static Book[] findBooksBySaleSPrice(Book[] books) {
		Book[] result = new Book[books.length];
		int count = 0;
		for (Book book : books) {
			if (book.getSalesPrice().doubleValue() < 50) {
				result[count++] = book;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}

	// Tìm sách có đơn giá từ 40 - 80
	private static Book[] findBooksBySaleSPrice(Book[] books, double from, double to) {
		Book[] result = new Book[books.length];
		int count = 0;
		for (Book book : books) {
			double price = book.getSalesPrice().doubleValue();
			if (price >= from && price <= to) {
				result[count++] = book;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}

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
