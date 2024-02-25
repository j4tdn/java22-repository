package view;

public class Ex02IsSpecialNumber {
	
	public static void main(String[] args) {
		int n = 10;
		if(isSpecialNumber(n)) {
			System.out.println("Là số đặt biệt");
		}else {
			System.out.println("ko là số đặt biệt");
		}
	}
	
	private static boolean isSpecialNumber(int num) {
		int sum = 0;
		for(int i = 0; i < num; i++) {
			sum += i;
			if(sum == num) {
				return true;
			}
		}
		return false;
	}
	
}
