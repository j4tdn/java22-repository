package ex1;

public class Bai1 {
	public static void main(String[] args) {
		System.out.println(isPower(8, 2)); 
        
    }

 
    public static boolean isPower(int a, int b) {
        if (a <= 0 || b <= 0)
            return false;
        if (a == 1)
            return b == 1;
		
        int result = b;
		
        while (result < a) {
        	result *= b;
        }
        return result == a;
    }
		
}
