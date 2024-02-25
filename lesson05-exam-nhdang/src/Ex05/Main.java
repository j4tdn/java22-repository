package Ex05;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
public class Main {
	ArrayList<Book> book = new ArrayList<>();
	public static void main(String[] args) {
		Main m = new Main();
		m.bookList();
		m.nhiDongBook();
		m.priceLessThan50();
		m.priceBetween100and200();
		m.price();
	}
	public void bookList() {
		RefBook r1 = new RefBook("STK01", new BigDecimal("10"), "Nhi Đồng", new BigDecimal("20"));
		RefBook r2 = new RefBook("STK02", new BigDecimal("121"), "IPM", new BigDecimal("15"));
		TextBook t1 = new TextBook("SGK01", new BigDecimal("60"), "Nhi Đồng", "new");
		TextBook t2 = new TextBook("SGK02", new BigDecimal("30"), "Nhi Đồng", "old");
		TextBook t3 = new TextBook("SGK03", new BigDecimal("190"), "Hikari", "old");
		book.add(r1);
		book.add(r2);
		book.add(t1);
		book.add(t2);
		book.add(t3);
		for (Book b: book) {
			  System.out.println(b);
		  }
	}
	public void nhiDongBook() {
		System.out.println("\nCác tựa sách của NXB Nhi Đồng: ");
		for (Book b: book) {
			if(b.getPublisher().equalsIgnoreCase("Nhi Đồng")) {
				System.out.println(b);
			}
		}
	}
	public void priceLessThan50() {
		System.out.println("\nCác tựa sách có giá nhỏ hơn 50: ");
		for (Book b: book) {
			if(b.getPrice().compareTo(new BigDecimal("50"))<0) {
				System.out.println(b);
			}
		}
	}
	public void priceBetween100and200() {
		System.out.println("\nCác tựa sách có giá trong khoảng 100 đến 200: ");
		for (Book b: book) {
			if(b.getPrice().compareTo(new BigDecimal("200"))<=0&&b.getPrice().compareTo(new BigDecimal("100"))>=0) {
				System.out.println(b);
			}
		}
	}

	public void price() {
		Customer c1 = new Customer(1, "Nguyễn Văn A", "0123456789", "Đà Nẵng");
		ArrayList<Book> bookToBuy = new ArrayList<>(book);
		RefBook r2 = new RefBook("STK02", new BigDecimal("121"), "IPM", new BigDecimal("15"));
		TextBook t2 = new TextBook("SGK02", new BigDecimal("30"), "Nhi Đồng", "old");
		bookToBuy.add(t2);
		bookToBuy.add(r2);
		BigDecimal totalPrice = BigDecimal.ZERO;
		for(Book b: bookToBuy) {
			BigDecimal xPrice;
			if(b instanceof RefBook) {
				BigDecimal rPrice = b.getPrice();
				BigDecimal rTax = ((RefBook) b).getTax();
				xPrice = rPrice.multiply(rTax.divide(new BigDecimal("100")).add(new BigDecimal("1")));
				totalPrice=totalPrice.add(xPrice);
			}
			else if (b instanceof TextBook) {
	            BigDecimal tPrice = b.getPrice();
	            String tStatus = ((TextBook) b).getStatus();
	            BigDecimal oldBookPrice;
	            if (tStatus.equalsIgnoreCase("old")) {
	                oldBookPrice = tPrice.subtract(tPrice.multiply(new BigDecimal("0.3")));
	                totalPrice = totalPrice.add(oldBookPrice);
	            } else {
	                totalPrice = totalPrice.add(tPrice);
	            }
	        }
		}
		System.out.println("\nKhách hàng " + c1.getCustomerName() + " đã mua 1 sách tham khảo và 1 sách giáo khoa với tổng tiền " + totalPrice);
		
	}
}
