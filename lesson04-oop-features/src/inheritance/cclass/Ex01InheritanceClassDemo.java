package inheritance.cclass;

import java.math.BigDecimal;

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
		 */
		
		TextBook tb1 = new TextBook("Ts2", "Toán 1", new BigDecimal("20"), "Nhi Đồng", false, new BigDecimal("5"));
		System.out.println("tb1-->" + tb1);
	}

}
