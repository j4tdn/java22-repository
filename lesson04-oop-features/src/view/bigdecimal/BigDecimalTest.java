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
    	 
    	 --> Hỗ trợ các hàm tính toán cộng trừ nhân chia
    	 --> Hỗ trợ các hàm làm tròn đến n chữ số thập phân: rounding up, down, commercial
    	 setScale
    	 */
    	
		/* 0,1,10 --> biến giá trị có sẵn
		 * Muốn khởi tạo giá trị cho BigDecimal, có 2 cách
		 * 1, dùng static valueOf
		 * 2, dùng hàm khởi tạo với tham số là String
		 */
    	BigDecimal a = BigDecimal.valueOf(14.5);
    	
    	BigDecimal b = new BigDecimal("14.5792467");
    	
    	BigDecimal sum = a.add(b);
    	BigDecimal sub = a.subtract(b);
    	BigDecimal mul = a.multiply(b);
    	BigDecimal div = a.divide(b, MathContext.DECIMAL64);
    	
    	BigDecimal result = a.add((a.add(b)).multiply(a)).divide(b, MathContext.DECIMAL64);
    	System.out.println("Result: " + result);
    	div = div.setScale(4, RoundingMode.HALF_UP);
    	
    	/*
    	 MathContext.DECIMAL32: số lượng max = 7 -> sl max cho phần nguyên = , phần thập phân
    	 MathContext.DECIMAL64: max = 16
    	 MathContext.DECIMAL128: max = 34;
    	 */
    	
    	System.out.println("sum --> " + sum);
    	System.out.println("sub --> " + sub);
    	System.out.println("mul --> " + mul);
    	System.out.println("div --> " + div);
    	
    	
    	
	}
}
