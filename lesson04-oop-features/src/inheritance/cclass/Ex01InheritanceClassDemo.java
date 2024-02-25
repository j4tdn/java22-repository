package inheritance.cclass;

import java.math.BigDecimal;
import java.util.Arrays;

public class Ex01InheritanceClassDemo {
	public static void main(String[] args) {
		
		
		ReferenceBook tb1 = new ReferenceBook("Ts2", "Toán 1", new BigDecimal("20"), "Nhi Đồng", false, new BigDecimal("5"));
		ReferenceBook tb2 = new ReferenceBook("Ls1", "Lý 1", new BigDecimal("42"), "Nhi Đồng", false, new BigDecimal("0"));
		ReferenceBook tb3 = new ReferenceBook("Hs1", "Hoá 1", new BigDecimal("36"), "BGDVDT", false, new BigDecimal("8"));
		
		TaxBook tx1 = new TaxBook("V1", "Văn 1", new BigDecimal("88"), "BGDVDT", new BigDecimal("10"));
		TaxBook tx2 = new TaxBook("S1", "Sử 1", new BigDecimal("70"), "BGDVDT", new BigDecimal("8"));
		TaxBook tx3 = new TaxBook("Đ1", "Địa 1", new BigDecimal("120"), "Nhi Đồng", new BigDecimal("6"));
		TaxBook tx4 = new TaxBook("V1", "Văn 1", new BigDecimal("66"), "BGDVDT", new BigDecimal("8"));
		
		Book[] books = {tb1, tb2, tb3, tx1, tx2, tx3, tx4};
		
		Book[] booksBypublisher = getBooksByPublisher(books);
		printf("Câu 1", booksBypublisher);
		
		Book[] booksWithDiscount = getBooksWithDiscount(books);
		printf("Câu 2", booksWithDiscount);
	
	}
	// tham số: tất cả cuôn sách 
	//trả về 1 hoặc nhiều cuôn sách thuộc NXB Nhi Đồng
	
	private static Book[] getBooksWithDiscount(Book[] books) {
		
		Book[] result = new Book[books.length]; 
		
		int counter = 0;
		for (Book book: books) {
			// Mỗi book là 1 phần tử trong books, có thể text/reference (runtime) book
			// Compile: book là KDL Book
			
			// Kiểm tra nếu book thật sự là textbook lúc runtime
			
			if(book instanceof ReferenceBook) {
				ReferenceBook tb = (ReferenceBook) book;
				if(!tb.getDiscount().equals(BigDecimal.ZERO)) {
					result[counter++] = book;
				}
				
			}
		}
		return Arrays.copyOfRange(result, 0, counter);
	}
	private static void printf(String prefix, Book[] books) {
		System.out.printf(prefix + " {");
		for (Book book: books) {
			System.out.println(" + " + book);
		}
		System.out.println("}\n");
	}
	
		/*
		 * Bai toan: Viet chuong trinh quan ly luu tru trong nha sach 
		 * trong do : quan ly 2 loai sach chinh:
		 * Sach giao khoa: ms, ten sach, gia ban, nxb, tinh trang, %giam gia(neu sach cu)
		 * sach tham khao: ms, ten sach, gia ban, nxb, % thue
		 * 
		 * Book: id, name, salesPrice, publisher
		 * 
		 * TextBook: status, discount
		 * referenceBook extends Book: tax 
		 * 
		 */
		//ReferenceBook tb1 = new ReferenceBook("Ts2", "Toán 1", new BigDecimal("20"), "Nhi Đồng", false, new BigDecimal("5"));
		//System.out.println("tb1 --> " +tb1);
	

}
