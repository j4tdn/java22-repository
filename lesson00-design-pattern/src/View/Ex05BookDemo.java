package View;

import java.math.BigDecimal;

import bean.Book;
import bean.ReferenceBook;
import bean.TextBook;


public class Ex05BookDemo {
	public static void main(String[] args) {
		
		//Tạo 3 đối tượng SGK
		TextBook tb1 = new TextBook("SGK-T1", bd("15"), "Nhi Dong", false);	
		TextBook tb2 = new TextBook("SGK-T2", bd("25"), "KKTN", false);	
		TextBook tb3 = new TextBook("SGK-T3", bd("35"), "Nhi Dong", false);	
		TextBook tb4 = new TextBook("SGK-T4", bd("45"), "KHTN", false);	
		TextBook tb5 = new TextBook("SGK-T5", bd("55"), "Nhi Dong", false);	
		
		//tạo 2 đối tượng
		ReferenceBook rb1 = new ReferenceBook("STK-V1", bd("60"), "Nhi Dong", bd("5"));
		ReferenceBook rb2 = new ReferenceBook("STK-V2", bd("50"), "Nhi Dong", bd("6"));
		ReferenceBook rb3 = new ReferenceBook("STK-V3", bd("40"), "Nhi Dong", bd("4"));
		ReferenceBook rb4 = new ReferenceBook("STK-V4", bd("80"), "Nhi Dong", bd("4"));
		ReferenceBook rb5 = new ReferenceBook("STK-V5", bd("70"), "Nhi Dong", bd("6"));
	
	Book[] books = {tb1,tb2,tb3,tb4,tb5,rb1,rb2,rb3,rb4,rb5};
	}
	private static BigDecimal bd(String val) {
		return new BigDecimal(val);
	}
}
