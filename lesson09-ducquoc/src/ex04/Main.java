package ex04;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Nhập tên đăng nhập của bạn ");
		String s1 = sc.nextLine();
		System.out.println("Nhập pass của bạn ");
		String s = sc.nextLine();
		if(checkPass(s) == true && checkTTk(s, s1) ==true) {
			System.out.println(" mật khẩu của bạn đã chính xác ");
		} else {
			System.out.println("Mật khẩu của bạn ko phù hợp hãy nhập lại ");
		}
	}
	public static boolean checkTTk(String s , String s1) {
		boolean check = true;
		int count = 0 ;
		if(s.length()<s1.length()) {
			for(int i = 0 ; i <s.length(); i++) {
				for(int j = 0 ; j<s1.length();j++) {
					if(s.charAt(i) == s1.charAt(j)) {
						count++ ;
						break;
					}
				}
			}
		}
		if(count > 3) {
			check = false; 
		}
		return check;
	}
 public static boolean checkPass(String s ) {
	 boolean check = true ;
	 if(s.length() >= 8) {
		 if(checkeassi(s) && checkeassiAZ(s) && checkeassiKiTu(s)) {
			 check = true;
		 }
	 }else {
		 check = false;
	 }
	 return check;
 }
 public static boolean checkeassi(String s ) {
		boolean check = false ;
		byte[] byteArray = s.getBytes();
		for(int i = 0; i < byteArray.length; i++) {
			if (byteArray[i] >= 48 && byteArray[i] <= 57) {
			    check = true;
			}
		}
		return check;
	}
 public static boolean checkeassiAZ(String s ) {
		boolean check = false ;
		byte[] byteArray = s.getBytes();
		for(int i = 0; i < byteArray.length; i++) {
			if (byteArray[i] >= 65 && byteArray[i] <= 90) {
			    check = true;
			}
		}
		return check;
	}
 public static boolean checkeassiKiTu(String s ) {
		boolean check = false ;
		byte[] byteArray = s.getBytes();
		for(int i = 0; i < byteArray.length; i++) {
			if (byteArray[i] >= 33 && byteArray[i] <= 38) {
			    check = true;
			}
		}
		return check;
	}
}
