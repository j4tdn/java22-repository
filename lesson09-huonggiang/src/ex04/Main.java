package ex04;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
			
	Scanner ip = new Scanner(System.in);
	System.out.println("Nhập tên tài khoản : ");
	String us = ip.nextLine();
	
	 String password;
     boolean validPassword= false;
     do {
         System.out.print("Nhập mk: ");
         password = ip.nextLine();
         validPassword= kiemTraMatKhau(password, us);
         if (!validPassword) {
             System.out.println("Nhập lại mk: ");
         }
     } 
     while (!validPassword);
	}
     
     public static boolean kiemTraMatKhau(String password, String us) {
         if (password.length() >= 8) {
             return true;
         }
		return false;
	}
     

}
