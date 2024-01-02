package controlling;

import java.text.DecimalFormat;
import java.time.Year;
import java.util.Random;
import java.util.Scanner;

public class Ex01IfElse {
	public static void main(String[] args) {
		// Randome 1 so nguyen ngau nhien tu (5,25)

		Random rd = new Random();
		int number = rd.nextInt(5, 20);
		System.out.println("so ngau nhien---> " + number);
		// kiem tra so nguyen p so chan hay khong
		// neu la so chan thi se in ra nam hien tai + so chan do
		// neu khong phai--> khong in ra
//    	   int curentYear = Year.now().getValue();
//    	   boolean isEven = (number %2 ==0);
//    	   if (isEven) {
//    		   System.out.println(" number la so chan(+2023)--->" +(curentYear+ number));
//			
//		}
//    	   System.out.println("ket thuc chuong trinh....");
//    	   
		// nhap vao mat khau, kiem tra do dai mat khau co hop le hay khong
		// neu do dai mat khau >=8 in ra mat khau hop le
		// nguoc lai--> in ra mat khau khong hop le, va nhap lai

//    	   Scanner ip = new Scanner(System.in);
//    	   System.out.println(" nhap mat khau");
//    	   String password = ip.nextLine();
//    	   
//    	   int length = password.length();
//    	   if (length >=8) {
//			System.out.println("mat khau hop le");
//		}
//    	   else {
//    		   System.out.println(" mat khau khong hop le");
//    	   }

		// Random diem trung binh( so thuc) cua hoc sinh[0,10]
		float point = rd.nextFloat(0, 11);//

		if (point > 10f) {
			point = 10f;
		}

		DecimalFormat df = new DecimalFormat("#,###.#");
		String formattedPoint = df.format(point);
        point =Float.parseFloat(formattedPoint);
		System.out.println("diem trung binh---> " + point);
		
		
		
		System.out.println("toan tu 3 ngoi");
		/*
		 *  if(exp){
		 *  //results1(statement1)
		 *  } else{
		 *  results1(statement1)
		 *  } 
		 *  (exp) ? result1 : result 2
		 * 
		 * 
		 * */
		int a= rd.nextInt(12);
		int b= rd.nextInt(12);
		System.out.println("a--->"+a);
		System.out.println("b--->"+b);
		int max = (a>b) ? a:b;
		System.out.println("max---->"+max);
		System.out.println("ket thuc chuong trinh....");
//    	   ip.close(); //dong ket noi
	}
}
