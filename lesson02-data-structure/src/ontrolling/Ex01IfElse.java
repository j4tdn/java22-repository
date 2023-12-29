package ontrolling;

import java.text.DecimalFormat;
import java.time.Year;
import java.util.Random;
import java.util.Scanner;

public class Ex01IfElse {
	
	public static void main(String[] args) {
		
		Random rd = new Random();
		int number = rd.nextInt(5,20);
		System.out.println("so ngsu nhien " +number);
		
		int currentYear = Year.now().getValue();
		
		boolean isEven = (number % 2 == 0);
		
		if (isEven) {
			System.out.println("number là số chẵn --> " + (currentYear +number));
		}
		/*
		System.out.println("=============");
		
		Scanner ip = new Scanner(System.in);
		System.out.println("nhap mat khau: ");
		String pw = ip.nextLine();
		
		int length = pw.length();
		
		if (length >= 8) {
			System.out.println("y");
		}
		else {
			System.out.println("n");
		}
		*/
		
		System.out.println("\n");
		
		
		float diemtb = rd.nextFloat(0.0f,11);
		
		/*
	    if (diemtb > 10f) {
	    	diemtb = 10f;
	    }
	    */
	    
	    diemtb = (diemtb > 10f) ? 10f : diemtb;
	    
	    DecimalFormat df = new DecimalFormat("#,###.0");
	    String formattedPoint = df.format(diemtb);
	   
	    System.out.println("dtb có df: " + formattedPoint);
	    diemtb = Float.parseFloat(formattedPoint);
	    /*
	    if (diemtb < 5) {
	    	System.out.println("yeu");
	    } else if (diemtb < 6.5f){
	    	System.out.println("tb");
	    } else if (diemtb < 8){
	    	System.out.println("kha");
	    } else {
	    	System.out.println("g");
	    }	
	    */
	    String ranking = diemtb < 5 ? "yếu"
	    		                    : diemtb < 6.5f ? "tb"
	    				                            : diemtb < 8 ? "k"
	    						                                  : "g";
	    
	    System.out.println("hoc luc --> " + ranking);
	    
	    System.out.println("\n toán tử 3 ngôi");
	    
	    int a = rd.nextInt(12);
	    int b = rd.nextInt(12);
	    System.out.println("a --> " + a);
	    System.out.println("b --> " + b);
	    
	    int max = (a > b) ? a: b;
	    
	    System.out.println("max --> " + max);
	    
	    
	    
	    
		//ip.close();//đóng kết nối
	}

}
