package string_excerises;

import java.util.Arrays;

public class Ex02StringCounter {
	
	public static void main(String[] args) {
		String s = "a,b,c,a,a,e,f,e,b";
		
		// viết chương trình in ra các kí tự xuất hiện duy nhất 1 lần trong s
		
		// kết quả: c, f
		String[] elements = s.split(",");
		boolean[] flags = new boolean[elements.length];
		String[] result = new String[elements.length];
		
		int counter = 0;
		for(int i = 0; i < elements.length; i++) {
			if(!flags[i]) { //false
				int dupCounter = 0;
				for(int j = i+1; j < elements.length; j++) {
					if(elements[i].equals(elements[j])) {
						flags[j] = true;
						dupCounter++;
						
					}
				}
				if(dupCounter != 0) {
					flags[i] = true;
				} else {
					result[counter++] = elements[i];
				}
			}
		}
		System.out.println(Arrays.toString(flags));
		System.out.println(Arrays.toString(Arrays.copyOfRange(result,0, counter)));
	}

}
