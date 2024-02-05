package Ex05;

import java.util.Arrays;
import java.util.Scanner;

public class NumberLevel {
	
	public static void main(String[] args) {
		int[] arr = input();
		System.out.println("\tDãy số vừa nhập vào");
		System.out.println("\t"+Arrays.toString(arr));
		System.out.println("\tDãy số sau khi sắp xếp");
		int[][] Array = selectionSortByLevel(findNumberLevel(arr), arr.length);
		System.out.print("\t[");
		for(int i=0; i<arr.length ; i++) {
			if(i == arr.length-1)			System.out.print(Array[i][0]);
			else System.out.print(Array[i][0]+",");
		}
		System.out.print("]");
	}
	public static int[][] selectionSortByLevel(int[][] arr ,int Length) {
	    int n = Length;
	    for (int i = 0; i < n - 1; i++) {
	      int minIndex = i;
	      for (int j = i + 1; j < n; j++) {
	        if (arr[j][1] < arr[minIndex][1]) {
	          minIndex = j;
	        }
	      }
	      if (minIndex != i) {
	          int[] temp = arr[i];//temp trỏ đến ô nhớ chứa cả 2 ptu arr[i][0] và arr[i][1]
	          arr[i] = arr[minIndex];
	          arr[minIndex] = temp;
	        }
	    }
	    return arr;
	  }
	public static int[][] findNumberLevel(int[] arr) {
		int[][] result = new int[arr.length][2];
		for(int i = 0; i < arr.length; i++) {
			result[i][0] = arr[i];
			result[i][1] = countDivisors(arr[i]);
		}
		return result;
	}
	public static int countDivisors(int num) {
		int count = 0;
		  for (int i=1; i <= Math.sqrt(num); i++) {
		    if (num % i == 0) {
		      count = count +2;
		      if (i * i == num) {
		        count--; 
		      }
		    }
		  }
		  return count;
	}

	
	public static int[] input() {
		int n;
		Scanner ip = new Scanner(System.in);
		do {

			System.out.println(" Nhập n: ");
			String nStr = ip.nextLine();
			if (isNumber(nStr)) {
				n = Integer.parseInt(nStr);
				if(n>=3&&n<=20)break;
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