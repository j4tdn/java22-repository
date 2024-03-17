import java.util.Scanner;

public class ex06 {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        
	        System.out.print("Nhập số nguyên a: ");
	        int a = scanner.nextInt();

	        System.out.print("Nhập số nguyên b: ");
	        int b = scanner.nextInt();

	        System.out.print("Nhập số nguyên c: ");
	        int c = scanner.nextInt();

	        int max = a;
	        if (b > max) {
	            max = b;
	        }
	        if (c > max) {
	            max = c;
	        }

	        int min = a;
	        if (b < min) {
	            min = b;
	        }
	        if (c < min) {
	            min = c;
	        }

	       
	        System.out.println("Số lớn nhất là: " + max);
	        System.out.println("Số nhỏ nhất là: " + min);

	        scanner.close();
	    }
	}



