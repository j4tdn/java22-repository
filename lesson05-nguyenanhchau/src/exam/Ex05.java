package exam;
import java.math.BigDecimal;
import java.util.Arrays;

import bean.Book;
import bean.Customer;
import bean.Referencebook;
import bean.Textbook;

public class Ex05 {

	public static void main(String[] args) {
		Textbook tb1 = new Textbook("SGK01",new BigDecimal("120.300") , "Nhi Dong" , true );
		Textbook tb2 = new Textbook("SGK02",new BigDecimal("40.700") , "Nha Trang" , false );
		Textbook tb3 = new Textbook("SGK03",new BigDecimal("32.800") , "Tien Phong" , true );
		
		Referencebook rb1 = new Referencebook("STK01", new BigDecimal("12.200"), "Nha Nam" , new BigDecimal("3.2"));
		Referencebook rb2 = new Referencebook("STK02", new BigDecimal("57.400"), "Nhi Dong" , new BigDecimal("4.2"));

        Book[] book = {tb1,tb2,tb3,rb1,rb2};
        Book[] booksByPublisher = getBooksByPublisher(book);
        Book[] booksPriceunderfifty = getBooksunderfifty(book);
        Book[] booksPricebetween = getBookspricebetween(book);
        BigDecimal total = totalPayment(tb2, rb2);

        
        System.out.print("Cac sach thuoc nha xuat ban Nhi Dong : " );
        print(booksByPublisher);
        System.out.print("Cac sach co don gia duoi 50.000 dong : " );
        print(booksPriceunderfifty);
        System.out.print("Cac sach giao khoa co don gia tu 100.000 den 200.000 : ");
        print(booksPricebetween);
        System.out.print("So tien can phai thanh toan khi mua sach giao khoa tb2 va sach tham khao rb2 = " + total);
        
        

        
        
        
	}
	private static Book[] getBooksByPublisher(Book[] book) {
		Book[] rs = new Book[book.length];
		int count = 0;
		for( int i = 0 ; i < book.length; i++) {
			if (book[i].getPublisher().equals("Nhi Dong")){
				rs[count] = book[i];
				count++;
			}
			
		}
		return Arrays.copyOfRange(rs,0,count);
	}
	private static Book[] getBooksunderfifty(Book[] book) {
		Book[] rs = new Book[book.length];
		int count = 0;
		for( int i = 0 ; i < book.length; i++) {
			if (book[i].getPrice().compareTo(new BigDecimal("50.000")) < 0){
				rs[count] = book[i];
				count++;
			}
			
		}
		return Arrays.copyOfRange(rs,0,count);

	}
	private static Book[] getBookspricebetween(Book[] book) {
		Book[] rs = new Book[book.length];
		int count = 0;
		for( int i = 0 ; i < book.length; i++) {
			if( book[i] instanceof Textbook) { 
				Textbook tb = (Textbook)book[i];
				if (tb.getPrice().compareTo(new BigDecimal("100.000")) >= 0 && tb.getPrice().compareTo(new BigDecimal("200.000")) <= 0){
				    rs[count] = tb;
				    count++;
				}
			}
		}
		return Arrays.copyOfRange(rs,0,count);
	}
	public static BigDecimal totalPayment(Textbook textbook, Referencebook referencebook) {
        BigDecimal total = BigDecimal.ZERO;
        BigDecimal textbookPrice = textbook.getPrice();
        if (!textbook.isStatus()) {
            textbookPrice = textbookPrice.multiply(new BigDecimal("0.7")); 
        }
        BigDecimal referencebookPrice = referencebook.getPrice();
        BigDecimal taxRate = referencebook.getTax().divide(new BigDecimal("100"));
        BigDecimal referencebookTotalPrice = referencebookPrice.multiply((new BigDecimal("1")).add(taxRate));

        total = total.add(textbookPrice).add(referencebookTotalPrice);

        return total;
    }


	private static void print(Book[] book) {
		System.out.print("\n");
		for (Book b : book) {
			System.out.print("+");
		    System.out.println(b); 
		}
	}

}
