package ex03;

import java.util.Scanner;

public class Ex03 {
	
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
        String chuoi = ip.nextLine();
        
        String a = chuoi.replaceAll("\\s+", " ");
        
        StringBuilder reversed = new StringBuilder(a);
        reversed.reverse(); 

        System.out.println(reversed.toString());
        
        ip.close();
	}
}

