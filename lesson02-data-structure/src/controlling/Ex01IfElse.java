package controlling;


import java.text.DecimalFormat;
import java.time.Year;
import java.util.Random;
import java.util.Scanner;

public class Ex01IfElse {

	public static void main(String[] args) {
		//Random 1 số nguyên từ [5,20)
		Random rd=new Random();
		int number=rd.nextInt(5,20);
		System.out.println("So ngau nhien->"+number);
		//kiểm tra số nguyên đó có phải số chẵn không
		//nếu là số chẵn thì sẽ in ra năm hiện tại + số chẵn đó
		//nếu không phải--> ko in ra ko làm gì cả
		
//		int currentYear=Year.now().getValue();
//		//boolean isEven = (number % 2 == 0)s;
//		if(number % 2 == 0) {
//			System.out.println("number la so chan(+2023)-->"+(currentYear + number));
//		}
		
		//nhap vao mat khau, kiem tra do dai cua mat khau co hop le khong
		//neu do dai mat khau >= 8 -->in ra mk hop le
		//nguocj lai in ra ko hop le, vui long nhap lai
		
		Scanner ip=new Scanner(System.in);//mo ket noi nhap xuat den ban phim
		/*
		System.out.print("Nhap mat khau: ");
		String password=ip.nextLine();
		
		int length=password.length();
		if(length >= 8) {
			System.out.println("Mat khau hop le!");
		}
		else {
			System.out.println("Mat khau khong hop le!");
		}
		*/
		//Random dtb(so thuc) cua hoc sinh [0.0,10.0]
		//kq: so ko biet dc so thap phan bao nhieu, lam tron lay 1 chu so thap phan
		//neu diem ma
		//
		
		float point=rd.nextFloat(0,11);
		
		/*if(point > 10f) {
			point = 10f;
		}
		*/
		point = point >10f ? 10f : point;
		//pattern - cong thuc, cu phap
		DecimalFormat df=new DecimalFormat("#,###.0");
	    String formattedPoint=df.format(point);  //dinh dang 1 gia tri KDL ? sang string de in ra
	    
	    point=Float.parseFloat(formattedPoint);	    
	    System.out.println("Diem trung binh "+ point);
		
		/* 
		if(point < 5) {
			System.out.println("Hoc luc -> yeu");
		}else if(point < 6.5f) {
			System.out.println("hoc luc -> trung binh");
		}else if(point < 8.0f) {
			System.out.println("hoc luc kha");
		}else {
			System.out.println("hoc luc gioi");
		}
		*/
	    
	    /*
	    String ranking="";
	    if(point < 5) {
	    	ranking="Yeu";
	    }else if(point < 6.5f) {
	    	ranking="trung binh";
	    }else if(point < 8.0f) {
	    	ranking="kha";
	    }else {
	    	ranking="gioi";
	    }
	    System.out.println("Hoc luc ->"+ ranking);
	    */
	    String ranking = point < 5 ? "yeu"
	    	      : point < 6.5f ? "trung binh"
	    	    		         : point < 8.0f ? "kha"
	    	    		        		        : "gioi";
	    System.out.println("Hoc luc -> "+ ranking);
	    
	    System.out.println("\nToan tu 3 ngoi");
	    
	    /*
	     if(exp){
	     	//result(statement1)
	     }else{
	     	//result(statement2)
	     }
	     (exp) ? result1 : result2 
	     */
	    
	    //Vd: random 2 so nguyen ngau nhien a va b [0,12]
	    //Yeu cau: Tim max cua 2 so
	    int a=rd.nextInt(12);
	    int b=rd.nextInt(12);
	    System.out.println("a-->"+a);
	    System.out.println("b-->"+b);
//	    int max;
//	    if(a>b) {
//	    	max=a;
//	    }else {
//	    	max=b;
//	    }
	    int max=(a>b) ? a : b;
	    System.out.println("max--> "+max);
	    
		System.out.println("Ket thuc chuong trinh");
		ip.close();
	}

}
