package lesson02_baitap;

public class Ex02 {
	public static void main(String[] args) {
	
		int N = Ex01.s();
		boolean rs = checkPowerOf2(N);

        if (rs) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
	}
	public static boolean checkPowerOf2(int n) {
		while (n > 1) {
			if(n % 2 != 0) {
				return false;
			}
			n /= 2;
		}
		return true;
	}
}