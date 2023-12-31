package controlling;

import java.text.DecimalFormat;
import java.time.Year;
import java.util.Random;
import java.util.Scanner;

public class Ex01IfElse {

	public static void main(String[] args) {

		Random rd = new Random();
		int number = rd.nextInt(16) + 5;
		
		int currentYear = Year.now().getValue();
		if(number%2 == 0) {
			System.out.println("number là số chẵn(+2023)-->" + (currentYear + number));
		}
		System.out.println("ket thuc");
		
		
		Scanner ip = new Scanner(System.in);
		/*
		System.out.print("Nhập mật khẩu :" );
	    String password = ip.nextLine();
	    
	    if( password.length() >= 8) {
	    	System.out.println("Mat khau hop le ");
	    	
	    }else {
	    	System.out.println("Mat khau khong hop le ");	
	    }
	    System.out.println("ket thuc");
	    ip.close();
	    */
	    System.out.println("DIEM TRUNG BINH");
	    float point = rd.nextFloat()*11;
	    if(point > 10f) {
	    	point = 10f;
	    }
	    point = point > 10f ? 10f : point; //TOAN TU 3 NGOI
	    DecimalFormat df = new DecimalFormat("#,###.0");
	    String formattedPoint = df.format(point);
	    point = Float.parseFloat(formattedPoint);
	    System.out.println("DIEM TRUNG BINH " + point);
//        String rank = "";
//        if(point < 5) {
//        	rank = "Yeu";
//        }else if ( point < 6.5f) {
//        	rank = "Trung binh";
//        }else if (point <8.0f) {
//        	rank = "Kha";
//        }else {
//        	rank = "Gioi";
//        }
         
    	String rank = point < 5 ? "Yeu" 
    			: point < 6.5f ? "Trung binh"
    					: point < 8.0f ? "Kha"
    							: "Gioi";
    	System.out.println("Hoc luc : " + rank);

        
    	System.out.println("\n TOAN TU 3 NGOI");
        int a = rd.nextInt(12);
        int b = rd.nextInt(12);
        int max = (a>b)? a : b ;
        System.out.println("a --> " + a);
        System.out.println("b --> " + b);
        System.out.println("max --> " + max);

        
 

        
	    
	}

}
