package numberformat;

import java.math.BigDecimal;
import java.math.MathContext;
import java.text.DecimalFormat;

public class Ex01Format {
	
	public static void main(String[] args) {
		
		// Trong coding ko chỉ Java mà hầu hết các ngôn ngữ
		// Để tiết kiệm vùng nhớ lưu trữ cho giá trị của số
		// khi số 'lớn' --> thay vì lưu hết giá trị là 1 dãy số dài
		// Quy ước tự động chia 10^x --> nEx --> ít tốn vùng nhớ lưu trữ
		// n: sau khi value đã chia 10^x
		// E: 10, x mũ
		// --> DEV,QA hiểu
		// --> user ko hiểu
		
		// ==> Format nó ra string dưới dạng số bình thường để người dùng hiểu
		// #: số(phần nguyên | thập phân) --> optional
		// 0: số(phần nguyên | thập phân) --> required
		// ,: ngăn cách các nhóm 3 chữ số ở  phần nguyên
		// .: ngăn cách phần nguyên và phần thập phân
		
		// DecimalFormat df1 = new DecimalFormat("##,##");
		// DecimalFormat df2 = new DecimalFormat("00.00");
		
		// #,###.## -->ko bắt buộc với phần thập phân
		// #,###.00 -->bắt buộc thập phân luôn có 2 chữ số
		
		DecimalFormat df = new DecimalFormat("#,###.00");
		
		// Thường xuyên được sử dụng trong dự án
		// Hạn chế
		// 1. Format nó trả về KDL String(chuỗi)
		// 	 Đang có số có 5 số nguyên 10 số thập phân
		//	-> cần làm trong roud commercial cho số đó với 4 chữ số thập phân
		//	Format --> Ok --> return chuỗi, giá trị của nó vẫn 10 số thập phân
		// ko thể đem giá trị format đi tính toán
		
		// 2. Với những giá trị đủ 'lớn' thì format sẽ dễ bị sai(sai theo nguyên tắc chung)
		
		// sử dụng tính toán, format được kết quả đem đi tính toán cũng như dùng các hàm bên trong
		// --> BigDecimal
		
		//1343463464363432300000.00
		// phần nguyên tối đa: 16
		
		// phần thập phân: 00
		double value = 1343463464363432452342d;
		System.out.println("double format value: " + df.format(value));
		
		// mặc định bigdecimal value --> MathContext.DECIMAL64 ==> max 16
		// mặc định bigdecimal value --> MathContext.DECIMAL32 ==> max 7
		// mặc định bigdecimal value --> MathContext.DECIMAL128 ==> max 32
		// toPlainString -> tối đa 16
		BigDecimal bd1 = new BigDecimal(String.valueOf(value)).abs(MathContext.DECIMAL32);
		System.out.println("\nbd1: " +bd1); //Ex
		System.out.println("\nbd1 plain String " + bd1.toPlainString()); //format
		
		bd1 = bd1.abs(MathContext.DECIMAL128);
		System.out.println("bd1 128 plain string: " + bd1.toPlainString()); //format
		
		double a = 878_291;
		double b = 1_819_227d;
		double c = 45_612_323d;
		double d = 8_392_021_938_201d;
		double e1 = 53.28d;
		double e2 = 3.28d;
		double e3 = 53.2d;
		
		System.out.println("\na -> " + a);
		System.out.println("a df -> " + df.format(a));
		
		System.out.println("\nb -> " + b);
		System.out.println("b df -> " + df.format(b));
		
		System.out.println("\nc -> " + c);
		System.out.println("c df -> " + df.format(c));
		
		System.out.println("\nd -> " + d);
		System.out.println("d df -> " + df.format(d));
		
		System.out.println("\ne1 -> " + e1);
		System.out.println("e1 df -> " + df.format(e1));
		
		System.out.println("\ne2 -> " + e2);
		System.out.println("e2 df -> " + df.format(e2));
		
		System.out.println("\ne3 -> " + e3);
		System.out.println("e3 df -> " + df.format(e3));
		
		
	}
	
}
