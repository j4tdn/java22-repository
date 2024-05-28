package view;

public class Ex05HappyNumber {
	public static void main(String[] args) {
		int number = 44;
		System.out.println("Is " + number + " happy number? --> " + isHappy(number));
	}
	private static boolean isHappy(int number) {
		int[] elements = new int[9999];
		int count = 0;
		System.out.println("int --> " + number);
		while(true) {
			// Phân tích number thành tổng bình phương của các ký tự số
			int sum = sumOfSquare(number);
			System.out.println("sum" + count + " --> " + sum);
			// nếu tổng = 1 --> dừng lại --> nó là số hạnh phúc
			if (sum == 1) {
				return true;
			}
			// nếu tổng != 1 --> kiểm tra xem tổng đó đã xuất hiện trong elements hay chưa
			// --> nếu chưa xuất hiện --> đưa vào elements --> tiếp tục phân tích tổng
			// --> nếu đã xuất hiện --> dừng lại --. ko phải số hạnh phúc
			if (isExits(elements, sum, count)) {
				return false;
			}
			elements[count++] = sum;
			number = sum;
		}
	}
	private static boolean isExits(int[] elements, int checkElement, int numberOfRealValues) {
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
