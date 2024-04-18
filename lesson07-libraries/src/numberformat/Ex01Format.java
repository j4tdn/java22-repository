package numberformat;

import java.math.BigDecimal;
import java.math.MathContext;
import java.text.DecimalFormat;

public class Ex01Format {

	public static void main(String[] args) {
		
		//Trong coding ko chỉ Java mà hầu hết các ngôn ngữ
		// Để tiết kiệm vùng nhớ lưu trữ cho giá trị của số
		//Khi số 'lớn' --> thay vì lưu hết giá trị là 1 dãy số dài 
		//Quy ước tự động chia 10^x --> nEx --> ít tốn vùng nhớ lưu trữ 
		//n: sa khi value đã chia 10^x
		//E: 10, x mũ 
		
		DecimalFormat df = new DecimalFormat("#,###.00");
		double value = 56427121886991342535218202d;
		System.out.println("double format value: " + df.format(value));
		
		BigDecimal bd1 = new BigDecimal(String.valueOf(value)).abs(MathContext.DECIMAL64);
		System.out.println("\nbd1: " + bd1); // Ex
		System.out.println("bd1 plain string: " + bd1.toPlainString()); // format
		
		bd1 = bd1.abs(MathContext.DECIMAL128);
		System.out.println("bd1 128 plain string: " + bd1.toPlainString()); // format
		double a = 878_291;
		double b = 1_819_227d;
		double c = 45_698_545d;
		double d = 8_392_021_938_201d;
		double e1 = 53.28d;
		double e2 = 3.28d;
		double e3 = 53.2d;
		
		System.out.println("\na --> " + a);
		System.out.println("a df --> " + df.format(a));
		
		System.out.println("\nb --> " + b);
		System.out.println("b df --> " + df.format(b));
		
		System.out.println("\nc --> " + c);
		System.out.println("c df --> " + df.format(c));
	
		System.out.println("\nd --> " + d);
		System.out.println("d df --> " + df.format(d));
		
		System.out.println("\ne1 -> " + e1);
		System.out.println("e1 df --> " + df.format(e1));
		
		System.out.println("\ne2 -> " + e2);
		System.out.println("e2 df --> " + df.format(e2));
		
		System.out.println("\ne3 -> " + e3);
		System.out.println("e3 df --> " + df.format(e3));
	}
}
