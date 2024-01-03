package bai9;

public class SoNguyenTo {
	public static void main(String[] args) {
		int count = 0;
		int number = 2;
		int prime = 200;
		while(count<prime) {
			if(isPrime(number)) {
				count++;
			}
				number++;
			}
		System.out.println("soó nguyên tố thứ 200 là:" + (number -1));
		}
		public static boolean isPrime(int num) {
			if(num<2) {
				return false;
			}
			for(int i =2;i <= Math.sqrt(num);i++) {
				if(num % i == 0) {
					return false;
				}
			}
			return true;
		}
	
}
