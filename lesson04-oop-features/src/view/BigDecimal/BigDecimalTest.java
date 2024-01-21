package view.BigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalTest {
	public static void main(String[] args) {
		//0,1,10 --> biến giá trị có sẵn
		
		//Dùng BigDecimal vì lưu trữ dữ liệu lớn
		//-> Hỗ trọ các hàm tính toán
		// Hỗ trợ làm tròn: roundung up, down, commercial
		
		//muốn khơi tạo giá trị cho BigDecimal, có 2 cách
		
		//Cách 1: dùng hàm static valueOf
		BigDecimal a = BigDecimal.valueOf(14.5d);
		
		//cách 2: dùng hàm khởi tạo với tham số string
		BigDecimal b = new BigDecimal("14.5");
		//an toàn
		BigDecimal divide2 = a.divide(b,6,RoundingMode.HALF_UP);//lấy 6 chữ số thập phân
		
		BigDecimal sum = a.add(b);
		BigDecimal sub = a.subtract(b);
		BigDecimal multiple = a.multiply(b);
		BigDecimal divide = a.divide(b);
	}
}
