package view;

public class Ex05HappyNumber {
	public static void main(String[] args) {
		int num1 = 44;
		int num2 = 13;
		
		System.out.println("Is "+num1+" happy number ? -->"+ isHappy(num1));
		System.out.println("Is "+num2+" happy number ? -->"+ isHappy(num2));
	}
	private static boolean isHappy(int num) {
		int[] elements = new int[1000];
		int count = 0;
		int sum;
		while(true) {
			if (num==1) return true;
			sum = sumOfSquare(num);
			if(isExists(elements,sum,count)) return false;
			elements[count++]=sum;
			num = sum;
		}
	}
	private static boolean isExists(int[] elements, int checkElement, int numberOfRealValues ) {
		for(int i=0 ; i<numberOfRealValues ; i++) {
			if(elements[i] == checkElement)
				return true;
		}
		return false;
	}
	private static int sumOfSquare(int num) {
		int sum = 0;
		String  numAsText = num+"";
		for (int i=0 ; i<numAsText.length() ; i++) {
			int digit = Integer.parseInt(numAsText.charAt(i)+"");
			sum += digit*digit;
		}
		return sum;
	}
	
}
