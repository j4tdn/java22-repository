package inheritance.cclass;

import java.math.BigDecimal;

public class Ex01InheritanceClassDemo {
	public static void main(String[] args) {

		/*
		 bài toán: viết chương trình quản lý việc lưu trữ sách trong nhà sách 
		 trong đó quản lý 2 loại sách chính:
		 
		 sgk:mã sách, tên sách, giá bán, nhà suất bản, tình trạng, %giảm giá(nếu schs cũ)
		 stk:mã sách, tên sách, giá bán, nahf suấr bản, %thuế
		 
		 
		 book: id, name, salesPrice, publisher
		 
		 TextBook: status, discount
		 ReferenceBook extends book: tax
		 */
		TextBook tb1 = new TextBook("ts2", "t1", new BigDecimal("20"), "nhi dông", false, new BigDecimal("5")) ;
		System.out.println(tb1);
	}
}

