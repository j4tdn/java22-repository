package view;

public class Ex05HappyNumber {
	
	public static void main(String[] args) {
		
		int number = 14;
		
		System.out.println("Is " + number + " happy number ? --> " + isHappy(number));
		
	}
	
	private static boolean isHappy(int number) {
		int[] elements = new int[9999]; // nên thay thế bằng CTDL khác có thể lưu số lượng phần tử dynamic
		int count = 0;
		System.out.println("init --> " + number);
		
		while(true) {
			// b1: nếu element/next element  = 1 --> dừng lại --> nó là số hạnh phúc
			if (number == 1) {
				return true;
			}
			
			// b2: phân tích number thành tổng bình phương của các ký tự số
			int sum = sumOfSquare(number);
			System.out.println("sum"+ count + " --> " + sum);
			
			// b3: nếu tổng != 1 --> kiểm tra xem tổng đó đã xuất hiện trong elements hay chưa
			// --> nếu đã xuất hiện --> dừng lại --> ko phải là số hạnh phúc
			// --> nếu chưa xuất hiện --> đưa vào elements --> tiếp tục phân tích tổng(b1)
			
			if (isExists(elements, sum, count)) {
				return false;
			}
			
			elements[count++] = sum;
			number = sum;
		}
	}
	
	private static boolean isExists(int[] elements, int checkElement, int numberOfRealValues) {
		for (int i = 0; i < numberOfRealValues; i++) {
			if (elements[i] == checkElement) {
				return true;
			}
		}
		return false;
	}
	
	private static int sumOfSquare(int number) {
		int sum = 0;
		String numberAsText = "" + number;
 		for (int i = 0; i < numberAsText.length(); i++) {
 			int digit = Integer.parseInt(numberAsText.charAt(i) + "");
 			sum += digit * digit;
 		}
		return sum;
	}
	
}
 