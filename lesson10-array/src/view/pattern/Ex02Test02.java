package view.pattern;


import functional.Operator;

public class Ex02Test02 {
	public static void main(String[] args) {

		int[] elements = { 1, 7, 2, 8, 20, 44, 80 };
		/*
		 * 1. tìm tổng các phần tử trong mảng
		 */
		
		int sum = process(0, elements, (a,b)-> a+b);
		int mul = process(1, elements, (a,b)-> a*b);
		int max = process(Integer.MIN_VALUE, elements, (a,b)-> a<b?b:a );
		int min = process(Integer.MAX_VALUE, elements, (a,b)-> a>b?b:a );
		
		System.out.println(
				"Tổng " + sum + "\n" +
				"Tích " + mul + "\n" +
				"Lớn nhất " + max+ "\n" +
				"Nhỏ nhất " + min + "\n" 
				);
	}
	
	private static int process (int initial, int[] elements, Operator operator) {
		int result = initial;
		for(int element:elements) {
			result = operator.operate(result, element);
		}
		return result;
	}
}
