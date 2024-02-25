package Ex05;

public class Main {
	
	 public static void main(String[] args) {
	        TextBook[] textBooks = {
	                new TextBook("SGK001", 150, "Nhi Đồng", true),
	                new TextBook("SGK002", 180, "Giao Đức", false),
	                new TextBook("SGK003", 210, "Nhi Đồng", true)
	        };

	        ReferBook[] referBooks = {
	                new ReferBook("STK001", 60, "Thái Hà", 0.1),
	                new ReferBook("STK002", 70, "Nhi Đồng", 0.12)
	        };
	        
	        findBooksByPublisher(textBooks, referBooks, "Nhi Đồng");
	        findBooksByPrice(textBooks, referBooks, 50);
	        findTextBooksByPriceRange(textBooks, 100, 200);

	        // Giải lập mua sách
	        simulatePurchase(textBooks, referBooks);
	    }

	    // Tìm toàn bộ sách thuộc nhà xuất bản Nhi Đồng
	    public static void findBooksByPublisher(TextBook[] textBooks, ReferBook[] referBooks, String publisher) {
	        System.out.println("Sách thuộc nhà xuất bản " + publisher + ":");
	        for (TextBook book : textBooks) {
	            if (book.getPublisher().equals(publisher)) {
	                System.out.println(book.getBookID() + " - Giá: " + book.getPrice());
	            }
	        }
	        for (ReferBook book : referBooks) {
	            if (book.getPublisher().equals(publisher)) {
	                System.out.println(book.getBookID() + " - Giá: " + book.getPrice());
	            }
	        }
	    }

	    // Tìm toàn bộ sách có đơn giá nhỏ hơn một ngưỡng giá
	    public static void findBooksByPrice(TextBook[] textBooks, ReferBook[] referBooks, double maxPrice) {
	        System.out.println("Sách có đơn giá nhỏ hơn " + maxPrice + ":");
	        for (TextBook book : textBooks) {
	            if (book.getPrice() < maxPrice) {
	                System.out.println(book.getBookID() + " - Giá: " + book.getPrice());
	            }
	        }
	        for (ReferBook book : referBooks) {
	            if (book.getPrice() < maxPrice) {
	                System.out.println(book.getBookID() + " - Giá: " + book.getPrice());
	            }
	        }
	    }

	    // Tìm toàn bộ sách giáo khoa có đơn giá từ một khoảng giá đến một khoảng giá
	    public static void findTextBooksByPriceRange(TextBook[] textBooks, double minPrice, double maxPrice) {
	        System.out.println("Sách giáo khoa có đơn giá từ " + minPrice + " đến " + maxPrice + ":");
	        for (TextBook book : textBooks) {
	            if (!book.isNew() && book.getPrice() >= minPrice && book.getPrice() <= maxPrice) {
	                System.out.println(book.getBookID() + " - Giá: " + book.getPrice());
	            }
	        }
	    }

	    // Giải lập mua sách
	    public static void simulatePurchase(TextBook[] textBooks, ReferBook[] referBooks) {
	        // Giả lập mua 1 cuốn sách giáo khoa và 1 cuốn sách tham khảo
	        TextBook purchasedTextBook = textBooks[0];
	        ReferBook purchasedReferBook = referBooks[0];

	        double totalPrice = calculateTotalPrice(purchasedTextBook, purchasedReferBook);
	        System.out.println("Tổng tiền mà khách hàng phải thanh toán: " + totalPrice);
	    }

	    // Hàm tính tổng tiền mà khách hàng phải thanh toán
	    public static double calculateTotalPrice(TextBook textBook, ReferBook referBook) {
	        double totalTextBookPrice = textBook.isNew() ? textBook.getPrice() : textBook.getPrice() * 0.7;
	        double totalReferBookPrice = referBook.getPrice() * (1 + referBook.getTaxRate());
	        return totalTextBookPrice + totalReferBookPrice;
	    }
	}

