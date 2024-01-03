package view;

public class Ex09Test {
	
	public static void main(String[] args) {
		int d = 1;
		int number = 2;
		
		while (d < 201) {
			if(kiemTraSoNgTo(number)) {
				d++;
				if(d == 200) {
					System.out.println(number);
				}
			}
			number++;
		}
		
	}
	
	public static boolean kiemTraSoNgTo(int number) {
		if (number < 2) {
			return false;
		} else {
			for (int i = 2; i < Math.sqrt(number); i++) {
				if (number % i == 0) {
					return false;
				} 
			}
		}
		return true;
	}

}
