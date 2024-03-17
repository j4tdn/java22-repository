package Ex02;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		int[] arr = input();
		System.out.println("\tDãy số vừa nhập vào");
		System.out.println(Arrays.toString(arr));
		System.out.println("\tDãy số sau khi sắp xếp");
		System.out.println(Arrays.toString(sortArray(arr,7,5)));
	}

	public static int[] sortArray(int[] arr, int num1, int num2) {
		int[] result = new int[arr.length];
		int[] remainingArray = new int[arr.length];
		int left = 0;
		int counter = 0;
		int right = arr.length;
		
		for(int i=0 ; i< arr.length; i++) {
			if (arr[i]%num1 == 0 && arr[i]%num2!=0) {
				result[left++] = arr[i];
			}
			else remainingArray[counter++] = arr[i];
		}
		for(int i=0 ; i< counter; i++) {
			if (remainingArray[i]%num2 == 0 && remainingArray[i]%num1 != 0) {
				result[--right] = remainingArray[i];
			}
			else result[left++] = remainingArray[i];
		}
		
		return result;
	}
	
	public static int[] input() {
		int n;
		Scanner ip = new Scanner(System.in);
		do {

			System.out.println(" Nhập n: ");
			String nStr = ip.nextLine();
			if (isNumber(nStr)) {
				n = Integer.parseInt(nStr);
				if(n>=5&&n<=100)break;
			}
		}while(true);
		int[] arr = new int[n];
		for(int i=0; i< n ; i++) {
			do {
				System.out.println(" Nhập số thứ "+(i+1)+" :");
				String nStr = ip.nextLine();
				if (isNumber(nStr)) {
					arr[i] = Integer.parseInt(nStr);
					break;
				}
			}while(true);
		}
		return arr;
	}

	private static boolean isNumber(String text) {
		for (int i = 0; i < text.length(); i++) {
			char letter = text.charAt(i);
			if (!Character.isDigit(letter)) {
				return false;
			}
		}
		return true;
	}
}
//(0_0)