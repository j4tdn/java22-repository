package src.bai5;

import java.util.List;

public class Program {
    public static void main(String[] args) {
        var service = new BookService();

        var res1 = service.findBooksByByPublisher("Nhi Đồng");

        var res2 = service.findBookWithLowerPriceThan(50);

        var res3 = service.findTextBooksWithPriceBettween(100, 200);

        
    }
}
