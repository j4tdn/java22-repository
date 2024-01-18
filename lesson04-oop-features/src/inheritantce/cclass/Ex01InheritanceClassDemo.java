package inheritantce.cclass;

import java.math.BigDecimal;

public class Ex01InheritanceClassDemo {
	
	public static void main(String[] args) {
		/*
		 Bài toán: viết ct qli lưu trữ sánh trong nhà sách
		  Trong đó qli 2 loại sách chính
		    	1. SGK :mã sách, tên sách, giá bán , nxb, tình trạng, %giảm giá(nếu sách cũ )
		    	2. Sách tham khảo: mã sách, tên sách, giá bán , nxb, %thuế
		    	
		    	Book: id, name, salesPrice, publisher
		    	TextBook extends Book: status, discout
		    	ReferenceBook: Tax
		 */
		TextBook tb1 = new TextBook("Ts1", "Toán 1","nhi đồng",new BigDecimal("20"),false,new BigDecimal("5"));
		System.out.println("tb1 --> " +tb1);
	}
	
}
