package view.bigdecimal;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class BigDecimalTest {
	
	public static void main(String[] args) {
		
		/*
		 Lý do tại sao lại dùng BigDecimal để lưu trữ các giá trị số thực
		 --> BigDecimal là class (wrapper) có thuộc tính là Double/double/Long/long
		 lưu trữ dữ liệu lớn
		 
		 --> Hỗ trợ hàm tính toán: cộng trừ nhân chia
		 	 add, subtract, multiply, divide
		 
		 --> Hỗ trợ các hàm làm tròn đến n chữ số thập phân: rounding up, rounding down, commercial
		 	 setScale
		 */
		// 0, 1, 10 --> biến giá trị có sẵn
		
		// muốn khởi tạo giá trị cho BigDecimal, có 2 cách
		
		// Cách 1
		BigDecimal a = BigDecimal.valueOf(14.5d);
		
		// Cách 2
		BigDecimal b = new BigDecimal("14.5792467");
		
		BigDecimal sum = a.add(b);
		BigDecimal sub = a.subtract(b);
		BigDecimal mul = a.multiply(b);
		
		// Nếu chia ra số nguyên ok
		// Nếu chia ra số thực --> Non-terminating decimal expansion; no exact..
		// BigDecimal div = a.divide(b);
		
		// an toàn: cần số lượng số thập phân tối đa còn chế độ làm tròn bất kỳ
		// Lấy tối đa 20 chữ số thập phân, chế độ làm tròn HALF_UP
		// BigDecimal div = a.divide(b, 20, RoundingMode.HALF_UP);
		
		// an toàn: lấy về số lượng chữ số thập phân trong phạm vi
		// MatContext.DECIMAL32 : số lượng max = 7 --> sl max cho phần nguyên = phần thập phân =
		// MatContext.DECIMAL64 : số lượng max = 16
		// MatContext.DECIMAL128: số lượng max = 34
		BigDecimal div = a.divide(b, MathContext.DECIMAL64);
		div = div.setScale(4, RoundingMode.HALF_UP); // builder partern
		// (a + (a+b)*a)/b
		
		BigDecimal result = (a.add(a.add(b).multiply(a))).divide(b, MathContext.DECIMAL64);
		result = result.setScale(4, RoundingMode.HALF_UP);
		System.out.println("result -- > " + result);
		
		System.out.println("sum --> " + sum);
		System.out.println("sub --> " + sub);
		System.out.println("mul --> " + mul);
		System.out.println("div --> " + div);
	}
}
