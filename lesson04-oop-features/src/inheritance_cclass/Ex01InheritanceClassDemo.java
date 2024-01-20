package inheritance_cclass;

import java.math.BigDecimal;

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
		
		TextBook tb1 = new TextBook("Ts1", "Toan 1",new BigDecimal("20"), "Nhi Dong" ,false, new BigDecimal("5"));
		
		System.out.println(" tb1 --> "+tb1);
	}
}