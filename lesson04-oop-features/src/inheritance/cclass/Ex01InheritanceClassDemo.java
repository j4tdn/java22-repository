package inheritance.cclass;

import java.math.BigDecimal;
import java.util.Arrays;

public class Ex01InheritanceClassDemo {
	public static void main(String[] args) {
		/*
		 Bài toán: Viết chương trình quản lý lưu trữ sách trong nhà sách 
		 trong đó quản lý 2 loại sách chính:
		 1. Sách giáo khoa: mã sách, tên sách, giá bán, nxb, tình trạng, %giảm giá(sách cũ)
		 2. Sách tham khảo: mã sách, tên sách, giá bán, nxb, %thuế, tình trạng
		 
		 Book: id, name, salesPrice, publisher
		 TextBook extends Book: status, discount
		 ReferenceBook extends: tax
		 
		 Hệ thống có rất nhiều sách, ứng dụng để tìm kiếm, tính toán dễ dàng
		 
		 Câu 1: Liệt kê các cuốn sách thuộc nhà xuất bản Nhi Đồng
		 Câu 2: Liệt kê các cuốn sách được giảm giá 
		 Câu 3: Giải lập việt mua 1 vài cuốn sách và tính tổng tiền
		 + SGK: số tiền = salesPrice(100 - %discount)/100
		 + STK: số tiền = salesPrice(100+ %tax)/100
		 */
		// Ts1, Toán 1, 20, Nhi Đồng, cũ, 5%
		
		TextBook tb1 = new TextBook("Ts1", "Toán 1", new BigDecimal("20"), "Nhi Đồng", false, new BigDecimal("5"));
		TextBook tb2 = new TextBook("Ls2", "Lý 1", new BigDecimal("42"), "Nhi Đồng", true, new BigDecimal("0"));
		TextBook tb3 = new TextBook("Hs2", "Hóa 1", new BigDecimal("36"), "BGD", false, new BigDecimal("8"));
		
		ReferenceBook rb1 = new ReferenceBook("V1", "Văn 1", new BigDecimal("88"), "BGD", new BigDecimal("10"));
		ReferenceBook rb2 = new ReferenceBook("S1", "Sử 1", new BigDecimal("70"), "BGD", new BigDecimal("8"));
		ReferenceBook rb3 = new ReferenceBook("D1", "Địa 1", new BigDecimal("120"), "Nhi Đồng", new BigDecimal("6"));
		ReferenceBook rb4 = new ReferenceBook("S2", "Sinh 2", new BigDecimal("66"), "Nhi Đồng", new BigDecimal("8"));
	
		Book[] books = {tb1, tb2, tb3, rb1, rb2, rb3, rb4};
		
		Book[] booksByPublisher = getBooksByPublisher(books);
		printf("Liệt kê các cuốn sách thuộc nhà xuất bản Nhi Đồng", booksByPublisher);
		
		Book[] booksWithDiscount = getBooksWithDiscount(books);
		printf("Liệt kê các cuốn sách được giảm giá", booksWithDiscount);
		
		Book[] selectedBooks = new Book[] {tb1, tb2, rb1};
		BigDecimal totalOfMoney = calcTotalOfMoney(selectedBooks);
		System.out.println("Tổng tiền phải thanh toán: " + totalOfMoney);
	}
	private static BigDecimal calcTotalOfMoney(Book[] selectedBooks) {
		BigDecimal totalOfMoney = BigDecimal.ZERO;
	
		for (Book book: selectedBooks) {
			BigDecimal price = book.getSalesPrice();
			if (book instanceof TextBook) {
				BigDecimal discount = ((TextBook)book).getDiscount();
				price = price.multiply(new BigDecimal("100").subtract(discount)).divide(new BigDecimal("100"));
			} else if (book instanceof ReferenceBook) {
				BigDecimal tax = ((ReferenceBook)book).getTax();
				price = price.multiply(new BigDecimal("100").add(tax)).divide(new BigDecimal("100"));
			}
			System.out.println(".. Giá của sách " + book.getId() + " = " + price);
			totalOfMoney = totalOfMoney.add(price);
		}
		return totalOfMoney;
	}
	private static Book[] getBooksWithDiscount(Book[] books) {
		Book[] result = new Book[books.length];
		int counter = 0;
		for (Book book: books) {
			//Mỗi book là 1 phần tử trong books, có thể text/reference(runtime) book
			// Compile: book là KDL Book
			//Kiểm tra nếu book thật sự là textbook lúc runtime
			if (book instanceof TextBook) {
				// ép kiểu sang TextBook, để có thể gọi các hàm riêng của TextBook là compile
				// muốn éo biến từ KDL cha sang con thì phải kiểm tra biến cha đó lúc runtime chính xác là con rồi mới ép
				TextBook tb = (TextBook)book;
				if (!tb.getDiscount().equals(BigDecimal.ZERO)) {
					result[counter++] = book;
				}
			}
		}
		return Arrays.copyOfRange(result, 0, counter);
	}
	// tham số: tất cả các cuốn sách
	// trả về: 1 hoặc nhiều cuốn sách thuộc NXB Nhi Đồng
	
	private static Book[] getBooksByPublisher(Book[] books) {
		//mảng: fixed-length, tạo mảng cần biết được số lượng ptu tối đa được lưu trữ
		Book[] result = new Book[books.length];
		int counter = 0;// chính là số lương ptu thật sự đang lưu trữ trong result
		for (Book book:books) {
			if (book.getPublisher().equals("Nhi Đồng")) {
				result[counter] = book;
				counter++;
			}
		}
		// return result[0, 4)
		// copy mảng result sang mảng mới, chỉ lấy các phần tử từ [0, 4)
		return Arrays.copyOfRange(result, 0, counter);
	}
	private static void printf(String prefix, Book[] books) {
		System.out.println(prefix + " {");
		for (Book book: books) {
			System.out.println(" + " + book);
		}
		System.out.println("}\n");
	}

}
 