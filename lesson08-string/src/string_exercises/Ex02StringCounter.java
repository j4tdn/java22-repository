package string_exercises;

import java.util.Arrays;

public class Ex02StringCounter {

	public static void main(String[] args) {

		String s = "a,b,c,a,a,e,f,e,b";
		String[] elements = s.split(",");
		boolean[] flags = new boolean[elements.length];
		for (int i = 0 ; i < elements.length ; i++) {
			if(!flags[i]) {
				for ( int j = i+ 1 ; j < elements.length; j++) {
					
				}
			}
		}
	}
	
//	public static void existsOne(String s) {
//		String[] ar = new String[s.length()];
//		int count = 0;
//		String[] br = s.split(",");
//		for(String  x : br) {
//			System.out.println(Arrays.toString(br).contains(x));
//		if(x.contains(Arrays.toString(ar))) {
//			continue; 
//		}
//		ar[count++] = x;
		
		//System.out.println(Arrays.toString(ar));
	}


