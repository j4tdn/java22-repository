package view.pattern;

import functional.Operator;

public class Ex02Test02 {
	public static void main(String[] args) {
		int[] elements = {1, 7, 2, 8, 20, 44, 80};
		/*
		 Viết chương trình thực hiện:
		 + Tìm tổng các phần tử trong mảng
		 + Tìm tích các phần tử trong mảng
		 + Tìm phân tử có giá trị lớn nhất trong mảng
		 + Tìm phân tử có giá trị nhỏ nhất trong mảng
		 
		 Yêu cầu: Kết quả trả về là một số nguyên
		 */
		int sum = process(0, elements, (a,b) -> a + b);
		int mul = process(1, elements, (a,b) -> a * b);
		int max = process(Integer.MIN_VALUE, elements, (a,b) -> a < b ? b : a);
		int min = process(Integer.MAX_VALUE, elements, (a,b) -> a > b ? b : a);
		
		System.out.println(
				"Tổng = " + sum + "\n" +
				"Tích = " + mul + "\n" +
				"Lớn nhất = " + max + "\n" +
				"Nhỏ nhất = " + min + "\n" 
		);
	}
	private static int process(int initial, int[] elements, Operator operator) {
		int result = initial;
		for (int element : elements) {
			result = operator.operate(result, element);
		}
		return result;
	}
	/*private static int sum(int[] elements) {
        int sum = 0;
        for (int element : elements) {
            sum += element;
        }
        return sum;
    }
    
    private static int mul(int[] elements) {
        int mul = 1;
        for (int element : elements) {
            mul *= element;
        }
        return mul;
    }
    
    private static int max(int[] elements) {
        int max = Integer.MIN_VALUE;
        for (int element : elements) {
            max = max < element ? element : max;
        }
        return max;
    }
    
    private static int min(int[] elements) {
        int min = Integer.MAX_VALUE;
        for (int element : elements) {
            min = min > element ? element : min;
        }
        return min;
    }*/

}
