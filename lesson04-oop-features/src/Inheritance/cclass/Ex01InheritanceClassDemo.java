package Inheritance.cclass;

import java.math.BigDecimal;
import java.util.Arrays;

public class Ex01InheritanceClassDemo {

	public static void main(String[] args) {
       /*
         Bài toán: Viết chương trình quản lý lưu trữ sách trong nhà sách 
         Trong đó quản lý 2 loại sách chính: 
         
         Sách giáo khoa: mã sách, tên sách, giá bán, nxb, tình trạng, %giảm giá(nếu sách cũ) 
         Sách tham khảo: mã sách, tên sách, giá bán, nxb, %thuế 
         
         Book: id, name, salesPrice, publisher 
         
         TextBook extends Book: status, discount
         ReferenceBook extends Book: tax 
        */
		
		TextBook tb1 = new TextBook("Ts2", "Toan 1", new BigDecimal("20"), "Nhi Dong", false, new BigDecimal(5));
		TextBook tb2 = new TextBook("Ls2", "Ly 1", new BigDecimal("42"), "Nhi Dong", true, new BigDecimal(0));

		TextBook tb3 = new TextBook("Hs2", "Hoa 1", new BigDecimal("36"), "BGD", false, new BigDecimal(8));
		
		ReferenceBook rb1 = new ReferenceBook("V1", "Van 1", new BigDecimal("88"),"BGD", new BigDecimal("10"));
		ReferenceBook rb2 = new ReferenceBook("S1", "Su 1", new BigDecimal("70"),"BGD", new BigDecimal("8"));
		ReferenceBook rb3 = new ReferenceBook("D1", "Dia 1", new BigDecimal("120"),"Nhi Dong", new BigDecimal("6"));
		ReferenceBook rb4 = new ReferenceBook("S1", "Sinh 1", new BigDecimal("66"),"Nhi Dong", new BigDecimal("8"));

        Book[] books = {tb1,tb2,tb3,rb1,rb2,rb3,rb4};
        Book[] booksByPublicsher = getBooksByPublisher(books);
        printf("Cau 1: Liet ke cac cuon sach thuoc nha xuat ban Nhi Dong", booksByPublicsher);
        printf("Cau 2: Liet ke cac cuon sach duoc giam gia ", getBookWithDiscount(books));

        Book[] selectedBooks = new Book[] {tb1,tb2,rb1};
        BigDecimal totalOfMoney = calcTotalOfMoney(selectedBooks);
        System.out.println("3. Tong tien phai thanh toan: " + totalOfMoney);
        
        
	}
	private static BigDecimal calcTotalOfMoney(Book[] selectedBooks) {
		//Sách giáo khoa: số tiền = salesPrice(100 - %discount)/100 
		//Sách tham khảo: số tiền = salesPrice(100 + %tax)/100 
		
		BigDecimal totalOfMoney = BigDecimal.ZERO;
		
		for (Book book: selectedBooks) {
			BigDecimal price = book.getSalesPrice();
			if( book instanceof TextBook) {
				BigDecimal discount = ((TextBook)book).getDiscount();
				price = price.multiply(new BigDecimal("100").subtract(discount)).divide(new BigDecimal("100"));
			}else if( book instanceof ReferenceBook) {
				BigDecimal tax = ((ReferenceBook)book).getTax();
				price = price.multiply(new BigDecimal("100").add(tax)).divide(new BigDecimal("100"));
			}
			System.out.println("gia sach " + book.getId() + " = " + price);
			
			totalOfMoney = totalOfMoney.add(price);
		}
		return totalOfMoney;
		
	}
	private static Book[] getBookWithDiscount(Book[] books) {
		Book[] rs = new Book[books.length];
		int counter = 0;
		for(Book book: books) {
			//if (book != null && book.getClass() == TextBook.class) 
			if( book instanceof TextBook) { 
				TextBook tb = (TextBook)book;
				//Ép kiểu sang , để có thể gọi các hàm riêng của Textbook là compile 
				//Muốn ép biến từ KDL cha sang con thì phải kiểm tra biến cha đó lúc runtime chính xác là con rồi ép  
				if( !tb.getDiscount().equals(BigDecimal.ZERO)) {
					rs[counter++] = book;
				}
			}
		}
		return Arrays.copyOfRange(rs, 0, counter);
	}
	private static Book[] getBooksByPublisher(Book[] books) {
		Book[] rs = new Book[books.length];
		int counter = 0;
		
		for(Book book: books) {
			if (book.getPublisher().equals("Nhi Dong")){
			rs[counter] = book;
			counter++;
			}
		}
		return Arrays.copyOfRange(rs,0,counter);
	}
	private static void printf(String prefix, Book[] books) {
		System.out.println(prefix + "{"); 
		for(Book book: books) {
			System.out.println(" + " + book);
		}
		System.out.println("}\n");
	}

}
