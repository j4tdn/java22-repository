
public class ex04 {
	 public static long factorial(int n) {
	        if (n == 0 || n == 1) {
	            return 1;
	        }
	        return n * factorial(n - 1);
	    }
	 
	public static void main(String[] args) {
		 int a, b, c, d;
	        a = (int) (Math.random() * 11) + 10; // Sinh số ngẫu nhiên từ 10 đến 20
	        b = (int) (Math.random() * 11) + 10;
	        c = (int) (Math.random() * 11) + 10;
	        d = (int) (Math.random() * 11) + 10;
	        
	        long sum = factorial(a) + factorial(b) + factorial(c) + factorial(d);
	        
	        System.out.println("Giá trị của a: " + a);
	        System.out.println("Giá trị của b: " + b);
	        System.out.println("Giá trị của c: " + c);
	        System.out.println("Giá trị của d: " + d);
	        System.out.println("Tổng giải thừa của a! + b! + c! + d! là: " + sum);
	    }
	
		
	}


