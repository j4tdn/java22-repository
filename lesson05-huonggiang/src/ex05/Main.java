package ex05;


import java.util.ArrayList;

public class Main {
	public static ArrayList<Book> createBookData() {
		ArrayList<Book> books = new ArrayList<>();
		
		TextBook textBook = new TextBook("SGK1", 150, "Nhi Đồng", true);
		TextBook textBook2 = new TextBook("SGK2", 200, "Nhi Đồng", false); 
		TextBook textBook3 = new TextBook("SGK3", 210, "Nhi Đồng", false);
		
		ReferBook referBook = new ReferBook("STK1", 30, "Nhi Đồng",5 );
		ReferBook referBook2 = new ReferBook("STK2", 80, "Nhi Đồng",10);
		 return books;
	}
		 // tìm toàn bộ sách thuộc nhi Đồng
		 public static void findBooksByPublisher(ArrayList<Book> books,String publisher) {
			 for(Book book : books) {
				 if(book.getPublisher().equals(publisher)) {
					 System.out.println("Mã sách: " + book.getId() + ",Đơn Giá: " + book.getPrice());
					 
				 }
			 }
		 }
	//tìm đon giá nhỏ hơn đơn giá cho trc
		 public static void findBooksByPrice(ArrayList<Book> books,double priceLimit) {
			 for(Book book : books) {
				 if(book.getPrice() < priceLimit) {
					 System.out.println("Mã sách: " + book.getId() + ",Đơn Giá: " + book.getPrice());
				 }
			 }
		 }
		 // tìm sáchgk
		 public static void findTextBooksIrangeprice(ArrayList<Book> books,double minPrice,double maxPrice) {
			for(Book book : books) {
				if(book instanceof TextBook && book.getPrice() >= minPrice && book.getPrice() <= maxPrice) {
					System.out.println("Mã sách: " + book.getId() + ",Đơn Giá: " + book.getPrice());
				}
			}
		 }
		 
	public static void main(String[] args) {
		ArrayList<Book> books= createBookData();
		
		//tìm sách Nhi Đồng
		findBooksByPublisher(books, "Nhi Đồng");
		// tìm sach giá nhỏ hơn 50
		findBooksByPrice(books, 50);
		//Tìm toàn bộ sách giáo khoa có đơn giá từ 100 đến 200
		findTextBooksIrangeprice(books, 100, 200);
	}
}
