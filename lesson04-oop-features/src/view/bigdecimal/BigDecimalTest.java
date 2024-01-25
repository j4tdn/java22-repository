package view.bigdecimal;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class BigDecimalTest {
	
	public static void main(String[] args) {
		/*
		 Lý do vì sao sử dụng BigDecimal để lưu trữ các giá trị số thực
		 --> BigDecimal là class(wrapper) có thuộc tính là Double/double/Long/long cho phép
		 lưu trữ dữ liệu lớn
		 
		 --> Hỗ trợ các hàm tính toán: cộng, trừ, nhân, chia
		     add, subtract, multiply, divide
		 
		 --> Hỗ trợ các hàm làm tròn số đến n chữ số thập phân: rounding up, down, commercial
		     setScale
		 
		 */
		
		// 0, 1, 10 --> biến giá trị có sẵn
		
		// muốn khởi tạo giá trị cho BigDecimal, có 2 cách
		
		// Cách 1: dùng hàm static valueOf
		BigDecimal a = BigDecimal.valueOf(14.5d);
		
		// Cách 2: dùng hàm khởi tạo với tham số là string
		BigDecimal b = new BigDecimal("14.5792467");
		
		BigDecimal sum = a.add(b);
		BigDecimal sub = a.subtract(b);
		BigDecimal multiple = a.multiply(b);
		
		// nếu chia ra số nguyên ok
		// nếu chia ra số thực --> // Non-terminating decimal expansion; no exact representable decimal result
		// BigDecimal divide = a.divide(b);
		
		// 99456441737829979926
		
		// an toàn: cần số lượng số thập phân tối đa còn chế độ làm tròn bất kỳ
		// lấy tối đa 20 chữ số thập phân, chế độ làm tròn HALF_UP
		// BigDecimal divide = a.divide(b, 20, RoundingMode.HALF_UP);
		
		// an toàn: lấy về số lượng chữ số thập phân trong phạm vi
		// MathContext.DECIMAL32 : số lượng max = 7 --> sl max cho phần nguyên = , phần thập phân
		// MathContext.DECIMAL64 : số lượng max = 16
		// MathContext.DECIMAL128: số lượng max = 34
		BigDecimal divide = a.divide(b, MathContext.DECIMAL64);
		
		// (a + (a+b)*a)/b
		
		BigDecimal result = a.add(a.add(b).multiply(a)).divide(b, MathContext.DECIMAL64);
		System.out.println("result: " + result);
		
		divide = divide.setScale(4, RoundingMode.HALF_UP); // builder pattern
		
		System.out.println("sum --> " + sum);
		System.out.println("sub --> " + sub);
		System.out.println("multiple --> " + multiple);
		System.out.println("divide --> " + divide);
	}
	
}