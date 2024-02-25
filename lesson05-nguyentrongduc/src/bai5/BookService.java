package src.bai5;

import java.util.ArrayList;
import java.util.List;

public class BookService {
    List<Book> books;

    public BookService() {
        books = init();
    }
    
    public List<Book> init() {
        var books = new ArrayList<Book>();

        books.add(new TextBook("SGK01", 20, "Nhi Đồng", Status.New));
        books.add(new TextBook("SGK03", 40, "Nhi Đồng", Status.New));
        books.add(new ReferenceBook("STK01", 50, "Nhi Đồng", 10));
        books.add(new TextBook("SGK02", 30, "Nhi Đồng", Status.Old));
        books.add(new ReferenceBook("STK02", 60, "Nhi Đồng", 10));
        
        return books;
    }

    public List<Book> findBooksByByPublisher(String publisher) {
        List<Book> res = new ArrayList<Book>();
        for (var book : books) {
            if (book.Publisher == publisher) {
                res.add(book);
            }
        }
        return res;
    }

    public List<Book> findBookWithLowerPriceThan(double price) {
        List<Book> res = new ArrayList<Book>();
        for (var book : books) {
            if (book.Price < price) {
                res.add(book);
            }
        }
        return res;
    }

    public List<TextBook> findTextBooksWithPriceBettween(double lowest, double highest) {
        List<TextBook> res = new ArrayList<TextBook>();
        for (var book : books) {
            if (book instanceof TextBook) {
                var textBook = (TextBook) book;
                if (lowest <= textBook.Price && textBook.Price <= highest) {
                    res.add(textBook);
                }
            }
        }

        return res;
    }
}
