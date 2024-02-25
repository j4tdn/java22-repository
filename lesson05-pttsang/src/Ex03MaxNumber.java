public class Ex03MaxNumber {
	public static void main(String[] args) {
		String input = "12abu02muzk586cyx";
		int maxValidNumber = getMaxValidNumber(input);
		System.out.println("Số tự nhiên hợp lệ lớn nhất trong chuỗi là: " + maxValidNumber);
	}

	public static boolean isValidNumber(String str) {

		if (str.isEmpty()) {
			return false;
		}

		for (char c : str.toCharArray()) {
			if (!Character.isDigit(c)) {
				return false;
			}
		}
		return true;
	}
	public static int getMaxValidNumber(String input) {
		int maxNumber = 0;
		String currentNumber = "";

		for (int i = 0; i < input.length(); i++) {
			char currentChar = input.charAt(i);

			if (Character.isDigit(currentChar)) {
				currentNumber += currentChar;
			} else {

				if (isValidNumber(currentNumber)) {

					int num = Integer.parseInt(currentNumber);
					if (num > maxNumber) {
						maxNumber = num;
					}
				}

				currentNumber = "";
			}
		}

		if (isValidNumber(currentNumber)) {
			int num = Integer.parseInt(currentNumber);
			if (num > maxNumber) {
				maxNumber = num;
			}
		}

		return maxNumber;
	}
}
