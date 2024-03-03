package view;

import java.util.Arrays;

public class Ex06NumberText {
	
	public static void main(String[] args) {
		int[] numbers= {1,5,7,9,2,33,20,17};
	}
    private static int[] fintEvenElements(int[] numbers) {
    	int[] result = new int[numbers.length];
    	int count=0;
    	for(int number:numbers) {
    		if(number%2==0) {
    			result[count++]=number;
    		}
    	}
    	return Arrays.copyOfRange(result, 0, count);
    }
    private static int[] findOddElements(int[] numbers) {
    	int[] result = new int[numbers.length];
    	int count = 0;
    	for (int number: numbers) {
    		if (number%2!=0) {
    			result[count++]=number;
    		}
    	}
    	return Arrays.copyOfRange(result, 0, count);
    }
    
 
    
}
