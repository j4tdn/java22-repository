package string_demo;

import java.util.Arrays;

public class Ex02StringDemo {

	public static void main(String[] args) {

		String s = "welcome to java22 class";
		String s1 = "we";
		
		//Kiem tra chuoi s1 co phai la chuoi bat dau or ket thuc trong s hay ko .
		
		
		System.out.println("Kiem tra chuoi s1 co phai la chuoi bat dau or ket thuc trong s hay ko : " + s.startsWith(s1));
		System.out.println("Kiem tra chuoi s1 co phai la chuoi bat dau or ket thuc trong s hay ko : " + s.endsWith(s1));

		
		String s2 ="We";
		System.out.println("Thay the s1 bang s2 trong s --> " + s.replace(s1, s2).replace("j", "J"));
		
		
		s = "            Welcome      to      Java22      class";
		s = s.strip().replaceAll("\\s{1,}", " ");
		
		System.out.println("Chuoi s moi --> ||" + s + "||");
		
		
		s = "aaaaaa";
		s = s.replaceAll("a+", "a");
		System.out.println("Thao tac voi regex 01 --> " + s);
		
		
		//Viet chuong trinh loai bo cac ki tu trung nhau, cac phan tu
		// trung nhau chi lay 1 ki tu
		s = "aaabbccccd";
		s = s.replaceAll("a+","A")
			 .replaceAll("b+", "B")
			 .replaceAll("c+", "C");
		System.out.println("Thao tac voi regex 02 --> " + s);

		
		s = "aab15ba202bb999";
		s = s.replaceAll("[a,b]+", " ");
		System.out.println("Thao tac voi regex 03 --> " + s);

		
		s = "15ba202bb999";
		//s = s.replaceAll("[a,b]+", " ");
		String[] sa = s.split("[a,b]+");
		System.out.println("Thao tac voi regex 03 --> " + Arrays.toString(sa));

		s = "afadsf2341fdfgr34342sdfdf3434";
		String[] sar = s.split("[a-z]+");
		System.out.println("Thao tac voi regex 04 --> " + Arrays.toString(sar));

		
		//Cat chuoi
		s = "Welcome to Java22 class";
		String s3 = s.substring(0);
		System.out.println("Bai toan cat chuoi 01  : " + s3);
		s = "Welcome to Java22 class";
		s3 = s.substring(0, s.length()-1);
		System.out.println("Bai toan cat chuoi 02  : " + s3);
		
		
		
		//Xac dinh chuoi s2 co ton tai trong chuoi s1 khong 
		System.out.println("Kiem tra ton tai--> " + s.toLowerCase().contains("java"));
		
	}

}
