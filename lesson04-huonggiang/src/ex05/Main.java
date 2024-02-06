package ex05;


	import java.util.Arrays;

	public class Main {
	    public static void main(String[] args) {
	        int[] array = {8, 5, 9, 20}; // Mảng số nguyên đầu vào
	        sortArrayByLevel(array);
	        System.out.println("Mảng sau khi sắp xếp:");
	        for (int num : array) {
	            System.out.print(num + " ");
	        }
	    }

	    // Hàm tính level của một số tự nhiên
	    public static int getLevel(int num) {
	        int count = 0;
	        for (int i = 1; i <= num; i++) {
	            if (num % i == 0) {
	                count++;
	            }
	        }
	        return count;
	    }

	    // Hàm sắp xếp mảng theo thứ tự tăng dần của level
	    public static void sortArrayByLevel(int[] array) {
	        for (int i = 0; i < array.length - 1; i++) {
	            for (int j = 0; j < array.length - 1 - i; j++) {
	                if (getLevel(array[j]) > getLevel(array[j + 1])) {
	                    // Swap
	                    int temp = array[j];
	                    array[j] = array[j + 1];
	                    array[j + 1] = temp;
	                }
	            }
	        }
	
	    }
	}


