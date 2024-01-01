package datastructure.array;

import java.util.Arrays;
import java.util.Random;

public class Ex02ArrayStringDemo {
	
	public static void main(String[] args) {
		
		String[] students = {"khsnh", "hvk", "hk", "khx"};
		
		Random rd = new Random();
		
		int k = 3;
		int running = 0;
		String[] pickedStudents = new String[k];
		
		while(true) {
			String temp = students[rd.nextInt(students.length)];
			
			if (isExists(temp, pickedStudents)) {
				continue;
			}
			
			pickedStudents[running++] = temp;
			
			if (running == k) {
				break;    
			}
			
		}
		
		  System.out.println("pickerStudents --> " + Arrays.toString(pickedStudents));
	}
	
	private static boolean isExists(String checkingElement, String[] elements) {
		for (int i = 0; i < elements.length; i++) {
			if (checkingElement.equals(elements[i])) {
				return true;
			}
		}
		return false;
	}

}
