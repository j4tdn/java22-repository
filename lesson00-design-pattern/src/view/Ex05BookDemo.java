package view;

import java.math.BigDecimal;
import java.util.Arrays;

import bean.Book;
import bean.Order;
import bean.ReferenceBook;
import bean.TextBook;

public class Ex05BookDemo {
	
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
		Book[] result = findBooksByPublisher(books, "Nhi Đồng");
		generate("1. Sách thuộc NXB 'Nhi Đồng'", result);
		
		
		// Tìm toàn bộ sách có đơn giá nhỏ hơn 50
		result = findBooksBySalesPrice(books);
		generate("2. Sách có đơn giá nhỏ hơn 50", result);
		
		// Tìm toàn bộ sách có đơn giá từ 40 đến 80
		result = findBooksBySalesPrice(books, 40, 80);
		generate("3. Sách có đơn giá từ 40 đến 80", result);
		
		// Tìm toàn bộ các sách tham khảo
		
		
		/* 
		Thực hiện giải lập. Khách hàng mua 3 cuốn sách giáo khoa, 2 cuốn sách
		tham khảo. Viết hàm tính tổng tiền mà khách hàng phải thanh toán. Biết
		rằng:

		- Sách giáo khoa - TextBook: Giảm 30% với sách cũ
		- Sách tham khảo - ReferBook: Thành tiền = đơn giá * (1 + %thuế/100)
		*/
		Order[] orders = { new Order(tb1, 2), new Order(tb2, 1), new Order(rb3, 2) };
		exportBill(orders);
		
	}
	
	// strategy pattern
	
	private static Book[] findBooksByPublisher(Book[] books, String givenPubs) {
		Book[] result = new Book[books.length];
		int count = 0;
		for (Book book: books) {
			// Nếu book nào có NXB là 'Nhi Đồng'
			// Lấy book đó đưa vào mảng result
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
			// Nếu book nào có đơn giá nhỏ hơn 50
			// Lấy book đó đưa vào mảng result
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
			// Nếu book nào có đơn giá nhỏ hơn từ 'from' đến 'to'
			// Lấy book đó đưa vào mảng result
			double price = book.getSalesPrice().doubleValue();
			if (price >= from && price <= to) {
				result[count++] = book;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
	
	private static void exportBill(Order[] orders) {
		BigDecimal totalOfMoney = bd("0");

		System.out.println("=== Xuất hóa đơn ===");
		for (Order order : orders) {
			Book book = order.getBook();
			BigDecimal price = order.getBook().getSalesPrice();

			if (book instanceof TextBook) {
				TextBook tb = (TextBook) book;
				if (!tb.isNew()) {
					price = price.multiply(bd("0.7"));
				}
			} else {
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
