package inheritance.cclass;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;


public class Ex01InheritanceClassDemo {
	
	public static void main(String[] args) {
		/*
		 Bài toán: Viết chương trình quản lí lưu trữ sách trong nhà sách
		 Trong đó quản lí 2 loại sách chính: 
		 Sách giáo khoa: mã sách, tên sách, giá bán, nxb, tình trạng, %giảm giá(nếu sách cũ)
		 Sách tham khảo: mã sách, tên sách, giá bán, nxb, %thuế
		 
		 Book: id, name, salesPrice, publisher
		 
		 TextBook extends Book: status, discount
		 
		 ReferenceBook extends Book: tax 
		 
		 Hệ thống có rất nhiều sách, ứng dụng để tìm kiếm, tính toán dễ hơn
		 
		 Câu 1: Liệt kê các cuốn sách thuộc nhà xuất bản Nhi Đồng
		 Câu 2: Liệt kê các cuốn sách đc giảm giá
		 Câu 3: Giải lập việc mua 1 vài cuốn sách và tính tổng tiền
		 
		 Sách giáo khoa: số tiền = giá sách(100 - %discount)/100
		 Sách tham khảo: số tiền = salePrice(100 + %tax)/100
		 */
		
		TextBook tb1 = new TextBook("Ts2", "Toán 1", new BigDecimal("20"), "Nhi Đồng", false, new BigDecimal("5"));
		TextBook tb2 = new TextBook("Ls2", "Lý 1", new BigDecimal("42"), "Nhi Đồng", false, new BigDecimal("0"));
		TextBook tb3 = new TextBook("Hs2", "Hóa 1", new BigDecimal("36"), "BGDVDT", false, new BigDecimal("8"));
		
		ReferenceBook rb1=new ReferenceBook("V1","Văn 1", new BigDecimal("88"),"BGD", new BigDecimal("10"));
		ReferenceBook rb2=new ReferenceBook("S1","Sử 1", new BigDecimal("70"),"BGD", new BigDecimal("8"));
		ReferenceBook rb3=new ReferenceBook("V1","Địa 1", new BigDecimal("120"),"Nhi Đồng", new BigDecimal("6"));
		ReferenceBook rb4=new ReferenceBook("V1","Sinh 1", new BigDecimal("66"),"Nhi Đồng", new BigDecimal("8"));
		
		Book[] books= {tb1, tb2, tb3, rb1, rb2, rb3, rb4};
		
		Book[] booksByPublisher = getBooksByPublisher(books);
		printf("Câu 1 :Liệt kê các cuốn sách thuộc nhà xuất bản Nhi Đồng", booksByPublisher);
		
		Book[] bookWithDiscount = getBooksWithDiscount(books);
		printf("Câu 2 :Liệt kê các cuốn sách đc giảm giá", bookWithDiscount);
		
		Book[] selectedBook=new Book[] {tb1, tb2, rb1};
		BigDecimal totalOfMoney=calcTotalOfMoney(selectedBook);
		System.out.println("3. Tổng tiền phải thanh toán: "+totalOfMoney);
		
	}
	
	private static BigDecimal calcTotalOfMoney(Book[] selectedBooks) {
		BigDecimal totalofMoney=BigDecimal.ZERO;
		
		for(Book book : selectedBooks) {
			BigDecimal price=book.getSalesPrice();
			if(book instanceof TextBook) {
				BigDecimal discount=((TextBook)book).getDiscount();
				price=price.multiply(new BigDecimal("100").subtract(discount)).divide(new BigDecimal("100"));
			}
			else if(book instanceof ReferenceBook) {
				BigDecimal tax=((ReferenceBook)book).getTax();
				price=price.multiply(new BigDecimal("100").add(tax)).divide(new BigDecimal("100"),10, RoundingMode.HALF_UP);
			}
			System.out.println(">>Giá của sách "+ book.getId()+" = " + price);
			totalofMoney = totalofMoney.add(price);
		}
		return totalofMoney;
	}
	
	private static Book[] getBooksWithDiscount(Book[] books) {
		Book[] result=new Book[books.length];		
		int counter=0;
		for(Book book:books) {
			//Mỗi book là 1 phần tử trong books, có thể text/reference(runtime) book
			//Compile: book là 1 kdl Book
			
			//kiểm tra nếu book thật sự là textbook lúc runtime
			//if(book instanceof TextBook) {
			if(book!=null && book.getClass() == TextBook.class) {
				//ép kiểu sang TextBook, để có thể gọi các hàm riêng của TextBook là compile
				//muốn ép biến từ KDL cha sang con thì phải kiểm tra biến cha đó lúc runtime chính xác là con rồi ép
				TextBook tb = (TextBook)book;
				if(!tb.getDiscount().equals(BigDecimal.ZERO)) {
					result[counter++] = book;
				}
				
			}
			
		}
		return Arrays.copyOfRange(result, 0, counter);
	}
	
	//tham số: tất cả các cuốn sách
	//trả về: 1 hoặc hiều cuốn sách thuộc NXB Nhi Đồng
	
	private static Book[] getBooksByPublisher(Book[] books) {
		//mảng: fixed-length, tạo mảng cần biết đc số lượng phần tử tối đa đc lưu trữ
		Book[] result=new Book[books.length];		
		int counter=0;
		for(Book book:books) {
			if(book.getPublisher().equals("Nhi Đồng")) {
				result[counter] = book;
				counter++;
			}
		}
		//return result[0,4)
		//copy mảng result sang mảng mới, chỉ lấy các phần tử [0,4)
		
		return Arrays.copyOfRange(result, 0, counter);
	}
	
	private static void printf(String prefix, Book[] books) {
		System.out.println(prefix + "{");
		for(Book book:books) {
			System.out.println(" + " + book);
		}
		System.out.println("}\n");
		
	}
}