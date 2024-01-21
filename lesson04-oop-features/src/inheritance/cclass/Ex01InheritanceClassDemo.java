package inheritance.cclass;

import java.math.BigDecimal;
import java.util.Arrays;

public class Ex01InheritanceClassDemo {
	
	public static void main(String[] args) {
		/*
		 * Bài toán: Viết chương trình quản lý lưu trữ sách trong nhà sách
		 * Trong đó quản lý 2 loại sách chính:
		 * 
		 * Sách giáo khoa: mã sách, tên sách, giá bán, nxb, tình trạng, %giảm giá(nếu sách cũ)
		 * Sách tham khảo: mã sách, tên sách, giá bán, nxb, %thuế
		 * 
		 * Book: id, name, salesPrice, publisher
		 * 
		 * TextBook extends Book: status, discount
		 * ReferenceBook extends Book: tax
		 * 
		 * Hệ thống có rất nhiều sách, ứng dụng để tìm kiếm, tính toán dễ hơn
		 * 
		 * 1/ Liệt kê sách của NXB Nhi Đồng
		 * 2/ Liệt kê sách được giảm giá
		 * 3/ Giải lập việc mua 1 vài cuốn sách, tính tổng tiền
		 * --> SGK: số tiền = salePrice(100-%discount)/100
		 * --> STK: số tiền = salePrice(100+%tax)/100
		 */
		
		// Ts1, Toán 1, 20, Nhi Đồng, cũ, 5%
		
		TextBook tb1 = new TextBook("Ts2", "Toán 1", new BigDecimal("20"), "Nhi Đồng", false, new BigDecimal("5")); // H1
		TextBook tb2 = new TextBook("Ls1", "Lý 1", new BigDecimal("42"), "Nhi Đồng", true, new BigDecimal("0"));
		TextBook tb3 = new TextBook("Hs1", "Hóa 1", new BigDecimal("36"), "BGDVĐT", false, new BigDecimal("8"));
		
		ReferenceBook rb1 = new ReferenceBook("V1", "Văn 1", new BigDecimal("88"), "BGDVDDT", new BigDecimal("10"));
		ReferenceBook rb2 = new ReferenceBook("S1", "Sử 1", new BigDecimal("88"), "BGDVDDT", new BigDecimal("8"));
		
		Book[] books = {tb1, tb2, tb3, rb1, rb2};
		Book[] bookGetByPub = getBookByPublisher(books);
		Book[] withDiscount = getBookWithDiscount(books);
		printf("1/ Liệt kê sách của nxb Nhi Đồng", bookGetByPub);
		printf("2/ Liệt kê sách được giảm giá", withDiscount);
		Book[] selectedBooks = new Book[]{tb1, tb2, tb3};
		BigDecimal total= totalOfMoney(new Book[] {tb1, tb2, tb3});
		System.out.println("Tổng tiền: " + total);
	}
	
	private static Book[] getBookWithDiscount(Book[] books) {
		Book[] result = new Book[books.length];
		int count = 0;
		for (Book b: books) {
		
			/*
			 Mỗi book là một phần tử trong books, có thể text/ reference(runtime) book
			 Compile: book là KDL book
			 Kiểm tra nếu book thực sư là textbook lúc runtime
			 */
			if(b instanceof TextBook) {
				//Ép kiểu sang TextBook để có thể gọi các hàm riêng của TextBook là compile
			    //Muốn ép biến từ kdl cha sang con thì phải kiểm tra biến cha lúc đó runtime chính xác là con rồi ép
				TextBook tb = (TextBook) b;
			    if(!tb.getDiscount().equals(BigDecimal.ZERO)) {
			    	result[count++] = b;
			    			    	
			    }
			}
		}
		
		return Arrays.copyOfRange(result, 0, count);//--> copy mảng result sang mảng mới, chỉ lấy các phần tử từ [0,4)
	}
	
	private static Book[] getBookByPublisher(Book[] books) {
		//mảng: fixed-length, tạo mảng cần biết được số lượng phần tử tối đa được lưu trữ 
		Book[] result = new Book[books.length];
		int count = 0; //số lượng phần tử thực sự đang lưu trữ trong result
		for(Book b: books) {
			if (b.getPublisher().equals("Nhi Đồng")){
				result[count] = b;
				count++;
			}
		}
		//return result(0, 4]
		return Arrays.copyOfRange(result, 0, count);//--> copy mảng result sang mảng mới, chỉ lấy các phần tử từ [0,4)
		
	}
	
	private static BigDecimal totalOfMoney(Book[] selectedBooks) {
		BigDecimal total = BigDecimal.ZERO;
		System.out.println("3/ Giá sách: ");
		for (Book b: selectedBooks) {
			BigDecimal price = b.getSalesPrice();
			if (b instanceof TextBook) {
				BigDecimal discount = ((TextBook)b).getDiscount();
				price = price.multiply(new BigDecimal("100").subtract(discount)).divide(new BigDecimal("100"));
			} else if (b instanceof ReferenceBook) {
				BigDecimal tax = ((ReferenceBook)b).getTax();
				price = price.multiply(new BigDecimal("100").add(tax)).divide(new BigDecimal("100"));
				
			}
			System.out.println(b.getId() + " = " + price);
			total = total.add(price);
		}
		return total;
		
	}
	
	private static void printf(String prefix, Book[] books) {
		System.out.println(prefix + "{");
		for (Book b: books) {
			System.out.println("+ " + b);
		}
		System.out.println("}\n");
	}
		
}