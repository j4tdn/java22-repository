package view;

import java.util.Scanner;

public class Ex01Test {

    public static void main(String[] args) {
    	
        Scanner ip = new Scanner(System.in);

        int d = 1;
        
        while (d < 6) {
            System.out.print("Nhập N = ");

            if (ip.hasNextInt()) {
                int number = ip.nextInt();

                if (number > 0) {
                	if (kiemTraBoiCua2(number)) {
                		System.out.println("true");
                        break;
                	} else {
                		System.out.println("false");
                		break;
                	}	
                } else {
                	System.out.println("Nhập sai.");
                }
            } else {
            	System.out.println("Nhập sai");
            }
            d++;
        }
        ip.close();
    }
    
    private static boolean kiemTraBoiCua2(int number) {
		return number % 2 ==0;
	}

}
