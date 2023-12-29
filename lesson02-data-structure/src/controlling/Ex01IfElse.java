package controlling;
import java.text.DecimalFormat;
import java.time.Year;
import java.util.Random;
import java.util.Scanner;
public class Ex01IfElse {
public static void main(String[] args) {
	//Random 1 sỐ ngẫu nhiên từ [5, 20)
	Random rd = new Random();
	int Rand = rd.nextInt(5,20);
	// Kiểm tra số nguyên đó có phải là số chẵn hay không
//	if (Rand%2==0) {
//		System.out.println("Rand là " + Rand + " và là số chẵn");
//		
//	}
//	else {
//		System.out.println("Rand là " + Rand + " và là số lẻ");
//	}
	int currentYear = Year.now().getValue();
	boolean isEven = (Rand%2==0);
	if (isEven) {
		System.out.println("Rand la so chan --> " + (currentYear + Rand));
	}
	System.out.println("Ket thuc chuong trinh");
	
	//Nhập mật khẩu, kiểm tra độ dài của mk có hợp lệ hay không
	//Nếu độ dài >=8 --> in ra mk hợp lệ
	//Ngược lại --> in ra mk không hợp lệ, vui lòng nhập lại
	
//	Scanner sc = new Scanner(System.in);
//	System.out.println("Nhập mk: ");
//	String pass = sc.nextLine();
//
//	
//	
//	if (pass.length()>=8) {
//		System.out.println("Mật khẩu hợp lệ: " + pass);
//		
//	}
//	else {
//		System.out.println("Mật khẩu không hợp lệ");
//	}
//	System.out.println("Kết thúc...");
//	sc.close();//đóng kết nối
	
	float dtb = rd.nextFloat(0, 11);
	if (dtb>10f) {
		dtb=10f;
	}
	float p;
	p = dtb > 10f ? 10f : dtb;
	
	//pattern - cÔng thức, cú pháp
	//decimal format: làm tròn
	//#,###.# -> luôn tối thiểu và tối đa là 1 chữ số thập phân
	
	DecimalFormat df = new DecimalFormat("#,###.#");
	String formattedPoint = df.format(dtb);
	Float avgPoint = Float.parseFloat(formattedPoint);
	System.out.println("Diem trung binh: " + avgPoint);

//	if (avgPoint<5) {
//	System.out.println("Yeu");
//} else if(avgPoint < 6.5) {
//	System.out.println("Trung binh");
//} else if(avgPoint< 8) {
//	System.out.println("Kha");
//} else if(avgPoint <=10) {
//	System.out.println("Gioi");
//}
    String rank = avgPoint < 5 ? "Yeu" : avgPoint < 6.5 ? "Trung binh" : avgPoint < 8 ?  "Kha" 
    	     : "Gioi";
    System.out.println(rank);
  /*
   (exp) ? result1: result2;
   // vd: random 2 số nguyên a, b [0, 12]
   // yêu cầu tìm max 2 số
   */
   
	int a = rd.nextInt(12);
	int b = rd.nextInt(12);
	System.out.println("a = " + a);
	System.out.println("b = " + b);
	int max = (a>b)? a : b;
	System.out.println("Max la: " + max);
}
}
