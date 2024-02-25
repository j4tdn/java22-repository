package ex02;

public class Main02 {
	public static void main(String[] args) {
		int[] numbers = {3, 2, 1, 6, 5};
		int n = numbers.length + 1;
		
		int missingNumber = getMissingNumber(numbers, n);
		 System.out.println("Phần tử cần tìm có giá trị: " + missingNumber);
	}
		public static int getMissingNumber(int[] numbers, int n) {
			boolean[] find = new boolean[n + 1];
	        
	        for (int num : numbers) {
	            find[num] = true;
	        }
	        
	        for (int i = 1; i <= n; i++) {
	            if (!find[i]) {
	                return i;
	            }
	        }
	        return -1;
		}

}
