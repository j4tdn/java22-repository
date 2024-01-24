package view.bigdecimal;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class BigDecimalTest {

	public static void main(String[] args) {
		/*
		 * Lý do vì sao sử dụng BigDecimal để lưu trữ các giá trị số thực --> BigDecimal
		 * là class(wrapper) có thuộc tính là double/Double/Long/long cho phép lưu trữ
		 * dữ liệu lớn --> Hỗ trợ các hàm tính toán: cộng trừ nhân chia --> Hỗ trợ các
		 * hàm làm tròn số đến n chữ số thập : rounding up, down, commercial setScale
		 */
		// mặc định có sẵn ba giá trị 0, 1, 10 --> biến giá trị có sẵn

		// muốn khởi tạo giá trị cho BigDecimal, có 2 cách

		// Cách 1: dùng hàm static valueOf
		BigDecimal a = BigDecimal.valueOf(14.5d);

		// Cách 2: dùng hàm khởi tạo với tham số là string (AN TOÀN HƠN)
		BigDecimal b = new BigDecimal("14.5792467");

		BigDecimal sum = a.add(b);
		BigDecimal sub = a.subtract(b);
		BigDecimal mul = a.multiply(b);
		
		//Nếu chia ra số nguyên thì ok 
	    //Nếu chia ra số thực --> // Lỗi : Non-terminating decimal expansion 
		//BigDecimal div = a.divide(b);
		
		// An toàn : cần số lượng số thập phân tối đa còn chế độ làm tròn bất kì 
		//Lấy tối đa 20 chữ số thập phân , Half_up là chế độ làm tròn 
	    //BigDecimal div = a.divide(b,20, RoundingMode.HALF_UP);
		
	    
	    
	  //An toàn: lấy về số lượng chữ số thập phân trong phạm vi 
	    BigDecimal divide = a.divide(b, MathContext.DECIMAL64);
	    divide = divide.setScale(4 , RoundingMode.HALF_UP); //Builder pattern 
	    
	    
		System.out.println("Sum -->" + sum);
		System.out.println("Sub -->" + sub);
		System.out.println("Mul -->" + mul);
		
		
		System.out.println("Div -->" + divide);

		
		BigDecimal rs = a.add(a.add(b).multiply(a)).divide(b, MathContext.DECIMAL64);
		System.out.println("rs = " + rs);

		   
		   
	}

}
