package string_exercises;

import java.util.Arrays;

public class Ex02StringCounter {

	
	public static void main(String[] args) {
		
		String s = "a,b,c,a,a,e,x,e,b";
		
		
		String[] elements = s.split(",");
//		String[] arr2 = new String[arr.length];
		
		boolean[] flags = new boolean[elements.length];
		String[] result = new String[elements.length];
		
		int counter = 0;
		for (int i = 0; i < elements.length; i++) {
			if (!flags[i]) {
				int dupCounter = 0;
				for (int j = i + 1; j < elements.length; j++) {
					
					if (elements[i].equals(elements[j])) {
						flags[j] = true;
						dupCounter++;
					}
				}
				
				if (dupCounter != 0) {
					flags[i] = true;
				} else {
					result[counter++] = elements[i];
				}
			}
		}
		System.out.println(Arrays.toString(flags));
		System.out.println("result --> " + Arrays.toString(Arrays.copyOfRange(result, 0, counter)));
		
	}
}
