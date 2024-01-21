package inheritance.cclass;

import java.math.BigDecimal;
import java.util.Arrays;

public class Ex01InheritanceClassDemo {
	public static void main(String[] args) {
		
	
	/*
	 * Bài toán: Viết chươn trình quản lý lưu trữ sách trong nhà sách
	 * 		Trong đó quản lý 2 loại sách:
	 * 			Sách giáo khoa: mã sách, tên sách, giá bán, nxb, tình trạng, %giảm giá
	 * 			Sách tham khảo: mã sách, tên sách, giá bán, nxb, %thuế
	 * 
	 * 		Book: id, name, salesPrice, publisher
	 * 	TextBook extends Book: status, discount
	 * 	ReferenceBook extends Book: tax
	 */
	//Ts1 , Toán 1, 20, Nhi Đồng, cũ, 5%
		
	// Câu 1 : Liệt kê các cuốn sách thuộc nhà xuất bản Nhi Đồng
	// Câu 2: Liệt kê các cuốn sách được giảm giá 
	// Câu 3: Giải lập việc mua 1 sách và tính tổng tiền
		
		TextBook tb1 = new TextBook("Ts1", "Toan 1",new BigDecimal("20"), "Nhi Dong" ,false, new BigDecimal("5"));
		TextBook tb2 = new TextBook("Ls1", "Ly 1",new BigDecimal("42"), "Nhi Dong" ,false, new BigDecimal("0"));
		TextBook tb3 = new TextBook("Hs1", "Hoa 1",new BigDecimal("36"), "BGD" ,false, new BigDecimal("8"));
		
		ReferenceBook rb1 = new ReferenceBook("V1","Van 1", new BigDecimal("88"),"BDG",new BigDecimal("10"));
		ReferenceBook rb2 = new ReferenceBook("S1","Su 1", new BigDecimal("70"),"BDG",new BigDecimal("8"));
		ReferenceBook rb3 = new ReferenceBook("D1","Dia 1", new BigDecimal("120"),"Nhi Dong",new BigDecimal("6"));
		ReferenceBook rb4 = new ReferenceBook("S2","Sinh 1", new BigDecimal("66"),"Nhi Dong",new BigDecimal("8"));
		
		Book[] books = {tb1, tb2, tb3, rb1, rb2, rb3, rb4};
		Book[] booksByPublisher = getBooksByPublisher(books);
		prinf("Câu 1: Liệt kê các cuốn sách thuộc nhà xuất bản Nhi Đồng",booksByPublisher );
		
		Book[] booksWithDiscount = getBooksWithDiscount(books);
		prinf("Câu 2: Liệt kê các cuốn sách được giảm giá",booksWithDiscount);
		
		Book[] selectedBooks = new Book[] {tb1, tb2, tb3};
		BigDecimal totalOfMoney = calcTotalOfMoney(selectedBooks);
		System.out.println("Số tiền phải thanh toán : "+totalOfMoney );
		//System.out.println(" tb1 --> "+tb1);
	}
	
	private static BigDecimal calcTotalOfMoney(Book[] selectedBooks) {
		BigDecimal result = BigDecimal.ZERO;
		for (Book book:selectedBooks) {
			BigDecimal price =book.getSalesPrice();
			if(book instanceof TextBook) {
				BigDecimal discount = ((TextBook)book).getDiscount();
				price = price.multiply(new BigDecimal("100").subtract(discount)).divide(new BigDecimal("100"));
			}else if(book instanceof ReferenceBook) {
				BigDecimal tax = ((ReferenceBook)book).getTax();
				price = price.multiply(new BigDecimal("100").subtract(tax)).divide(new BigDecimal("100"));
			}
			System.out.println(">> Giá của sách " +book.getId() + " = " + price);
			result = result.add(price);
		}
		return result;
	}
	
	private static Book[] getBooksWithDiscount(Book[] books) {
		Book[] result = new Book[books.length];
		int counter =0;//số lương phần tử thật sự đang lưu trữ trong result
		for (Book book:books) {
			// Mỗi Book là 1 phần tử trong books, có thêt text/reference (runtime) book
			//compile: book là KDL Book
			
			//Kiểm tra nếu book thật suẹ là textbook lúc runtime
			if (book instanceof TextBook) {
				//if(book != null && book.getClass())
				
				//ép kiểu sang TextBook, để có thể gọi hàm riêng của TextBook là compile
				//muốn ép kiểu từ KDL cha sang con thì phải kiểm tra biến cha lúc đó runtime chính xác là con rồi ép
				TextBook tb = (TextBook)book;
				if(tb.getDiscount().equals(BigDecimal.ZERO)) {
					result[counter] = book;
					counter++;
				}
			}
		}
		
		return Arrays.copyOfRange(result,0,counter);
	}
	
	private static Book[] getBooksByPublisher(Book[] books) {
		// mảng: fixed-length, tạo mảng cần biết được số ptu tối đa được lưu trữ
		Book[] result = new Book[books.length];
		int counter =0;//số lương phần tử thật sự đang lưu trữ trong result
		for (Book book:books) {
			if (book.getPublisher().equals("Nhi Dong")) {
				result[counter] = book;
				counter++;
			}
		}
		// return result [0,4)
		//copy mảng result sang mảng mới, chỉ lấy các phần tử [0,4)
		return Arrays.copyOfRange(result,0,counter);
	}
	
	private static void prinf(String prefix, Book[] books) {
		System.out.println(prefix + "{");
		for(Book book:books) {
			System.out.println(" + "+book);
		}
		System.out.println("}\n");
	}
}
